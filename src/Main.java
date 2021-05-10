import adapters.MernisServiceAdapter;
import business.abstracts.CustomerService;
import business.abstracts.DiscountService;
import business.abstracts.GameProductService;
import business.abstracts.OrderService;
import business.concretes.CustomerManager;
import business.concretes.DiscountManager;
import business.concretes.GameProductManager;
import business.concretes.OrderManager;
import dataAccess.concretes.oracle.OracleCustomerDao;
import dataAccess.concretes.oracle.OracleDiscountDao;
import dataAccess.concretes.oracle.OracleGameProductDao;
import dataAccess.concretes.oracle.OracleOrderDao;
import entities.concretes.Customer;
import entities.concretes.Discount;
import entities.concretes.GameProduct;
import entities.concretes.Order;
import org.apache.log4j.BasicConfigurator;

public class Main {

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        CustomerService customerService = new CustomerManager(new OracleCustomerDao(),new MernisServiceAdapter());
        Customer muhammed = new Customer(1, "NEXUS", "muhammed", "Emen", 1995, "36382568754");
        customerService.add(muhammed);

        GameProductService gameProductService = new GameProductManager(new OracleGameProductDao());

        DiscountService discountService = new DiscountManager(new OracleDiscountDao());

        Discount witcherSale = new Discount(1, 1, true, 15);
        discountService.add(witcherSale);

        GameProduct witcherGame = new GameProduct(1, "Witcher", 25);
        gameProductService.add(witcherGame);


        Order order1 = new Order(1, witcherGame.getId(), muhammed.getId());

        OrderService orderService = new OrderManager(new OracleOrderDao());
        orderService.add(order1,muhammed,witcherGame,witcherSale);


    }
}
