package structural.composite;

// allows you to treat individual objects and compositions of objects uniformly
// They allow you to represent part-whole hierarchies

public class DriverCode {
    public static void main(String[] args) {

        SongComponent industrialMusic = new SongGroup("Industrial", "just some industrial music");
        SongComponent heavyMetalMusic = new SongGroup("\nHeavy Metal", "Heavy Metal Sh*t");
        SongComponent dubstepMusic = new SongGroup("\nDubstep", "Dope dubstep music");

        SongComponent everySong = new SongGroup("Song list", "every song available");

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head like a hole", "NIN", 1999));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(dubstepMusic);
        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey crazylarry = new DiscJockey(everySong);
        crazylarry.getSongList();

    }
}
