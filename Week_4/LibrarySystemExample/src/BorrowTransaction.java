// BorrowTransaction.java
import java.time.LocalDate;

public class BorrowTransaction {
    private Book book;
    private LibraryMember member;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowTransaction(Book book, LibraryMember member, LocalDate borrowDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public LibraryMember getMember() {
        return member;
    }

    public void displayTransactionInfo() {
        System.out.println("🔖 Ödünç: " + member.getFullName() +
                " | Kitap: " + book.getTitle() +
                " | Alış Tarihi: " + borrowDate +
                (returnDate != null ? " | İade Tarihi: " + returnDate : " | Henüz iade edilmedi"));
    }
}