package ProjectShopOnline.controller;

import ProjectShopOnline.entity.Product;
import ProjectShopOnline.model.DeliveryOrderModel;
import ProjectShopOnline.model.InStoreOrderModel;
import ProjectShopOnline.model.Order;
import ProjectShopOnline.view.ConsoleShopView;
import ProjectShopOnline.view.ShopView;

public class StartController {
    public static void getStart(){
        Product laptop = new Product("Laptop", 15000.0);


        ShopView consoleView = new ConsoleShopView();
        consoleView.displayWelcomeMessage();
        ShopController controller = new ShopController(consoleView);

        int inStoreQuantity = ((ConsoleShopView) consoleView).getInputQuantity();
        Order inStoreOrder = new InStoreOrderModel(laptop, inStoreQuantity);

        boolean deliveryOption = ((ConsoleShopView) consoleView).getDeliveryOption();
        Order deliveryOrder = new DeliveryOrderModel(laptop, 1, deliveryOption);

        controller.processOrder(inStoreOrder);
        controller.processOrder(deliveryOrder);
    }
}
