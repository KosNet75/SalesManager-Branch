
public class SalesManager {

  int i = 0;
  protected long[] sales;

  public SalesManager(long[] sales) {
    this.sales = sales;
  }


  public long max() {
    long max = -1;
    for (long sale : sales) {

      if (sale > max) {
        max = sale;
      }
    }
    return max;
  }

  public long min() {
    long min = sales[0];
    for (long sale : sales) {
      if (sale < min) {
        min = sale;
      }
    }
    return min;
  }

  public long averageSales() {
    int average = 0;
    for (long sale : sales) {
      average += sale;
      i = i + 1;
    }
    return (average / i);
  }


}