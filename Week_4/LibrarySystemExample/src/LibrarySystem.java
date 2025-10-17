// LibrarySystem.java
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class LibrarySystem implements IManageable {
    private List<LibraryItem> items;
    private List<LibraryMember> members;
    private List<BorrowTransaction> transactions;

    public LibrarySystem() {
        items = new ArrayList<>();
        members = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // --- IManageable Interface Uygulamaları ---
    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("✅ " + item.getTitle() + " eklendi.");
    }

    @Override
    public void removeItem(String title) {
        items.removeIf(item -> item.getTitle().equalsIgnoreCase(title));
        System.out.println("❌ " + title + " kaldırıldı.");
    }

    @Override
    public void listItems() {
        System.out.println("\n📚 Kütüphane Envanteri:");
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }

    // --- Üye Yönetimi ---
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("👤 Üye eklendi: " + member.getFullName());
    }

    public void listMembers() {
        System.out.println("\n👥 Üye Listesi:");
        for (LibraryMember m : members) {
            m.displayPersonInfo();
        }
    }

    // --- Ödünç / İade İşlemleri ---
    public void borrowBook(String title, String memberId) {
        Book selectedBook = null;
        LibraryMember selectedMember = null;

        for (LibraryItem item : items) {
            if (item instanceof Book && item.getTitle().equalsIgnoreCase(title)) {
                selectedBook = (Book) item;
                break;
            }
        }

        for (LibraryMember m : members) {
            if (m.getMemberId().equalsIgnoreCase(memberId)) {
                selectedMember = m;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("🚫 Kitap bulunamadı: " + title);
            return;
        }

        if (selectedMember == null) {
            System.out.println("🚫 Üye bulunamadı: " + memberId);
            return;
        }

        if (selectedBook.isBorrowed()) {
            System.out.println("⚠️ Kitap zaten ödünç alınmış.");
            return;
        }

        selectedBook.borrowBook();
        BorrowTransaction t = new BorrowTransaction(selectedBook, selectedMember, LocalDate.now());
        transactions.add(t);
        System.out.println("📖 " + selectedBook.getTitle() + " kitabı " + selectedMember.getFullName() + " tarafından ödünç alındı.");
    }

    public void returnBook(String title) {
        for (BorrowTransaction t : transactions) {
            if (t.getBook().getTitle().equalsIgnoreCase(title) && t.getBook().isBorrowed()) {
                t.getBook().returnBook();
                t.setReturnDate(LocalDate.now());
                System.out.println("✅ " + title + " iade edildi.");
                return;
            }
        }
        System.out.println("🚫 İade edilecek kitap bulunamadı.");
    }

    public void listTransactions() {
        System.out.println("\n📜 Ödünç İşlemleri:");
        for (BorrowTransaction t : transactions) {
            t.displayTransactionInfo();
        }
    }
}