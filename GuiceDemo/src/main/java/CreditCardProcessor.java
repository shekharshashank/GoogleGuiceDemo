
public class CreditCardProcessor implements CardProcessor {

    @Override
    public ChargeResult charge(Card creditCard, Double amount) {

        // amount debit logic from credit card

        return new ChargeResult(amount);
    }
}
