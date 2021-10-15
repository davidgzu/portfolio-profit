import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.time.LocalDate;

public class Stock {
  String name;
  int id;
  Map<LocalDate, Double> stockMap;

  public Stock(String name, int id, Map stockMap ){
    this.name = name;
    this.id = id;
    this.stockMap = new LinkedHashMap();
  }

  public void addValues(LocalDate date, Double price){
    this.stockMap.put(date, price);
  }

  public Double price(LocalDate date)
  {
    return this.stockMap.get(date);
  }
}
