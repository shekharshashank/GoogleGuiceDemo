import annotations.CC;
import com.google.inject.Inject;
import com.google.inject.name.Named;


/**
 * Real billing service implementation
 */

public class BillingServiceImpl implements BillingService {

    private CardProcessor cardProcessor;
    private static final String str ="Credit";

    /**
     * @param cardProcessor cardProcessor
     *
     */

    @Inject
    public void BillingServiceImplabc(  CardProcessor cardProcessor) {
        this.cardProcessor = cardProcessor;
    }


    public CardProcessor getCardProcessor() {
        return cardProcessor;
    }

    public Receipt chargeOrder(Order order, Card card) {
        try {
            ChargeResult result = cardProcessor.charge(card, order.getAmount());
            System.out.println(cardProcessor.getClass().getName());
            return  Receipt.forSuccessfulPayment(order.getAmount());
        } catch (RuntimeException e) {
            return Receipt.forFailedPayment(order.getAmount());
        }
    }

}
