package Music;

public  class Song implements Comparable<Song>,Cloneable {
	private String title;
    private String artist;
    private double length;
    private String other;
	public Song(String title, String artist, double length) {
		this.title = title;
        this.artist = artist;
        this.length = length;
	}
	public static Song createSong(String title, String artist, double length) {
        return new Song(title, artist, length);
    }
	public String getTitle() { 
		return title; 
		}
    public String getArtist() {
    	return artist;
    	}
    public double getLength() { 
    	return length;
    	}
    public int compareTo(Song other) {
        return this.artist.compareTo(other.artist);
    }
    public Song clone() {
        try {
            return (Song) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String toString() {
        return "Song [Title=" + title + ", Artist=" + artist + ", Length=" + length + "]";
    }
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
}