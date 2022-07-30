public class Main {

  public static void main(String[] args) {
    SalesManager arreySales = new SalesManager(new int[]{10000, 9600, 14100, 690, 21600, 8050});
    System.out.println("Наибольший чек продаж: " + arreySales.max() + " руб.");
    System.out.println("Наименьший чек продаж: " + arreySales.min() + " руб.");
    System.out.println("Средний чек всех продаж: " + arreySales.averageSales() + " руб.");
    System.out.println("Количество продаж: " + arreySales.i + "\nВсего продаж на сумму: " +
        arreySales.averageSales() * arreySales.i + " руб.");
    System.out.println("расчёт обрезанного среднего : " + arreySales.average() + " руб.");

  }


}
