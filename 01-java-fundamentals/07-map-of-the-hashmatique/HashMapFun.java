import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("christmas tree", "oh christmas tree, how lovely are your branches");
        trackList.put("jingle bells", "jingle bells, jingle bells, jingle alls the way");
        trackList.put("feliz navidad", "feliz navidad, prospero ano felicidad");
        trackList.put("two pina colads", "One for each hand");

        String name = trackList.get("feliz navidad");

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.printf("track: %s Lyrics: %s%n", key, trackList.get(key));
        }
    }
}