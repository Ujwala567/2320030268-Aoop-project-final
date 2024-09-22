package Music;
import java.util.*;
public class MusicLibrary implements Iterable<Song>{
	 private List<Song> songs;
	 public MusicLibrary() {
	 songs = new ArrayList<>();
	}
	 public void addSong(Song song) {
	        songs.add(song);
	    }
	 public void removeSong(Song song) {
	        songs.remove(song);
	    }
	 public void sort(Comparator<Song> comparator) {
	        songs.sort(comparator);
	    }
	 public Iterator<Song> iterator() {
	        return songs.iterator();
	    }

	    public void printSongs() {
	        for (Song song : songs) {
	            System.out.println(song);
	        }
	    }
		public Object sort(LengthComparator comparator) {
			return null;
		}
			
		}

