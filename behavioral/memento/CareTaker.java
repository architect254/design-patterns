package behavioral.memento;

import java.util.ArrayList;

public class CareTaker {
    ArrayList<Memento> savedMementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        savedMementos.add(memento);
    }

    public Memento getMemento(int index) {
        return savedMementos.get(index);
    }
}