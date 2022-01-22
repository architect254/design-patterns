package behavioral.memento;

public class Originator {
    private String article;

    public void set(String newArticle) {
        System.out.println("From Originator: Current version of article\n" + newArticle + "]n");
        article = newArticle;
    }

    public Memento storeInMemento() {
        System.out.println("From Originator: Saving to Memento");
        return new Memento(article);
    }

    public String restoreFromMemento(Memento memento) {
        article = memento.getSavedArticle();
        System.out.println("From Originator: Previous article saved in Memento\n" + article + "\n");
        return article;
    }
}
