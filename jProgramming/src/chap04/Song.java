package chap04;

/*
 * Song Class 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Song {
	String title;
	String artist;
	String album;
	String composer[];
	int year;
	int track;

	public Song() {
	}

	public Song(String title, String artist, String album, String[] composer,
			int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println("Title: " + title);
		System.out.println("artist: " + artist);
		System.out.println("album: " + album);
		System.out.print("Composer: ");

		for (int i = 0; i < composer.length; i++) {
			System.out.print(composer[i] + " ");
		}

		System.out.println("\nYear: " + year);
		System.out.println("Track: " + track);
	}

}
