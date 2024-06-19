package persistence;

public enum EnumBook {
    THE_HOBBIT(1, "The Hobbit", "J.R.R. Tolkien"),
    TO_KILL_A_MOCKINGBIRD(2, "To Kill a Mockingbird", "Harper Lee"),
    HARRY_POTTER(3, "Harry Potter", "J.K. Rowling");
    private final int id;
    private final String author, title;

    EnumBook(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
