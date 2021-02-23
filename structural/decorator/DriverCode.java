package structural.decorator;

// allows to modify an object dynamically
// use when you want the capabilities of inheritence with subclasses but you need to add functionality at run time
// more flexible than inheritance
// simplifies code because you add functionality using many simple clasees
// rather than rewrite new code you can extend with new code
// eg a pizza shop that dynamically changes toppings 
public class DriverCode {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

    }
}
