import annotations.CC;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

public class GuiceMain {

    public static void main(String[] args) {
    /*
     * Guice.createInjector() takes your Modules, and returns a new Injector
     * instance. Most applications will call this method exactly once, in their
     * main() method.
     */
        Injector injector = Guice.createInjector(new BillingModule());

        // use injector to get objects
        BillingService billingService = injector.getInstance(BillingService.class);
        System.out.println(billingService);

//        CardProcessor cp =  injector.getInstance(Key.get(CardProcessor.class));
//        System.out.println("card processor is : "+cp.getClass().getName());

        BillingService billingService1 = injector.getInstance(BillingService.class);
        System.out.println(billingService1  );

        Order order = new Order("demo-item", 500.00);

        Card card = new Card("demo-card-number");

        Receipt receipt = billingService.chargeOrder(order, card);

        System.out.println( receipt.getReceiptMessage());
    }
}
