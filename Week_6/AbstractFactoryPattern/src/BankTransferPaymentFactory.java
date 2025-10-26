public class BankTransferPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}
