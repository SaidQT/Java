import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Atlantis","The birds have left the trees, the light bores onto me");
		trackList.put("Past lives","Past lives couldn't ever hold me down");
		trackList.put("Mary on a cross","We were speeding together");
		trackList.put("Love the way you lie","Just gonna stand there and watch me burn");

	String song1= trackList.get("Atlantis");
	System.out.println(song1);
			Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.format("%s: %s\n", key, trackList.get(key));
	}
}
}
