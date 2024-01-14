package ProjectShopOnline.model;

import ProjectShopOnline.entity.Product;

public class InStoreOrderModel implements Order {
    private Product product;
    private int quantity;

    public InStoreOrderModel(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public double calculateTotalCost() {
        return product.getPrice() * quantity;
    }
}
