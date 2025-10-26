public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Kredi kartı ile ödemeniz gerçekleştirildi.");
    }
}
