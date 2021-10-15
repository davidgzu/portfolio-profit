import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Test {
  public static void main(String[] args) {

    Stock stockA = new Stock("A", 1, new LinkedHashMap());

    stockA.addValues(LocalDate.parse("2021-10-10"), 345.40);
    stockA.addValues(LocalDate.parse("2021-10-11"), 344.00);
    stockA.addValues(LocalDate.parse("2021-10-12"), 343.20);
    stockA.addValues(LocalDate.parse("2021-10-13"), 348.77);
    stockA.addValues(LocalDate.parse("2021-10-14"), 335.40);
    stockA.addValues(LocalDate.parse("2021-10-15"), 355.98);
    stockA.addValues(LocalDate.parse("2021-10-16"), 335.10);
    System.out.println(stockA.price(LocalDate.parse("2021-10-10")));

    Stock stockB = new Stock("B", 2, new LinkedHashMap());

    stockB.addValues(LocalDate.parse("2021-11-10"), 2345.40);
    stockB.addValues(LocalDate.parse("2021-11-11"), 2344.00);
    stockB.addValues(LocalDate.parse("2021-11-12"), 2343.20);
    stockB.addValues(LocalDate.parse("2021-11-13"), 2348.77);
    stockB.addValues(LocalDate.parse("2021-11-14"), 2350.40);
    stockB.addValues(LocalDate.parse("2021-11-15"), 2355.98);
    stockB.addValues(LocalDate.parse("2021-11-16"), 2330.10);
    System.out.println(stockB.price(LocalDate.parse("2021-11-14")));

    Portfolio portfolio = new Portfolio(new ArrayList());
    portfolio.addStocks(stockA);
    portfolio.addStocks(stockB);

    portfolio.profit(stockA, LocalDate.parse("2021-10-11"),LocalDate.parse("2021-10-15"));
    portfolio.profit(stockB, LocalDate.parse("2021-11-10"), LocalDate.parse("2021-11-16"));

  }
}
