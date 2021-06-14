import java.util.HashMap;
import java.util.Set;
public class HashMatiqueTest {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Sunburn", "Red, stinging pain. Charred skin.");
        trackList.put("Time Is Running Out", "Rabbit in Alice in wonderland");
        trackList.put("Supermassive Black Hole", "Is it getting bigger? Yes!");
        trackList.put("Knights of Cydonia", "Y'all know this is in your dreams right?");
        
        System.out.println("This is your track: " + trackList.get("Sunburn"));

        Set<String> tracks = trackList.keySet();
        for(String track : tracks) {
            System.out.println(track + ": " + trackList.get(track)); //pulls the Key : pulls the value
        }
    }
}
