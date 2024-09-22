package Music;
import java.util.Comparator;
public class LengthComparator implements Comparator<Song> {
	public int compare(Song s1, Song s2) {
        return Double.compare(s1.getLength(), s2.getLength());
    }

}
