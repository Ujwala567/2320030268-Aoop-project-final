package Music;
public class Main {

	public static void main(String[] args) { 
		MusicLibrary library = new MusicLibrary();
		    Song song1 = Song.createSong("Shape of You", "Ed Sheeran", 4.24);
	        Song song2 = Song.createSong("Blinding Lights", "The Weeknd", 3.22);
	        Song song3 = Song.createSong("Bohemian Rhapsody", "Queen", 5.55);
	        library.addSong(song1);
	        library.addSong(song2);
	        library.addSong(song3);
	        System.out.println("Original List:");
	        library.printSongs();
	        System.out.println("\nSorted by Artist:");
	        library.sort(new ArtistComparator());
	        library.printSongs();
	        System.out.println("\nSorted by Length:");
	        library.sort(new LengthComparator());
	        library.printSongs();
    }
	}
