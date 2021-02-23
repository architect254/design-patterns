package behavioral.command;

public class TvRemote {
    public static ElectronicDevice getDevice(){
        return new Television();
    }
}
