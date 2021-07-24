package products;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Fruit extends Product{

  public Fruit(String name, double price, int id_product, double weight) {
    super(name, price, id_product, weight);
  }
}
