public class Main {

  public static void main(String[] args) {
    SalesManager arreySales = new SalesManager(new long[]{1000, 900, 1400, 600, 2100, 850});
    System.out.println("Наибольший чек продаж: " + arreySales.max() + " руб.");

    System.out.println("Средний чек всех продаж: " + arreySales.averageSales() + " руб.");
    System.out.println("Всего продаж: " + arreySales.i);

  }


}
