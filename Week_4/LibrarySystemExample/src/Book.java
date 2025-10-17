// Book.java
public class Book extends LibraryItem {
    private boolean isBorrowed;

    public Book(String title, String author, int year) {
        super(title, author, year);
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("📘 Kitap: " + getTitle() + " | Durum: " +
                (isBorrowed ? "Ödünç alındı" : "Mevcut"));
    }
}