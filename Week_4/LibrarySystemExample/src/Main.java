// Main.java
public class Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        // Kitaplar
        Book b1 = new Book("Yapay Zeka", "Fatih Bal", 2023);
        Book b2 = new Book("Derin Öğrenme", "Ian Goodfellow", 2016);
        Book b3 = new Book("Makine Öğrenmesi", "Tom Mitchell", 1997);

        library.addItem(b1);
        library.addItem(b2);
        library.addItem(b3);

        // Üyeler
        LibraryMember m1 = new LibraryMember("Ayşe", "Yılmaz", "M001");
        LibraryMember m2 = new LibraryMember("Ali", "Can", "M002");

        library.addMember(m1);
        library.addMember(m2);

        // Listeleme
        library.listItems();
        library.listMembers();

        // Ödünç / İade işlemleri
        library.borrowBook("Yapay Zeka", "M001");
        library.borrowBook("Derin Öğrenme", "M002");

        library.listTransactions();
        library.returnBook("Yapay Zeka");

        library.listTransactions();
        library.listItems();
    }
}