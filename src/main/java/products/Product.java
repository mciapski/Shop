package products;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public abstract class Product {

  private String name;
  private double price;
  private int id_product;
  private double weight;
  private int amount;
  private Categories categories;

}
