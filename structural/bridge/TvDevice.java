package structural.bridge;

public class TvDevice extends EntertainmentDevice {

    public TvDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        deviceState--;
        System.out.println("Channel Down");

    }

    @Override
    public void buttonSixPressed() {
        deviceState++;
        System.out.println("Channel Up");
    }

}
 