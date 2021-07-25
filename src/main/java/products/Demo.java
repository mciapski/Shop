package products;

public class Demo {
  public static void main(String[] args) {


    OperationImplements truskawa = new OperationImplements();
    Product product = new Product.ProductBuilder()
        .name("Truskawka")
        .id_product(1)
        .price(5)
        .amount(1)
        .weight(1)
        .categories(Categories.Fruit)
        .build();

    truskawa.addItemToStorage(product,1);
    truskawa.addItemToStorage(product,1);

    truskawa.showAllProducts();
  }
}
