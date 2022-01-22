package behavioral.memento;

import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;

public class MementoTest extends JFrame {
    private JButton saveBut, undoBut, redoBut;
    private JTextArea theArticle = new JTextArea(40, 60);

    CareTaker careTaker = new CareTaker();

    Originator originator = new Originator();

    int saveFiles = 0, currentMemento = 0;

    public MementoTest() {
        this.setSize(750, 780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();

        panel1.add(new JLabel("Article"));
        panel1.add(theArticle);

        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();

        saveBut = new JButton("Save");
        saveBut.addActionListener(saveListener);

        undoBut = new JButton("Undo");
        undoBut.addActionListener(undoListener);

        redoBut = new JButton("Redo");
        redoBut.addActionListener(redoListener);

        panel1.add(saveBut);
        panel1.add(undoBut);
        panel1.add(redoBut);

        this.add(panel1);
        this.setVisible(true);

    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == saveBut) {
                String textInTextArea = theArticle.getText();

                originator.set(textInTextArea);

                careTaker.addMemento(originator.storeInMemento());

                saveFiles++;
                currentMemento++;

                System.out.println("Save Files " + saveFiles);

                undoBut.setEnabled(true);
            } else if (event.getSource() == undoBut) {
                if (currentMemento >= 1) {
                    currentMemento--;
                    String textBoxString = originator.restoreFromMemento(careTaker.getMemento(currentMemento));
                    theArticle.setText(textBoxString);
                    redoBut.setEnabled(true);
                } else {
                    undoBut.setEnabled(false);
                }
            } else if (event.getSource() == redoBut) {
                if ((saveFiles - 1) > currentMemento) {
                    currentMemento++;
                    String textBoxString = originator.restoreFromMemento(careTaker.getMemento(currentMemento));
                    theArticle.setText(textBoxString);
                    undoBut.setEnabled(true);
                } else {
                    redoBut.setEnabled(false);
                }
            }

        }

    }
}
