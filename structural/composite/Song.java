package structural.composite;

public class Song extends SongComponent {
    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongName, String newBandName, int newYearReleased) {
        songName = newSongName;
        bandName = newBandName;
        releaseYear = newYearReleased;
    }

    public void displaySongInfo() {
        System.out.println(songName + " was recorded by " + bandName + " in " + releaseYear);
    }
}
