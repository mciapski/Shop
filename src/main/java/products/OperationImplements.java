package products;

import net.bytebuddy.matcher.IsNamedMatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperationImplements implements Operation{

  List<Product> listOfVegetables = new ArrayList<>();
  List<Product> listOfFruits = new ArrayList<>();

  @Override
  public void addItemToStorage(Product product) {

if(product.getCategories().equals(Categories.Fruit)){
  if(listOfFruits.contains(product)){
    System.out.println("Produkt " + product.getName() + " jest już na liście");
  }else {
    listOfFruits.add(product);
    System.out.println("Produkt " + product.getName() + " został dodany");
  }
}else {
  if(listOfVegetables.contains(product)){
    System.out.println("Produkt " + product.getName() + " jest już na liście");
  }else {
    listOfVegetables.add(product);
    System.out.println("Produkt " + product.getName() + " został dodany");
  }
}


  }

  @Override
  public void removeItemFromStorage(Product product) {

  }

//  @Override
//  public void removeItemFromStorage(Product product) {
//    if(resultList.contains(product)) {
//      System.out.println("Produkt: " + product.getName()+ " został usunięty");
//      resultList.remove(product);
//    }else {
//      System.out.println("Podany produkt nie istnieje");
//    }
//  }

  public Categories categoryChoice(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wybierz kategorię: " +
        "1: owoc czy " +
        "2: warzywo");

    Integer wybor = scanner.nextInt();
    switch (wybor){
      case 1: return Categories.Fruit;
      case 2: return Categories.Vegetable;
    }
    return null;
  }

  @Override
  public Product createProduct() {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Podaj nazwę");
    String nameByUser = scanner.nextLine();
    System.out.println("Podaj cenę");
    Double priceByUser = scanner.nextDouble();
    System.out.println("Podaj wagę");
    Double weightByUser = scanner.nextDouble();
    System.out.println("Podaj ilość");
    Integer amountByUser = scanner.nextInt();
    System.out.println("Wybierz kategorię: owoc czy warzywo");
    Product product = new Product.ProductBuilder()
        .name(nameByUser)
        .price(priceByUser)
        .weight(weightByUser)
        .amount(amountByUser)
        .categories(categoryChoice())
        .build();
    return product;
  }


  @Override
  public void showAllProducts() {
    StringBuilder sb = new StringBuilder();
    for (Product product: listOfVegetables) {
      sb.append("Name:").append(product.getName()).
         append(" Amount:").append(product.getAmount())
          .append(" Weight:").append(product.getWeight())
          .append(" Price:").append(product.getPrice()).append("\n");
    }
    System.out.println(sb);

    for (Product product: listOfFruits) {
      sb.append("Name:").append(product.getName()).
          append(" Amount:").append(product.getAmount())
          .append(" Weight:").append(product.getWeight())
          .append(" Price:").append(product.getPrice()).append("\n");
    }
    System.out.println(sb);
  }

  @Override
  public void modifyAddAmountOfProduct(Product product, int amount) {

  }

//  @Override
//  public void modifyAddAmountOfProduct(String productName, int amount) {
//    if (resultList.contains(product.getName()))
//    product.setAmount(product.getAmount()+amount);
//    //Mnoży przez wagę ilość
//    product.setWeight(product.getAmount()* product.getWeight());
//  }

  @Override
  public void modifyRemoveAmountOfProduct(Product product, int amount) {

  }

  @Override
  public void changePriceValue(Product product, double price) {

  }
}
