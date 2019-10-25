import com.google.inject.ImplementedBy;

/**
 * Billing Service.
 */
@ImplementedBy(BillingServiceImpl.class)
public interface BillingService {

    /**
     *
     * @param order order
     * @param Card card
     * @return Receipt
     */
    Receipt chargeOrder(Order order, Card card);
}
