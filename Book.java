public abstract class Book {
    protected String title;
    protected String author;
    protected String ISBN;
    protected boolean isCheckedOut;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        this.isCheckedOut = true;
    }

    public void returnBook() {
        this.isCheckedOut = false;
    }

    public abstract String describe(); // Will be overridden in derived classes
}
