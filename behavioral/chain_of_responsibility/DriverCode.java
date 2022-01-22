package behavioral.chain_of_responsibility;

// It sends data to an object and if that object cant use it, it sends it to any number of other objects that may be able to use it
// create 4 objects that can either add, subtract, multiply or divide
// send 2 numbers and a command and allow these 4 objects to decide which can handle the requested calculation
public class DriverCode {
    public static void main(String[] args) {
        Chain chainProcess1 = new AddNumbers();
        Chain chainProcess2= new SubtractNumbers();
        Chain chainProcess3 = new MultiplyNumbers();
        Chain chainProcess4 = new DivideNumbers();

        chainProcess1.setNextInChain(chainProcess2);
        chainProcess2.setNextInChain(chainProcess3);
        chainProcess3.setNextInChain(chainProcess4);

        Request request = new Request(4, 2, "mult");

        chainProcess1.process(request);
        
    }
}
