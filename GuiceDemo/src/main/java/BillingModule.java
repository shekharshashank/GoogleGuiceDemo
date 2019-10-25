import annotations.CC;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import java.util.Calendar;


public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CardProcessor.class).to(DebitCardProcessor.class);
//        bind(CardProcessor.class).to(CreditCardProcessor.class);
//        bind(CardProcessor.class).annotatedWith(CC.class).to(CreditCardProcessor.class).in(Singleton.class);
//        bind(CardProcessor.class).annotatedWith(Names.named("Credit")).to(CreditCardProcessor.class);
//        bind(CardProcessor.class).annotatedWith(Names.named("Debit")).to(DebitCardProcessor.class);
        bind(BillingService.class).to(BillingServiceImpl.class).in(Singleton.class);


        //  custom binding with some logic
//        bind(CardProcessor.class).toProvider(new Provider<CardProcessor>() {
//            @Override
//            public CardProcessor get() {
//                if(Calendar.getInstance().getTimeInMillis()%2==0){
//                    return new DebitCardProcessor();
//                }else{
//                    return  new CreditCardProcessor();
//                }
//            }
//        });
    }




//    @Provides
//    @Singleton
//    public BillingService getBillingService(@CC CardProcessor cp) {
//        return new BillingServiceImpl(cp);
//    }


}
