public class BankTransferPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("EFT/Havale ile ödemeniz gerçekleştirildi.");
    }
}
