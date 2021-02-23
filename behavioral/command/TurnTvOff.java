package behavioral.command;

public class TurnTvOff implements Command {
    ElectronicDevice theDevice;

    public TurnTvOff(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();

    }

    @Override
    public void undo() {
        theDevice.on();

    }

}
