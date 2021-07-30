package com.JenelleHanson.TaskManager.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JenelleHanson.TaskManager.models.Task;
import com.JenelleHanson.TaskManager.services.TaskService;
import com.JenelleHanson.TaskManager.services.UserService;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	private TaskService tService;

	@Autowired
	private UserService uService;
	
	@GetMapping("")
	private String index(Model model, @ModelAttribute("task") Task task, HttpSession session) {
		model.addAttribute("user", this.uService.findOneUser((Long)session.getAttribute("user__id")));
		model.addAttribute("allTasks", this.tService.allTasks());
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newPage(Model model, @ModelAttribute("task") Task task) {
		model.addAttribute("allTasks", this.tService.allTasks());
		return "new.jsp";
	}
	
	@PostMapping("/new")
	private String NewTask(@Valid @ModelAttribute("task") Task task, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors()) {
			model.addAttribute("user", this.uService.findOneUser((Long)session.getAttribute("user__id")));
			model.addAttribute("allTasks", this.tService.allTasks());
			return "new.jsp";
		}
		this.tService.createTask(task);
		return "redirect:/tasks";
	}
	
	@GetMapping("/{id}")
	public String show(@PathVariable("id") Long id, Model model, HttpSession session) {
		model.addAttribute("thisTask", this.tService.getOneTask(id));
		model.addAttribute("user", this.uService.findOneUser((Long)session.getAttribute("user__id")));
		return "task.jsp";
	}
	
	@GetMapping("/{id}/edit")
	public String editTask(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisTask", this.tService.getOneTask(id));
		return "edit.jsp";
	}
	
	//put must have an input hidden method on the edit jsp page and the hidden method true in the app/properties page
	@PutMapping("/{id}/edit") //can use a post mapping looks similar to earlier one
	public String editTask(@Valid @ModelAttribute("task") Task task, BindingResult result, Model model, @PathVariable("id") Long id, HttpSession session) {
		if(result.hasErrors()) {
			model.addAttribute("user", this.uService.findOneUser((Long)session.getAttribute("user__id")));
			model.addAttribute("thisTask", this.tService.getOneTask(id));
			return "edit.jsp";
		}
		this.tService.updateTask(task);
		return "redirect:/tasks/{id}";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteTask(@PathVariable("id") Long id) {
		this.tService.deleteTask(id);
		return "redirect:/tasks";
	}
}
