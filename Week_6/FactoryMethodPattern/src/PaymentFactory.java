public class PaymentFactory {

    public Payment createPayment(String paymentType){

        if (paymentType.equalsIgnoreCase("BankTransfer")){
            return new BankTransferPayment();
        }else if (paymentType.equalsIgnoreCase("CreditCard")){
            return new CreditCardPayment();
        }

        return null;

    }


}
