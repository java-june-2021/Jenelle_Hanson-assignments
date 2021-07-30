package com.JenelleHanson.TaskManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.TaskManager.models.Task;
import com.JenelleHanson.TaskManager.repositories.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository tRepo;
	
	public List<Task> allTasks(){
		return this.tRepo.findAll();
	}

	public Task getOneTask(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	
	public Task createTask(Task task) {
		return this.tRepo.save(task);
	}
	
	public Task updateTask(Task task) {
		return this.tRepo.save(task);
	}
	
	public void deleteTask(Long id) {
		this.tRepo.deleteById(id);
	}
}
