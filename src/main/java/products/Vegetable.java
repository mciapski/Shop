package products;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Vegetable extends Product{

  public Vegetable(String name, double price, int id_product, double weight) {
    super(name, price, id_product, weight);
  }
}
