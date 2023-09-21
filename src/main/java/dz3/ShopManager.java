package dz3;

public class ShopManager {
    public double purchaseProduct(int productId, int quantity) throws ProductNotFoundException, InsufficientQuantityException {
        Product product = ProductDatabase.getProduct(productId);
        if (product == null) {
            throw new ProductNotFoundException();
        }
        if (product.getAvailableQuantity() < quantity) {
            throw new InsufficientQuantityException();
        }
        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}