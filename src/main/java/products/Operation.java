package products;

public interface Operation {
  void addItemToStorage(Product product, int amount);
  void removeItemFromStorage(Product product, int amount);
  void showAllProducts();
}
