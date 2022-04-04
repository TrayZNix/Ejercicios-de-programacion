package ejercicio1;

import java.time.LocalTime;
import java.util.Objects;

public class Song implements Comparable<Song> {
	//Attributes
	private String songName;
	private String album;
	private String author;
	private LocalTime duration;
	
	//Constructor
	public Song(String songName, String album, String author, LocalTime duration) {
		super();
		this.songName = songName;
		this.album = album;
		this.author = author;
		this.duration = duration;
	}
	
	//GETTERS, SETERS, ...
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Songs [songName=" + songName + ", album=" + album + ", author=" + author + ", duration=" + duration
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(album, author, duration, songName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(album, other.album) && Objects.equals(author, other.author)
				&& Objects.equals(duration, other.duration) && Objects.equals(songName, other.songName);
	}

	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return -(this.getSongName().compareToIgnoreCase(o.getSongName()));
	}
	
	
	
}
