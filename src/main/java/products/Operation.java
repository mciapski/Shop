package products;

public interface Operation {
  void addItemToStorage(Product product);
  void removeItemFromStorage(Product product);
  Product createProduct ();
  void showAllProducts();
  void modifyAddAmountOfProduct(Product product, int amount);
  void modifyRemoveAmountOfProduct(Product product, int amount);
  void changePriceValue(Product product, double price);
}
