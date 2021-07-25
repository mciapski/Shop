package products;

public class Demo {
  public static void main(String[] args) {


    OperationImplements truskawa = new OperationImplements();
    Product product = truskawa.createProduct();
    //   truskawa.addItemToStorage(truskawa.createProduct(), 5);

//  truskawa.addItemToStorage(truskawa.createProduct(), 1);
//  truskawa.addItemToStorage(truskawa.createProduct(), 1);
//  truskawa.removeItemFromStorage(truskawa.createProduct());
    truskawa.addItemToStorage(product);
    //System.out.println(truskawa.listOfFruits);
    truskawa.showAllProducts();
  }
}
