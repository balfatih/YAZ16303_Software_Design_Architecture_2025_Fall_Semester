// LibraryMember.java
public class LibraryMember extends Person {
    private String memberId;

    public LibraryMember(String name, String surname, String memberId) {
        super(name, surname);
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public void displayPersonInfo() {
        System.out.println("👤 Üye: " + getFullName() + " | ID: " + memberId);
    }
}