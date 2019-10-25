
public class Receipt {

    private String receiptMessage;

    public Receipt(String receiptMessage) {
        this.receiptMessage = receiptMessage;
    }

    public String getReceiptMessage() {
        return receiptMessage;
    }

    public static Receipt forSuccessfulPayment(Double amount) {
        return new Receipt("Receipt: Received " + amount);
    }

    public static Receipt forFailedPayment(Double amount) {
        return new Receipt("Receipt: Something is not right with the transaction of amount  " + amount);
    }

}
