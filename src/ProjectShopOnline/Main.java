package ProjectShopOnline;

import ProjectShopOnline.controller.ShopController;
import ProjectShopOnline.controller.StartController;
import ProjectShopOnline.model.DeliveryOrderModel;
import ProjectShopOnline.model.InStoreOrderModel;
import ProjectShopOnline.model.Order;
import ProjectShopOnline.entity.Product;
import ProjectShopOnline.view.ConsoleShopView;
import ProjectShopOnline.view.ShopView;

public class Main {
    public static void main(String[] args) {
        new StartController().getStart();
    }

}
