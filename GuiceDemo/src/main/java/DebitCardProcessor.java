public class DebitCardProcessor implements CardProcessor {
    @Override
    public ChargeResult charge(Card debitCard, Double amount) {
        // Bank debits the amount from account

        return new ChargeResult(amount);
    }

}
