package products;

import java.util.ArrayList;
import java.util.List;

public class OperationImplements implements Operation{

  List<Product> resultList = new ArrayList<>();

  @Override
  public void addItemToStorage(Product product, int amount) {
    if(resultList.contains(product)) {
      System.out.println("Jest już na liście");
      product.setAmount(product.getAmount()+amount);
    }else {
      resultList.add(product);
    }


  }

  @Override
  public void removeItemFromStorage(Product product, int amount) {
    if(resultList.contains(product)) {
      System.out.println("Jest już na liście");
    }else {
      resultList.add(product);
    }
  }

  @Override
  public void showAllProducts() {
    System.out.println(resultList);
  }
}
