import com.mycompany.learntocode.AccountStatus;
import com.mycompany.learntocode.DiscountManager;
import com.mycompany.learntocode.discounts.DefaultLoyaltyDiscountCalculator;
import com.mycompany.learntocode.factory.DefaultAccountDiscountCalculatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static {
        /**
         * In a real system this would be parsed as an argument when starting your java program.
         *
         * You can configure this with IntelliJ and remove this line. Goggle it.
         *
         * The variable logback.configurationFile is defined by the logging library.
         */
        System.setProperty("logback.configurationFile", "/my-logback-file.xml");
    }

    /**
     * This Main method is an example of how you could use the code as a part of a wider system. This is not a replacement
     * for tests and production code should not have random Main method classes such as this one!
     *
     * @param args program args
     */
    public static void main(String[] args) {
        logger.info("logback configured to log here!");

        DiscountManager discountManager = new DiscountManager(new DefaultAccountDiscountCalculatorFactory(),
                new DefaultLoyaltyDiscountCalculator());

        double price = discountManager.applyDiscount(100.12, AccountStatus.MostValuableCustomer, 5);

        logger.info("{}", price);
    }
}
