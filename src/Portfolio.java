import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {
  List<Stock> stockList;

  public Portfolio(List<Stock> stockList) {
    this.stockList = new ArrayList<Stock>();
  }

  public void addStocks(Stock stock) {
    this.stockList.add(stock);
  }

  public Double profit(Stock stock, LocalDate intialDate, LocalDate endDate) {
    double totalExpense = stock.stockMap.get(intialDate);
    double totalRevenue = stock.stockMap.get(endDate);

    double netProfit = netProfit(totalExpense, totalRevenue);
    double netProfitMargin = netProfitMargin(netProfit, totalRevenue);

    System.out.println("Stock " + stock.name + " Net Profit: " + netProfit);
    System.out.println("Stock " + stock.name + " Net Margin Profit: " + netProfitMargin);
    System.out.println();
    return netProfit;
  }

  public Double netProfit(double totalExpense, double totalRevenue) {
    return totalRevenue - totalExpense;
  }

  public Double netProfitMargin(double netProfit, double totalRevenue) {
    return netProfit / totalRevenue * 100;
  }

}
