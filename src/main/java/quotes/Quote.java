package quotes;

public class Quote {
    String[] tags;
    String author;
    String likes;
    String text;

    @Override
    public String toString() {
        return String.format(this.author + " quoted " + this.text);
    }
}

//create constructor for only Ron... author = "Ron Swanson"
