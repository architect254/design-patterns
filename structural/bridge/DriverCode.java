package structural.bridge;

// used to decouple an abstraction from its implementation so that the two can vary independently
// progressively add functionality while separating out major differences using abstract classes 
// use when you watn to change both the abstractions(abstract classes) and concrete classes independently
// the concrete class adds additional rules
public class DriverCode {
    public static void main(String[] args) {
        RemoteButton theTvMuteButton = new TvRemoteMute(new TvDevice(1, 200));
        RemoteButton theTvPauseButton = new TvRemotePause(new TvDevice(1, 200));
        System.out.println("Test TV with Mute");

        theTvMuteButton.buttonFivePressed();
        theTvMuteButton.buttonSixPressed();
        theTvMuteButton.buttonNinePressed();

        System.out.println("Test TV with Pause");

        theTvPauseButton.buttonFivePressed();
        theTvPauseButton.buttonSixPressed();
        theTvPauseButton.buttonNinePressed();
    }
}
