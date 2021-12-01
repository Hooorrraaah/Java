import java.util.HashMap;
import java.util.Set;

public class Hasmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song1", "This is the song that never ends...");
        trackList.put("Song2", "It goes on and on my friend");
        trackList.put("Song3", "Some extra lyrics go here");
        trackList.put("Song4", "Wow now this is a good song");         

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}