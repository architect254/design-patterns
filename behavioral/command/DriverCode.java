package behavioral.command;

import java.util.ArrayList;
import java.util.List;

// an object is used to represent and encapsulate all the information needed to call a method at a later time
// this information includes the method name, the object that owns the method and values for the method parameters
// allows you to store lists of code that is executed at a later time or many times
// client says I want a specific command to run when execute() is called on 1 of these encapsulated (hidden) Objects
// an object called the invoker transfers this command to another Object called a Receiver to execute the right code
// TurnTvOn - DeviceButton - TurnTvOn - Television.TurnTvOn()
// a class is a good place to store procedures you want to be executed
// you can store multiple commands in a class to use over and over
// you can implement undo procedures for past comands
// Negative: you can create many small classes that store lists of commands 
public class DriverCode {

    public static void main(String[] args) {
        ElectronicDevice newDevice = TvRemote.getDevice();
        TurnTvOn onCommand = new TurnTvOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();
        // ----------------------------------------------------

        TurnTvOff offCommand = new TurnTvOff(newDevice);
        DeviceButton offPressed = new DeviceButton(offCommand);

        offPressed.press();

        // -----------------------------------------------------

        TurnTvUp volUpCommand = new TurnTvUp(newDevice);
        DeviceButton volUpPressed = new DeviceButton(volUpCommand);

        volUpPressed.press();
        volUpPressed.press();
        volUpPressed.press();

        // -------------------------------------------------------

        Television theTv = new Television();
        Radio theRadio = new Radio();
        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theTv);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();

        //...........................................................
        turnThemOff.pressUndo();

    }

}
