package behavioral.observer;

// type that can be perceived
public interface Subject {
    void notifyObservers();

    void register(Observer o);

    void unregister(Observer o);

}
