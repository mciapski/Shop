package PFT;

import java.util.List;
import java.util.Set;

public class FlatMapDemo {
  public static void main(String[] args) {
    Pesel pesel1 = Pesel.createPesel("12345");
    Pesel pesel2 = Pesel.createPesel("33444");
    Pesel pesel3 = Pesel.createPesel("67777");
    Pesel pesel4 = Pesel.createPesel("89999");
    Pesel pesel5 = Pesel.createPesel("24555");
    Pesel pesel6 = Pesel.createPesel("23434");
    Pesel pesel7 = Pesel.createPesel("09766");
    Pesel pesel8 = Pesel.createPesel("09761");
    Pesel pesel9 = Pesel.createPesel("09762");

    List<Pesel> peselList = List.of(pesel1, pesel2, pesel3, pesel4, pesel5);
    Set<Pesel> peselSet = Set.of(pesel6, pesel7, pesel8, pesel9);
    /**
     * Drukujemy wszystkie pesele po kolei
     */
    peselList.stream()
        .map(Pesel::getPeselNumber)
        .forEach(System.out::println);
    peselSet.stream()
        .map(Pesel::getPeselNumber)
        .forEach(System.out::println);
    System.out.println("====================");
    List.of(peselList, peselSet).stream()
        .flatMap(x -> x.stream())
        .map(Pesel::getPeselNumber)
        .forEach(System.out::println);
  }
}
