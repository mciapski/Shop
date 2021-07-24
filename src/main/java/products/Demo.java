package products;

public class Demo {
  public static void main(String[] args) {
    OperationImplements truskawa = new OperationImplements();

    truskawa.addItemToStorage(new Product.ProductBuilder().name("Truskawka").price(5).amount(1).id_product(1).categories(Categories.Fruit).build(),
        5);
    truskawa.showAllProducts();
    truskawa.addItemToStorage(new Product.ProductBuilder().name("Banan").price(5).amount(1).id_product(1).categories(Categories.Fruit).build(),
        5);
    truskawa.showAllProducts();
  }
}
