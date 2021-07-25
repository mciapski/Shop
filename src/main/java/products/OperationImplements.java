package products;

import java.util.ArrayList;
import java.util.List;

public class OperationImplements implements Operation{

  List<Product> resultList = new ArrayList<>();

  @Override
  public void addItemToStorage(Product product, int amount) {

    if(resultList.contains(product)) {
      product.setAmount(product.getAmount()+amount);
      //Mnoży przez wagę ilość
      product.setWeight(product.getAmount()* product.getWeight());
      System.out.println("Jest już na liście");
    }else{
      product.setAmount(product.getAmount()+amount);
      //Mnoży przez wagę ilość
      product.setWeight(product.getAmount()* product.getWeight());
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
    StringBuilder sb = new StringBuilder();
    for (Product product: resultList) {
      sb.append("Name:").append(product.getName()).
         append(" Amount:").append(product.getAmount())
          .append(" Weight:").append(product.getWeight())
          .append(" Price:").append(product.getPrice()).append("\n");
    }
    System.out.println(sb);
  }
}
