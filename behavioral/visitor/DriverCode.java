package behavioral.visitor;

// allows you to add methods to classes of different types without much altering those classes
// you can make completely different methods depending on the class used
// allows you to define external classes that can extend other classes without majorly editing them
public class DriverCode {
    public static void main(String[] args) {
        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.accept(taxCalc) + "\n");
        System.out.println(vodka.accept(taxCalc) + "\n");
        System.out.println(cigars.accept(taxCalc) + "\n");

        System.out.println("TAX HOLIDAY PRICES\n");

        System.out.println(milk.accept(taxHolidayCalc) + "\n");
        System.out.println(vodka.accept(taxHolidayCalc) + "\n");
        System.out.println(cigars.accept(taxHolidayCalc) + "\n");
    }
}
