package ejercicio1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Playlist {
	private List<Song> songsList;
	
	public Playlist() {
		this.songsList = new ArrayList<Song>();
	}

	public void addSong(String songName, String album, String autor , LocalTime duracion) { //Adds a song to the arraylist
		Song s = new Song(songName, album, autor , duracion);
		this.songsList.add(s);
		}
	
	public Stream converToStream() { //Returns a Stream of the arraylist sorted by natural order ob Songs.
		Stream s = this.songsList.stream();
		s.sorted();
		return s;
	}
}