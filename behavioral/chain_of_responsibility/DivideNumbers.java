package behavioral.chain_of_responsibility;

public class DivideNumbers implements Chain {
    @Override
    public void setNextInChain(Chain nextInChain) {

    }

    @Override
    public void process(Request request) {
        if (request.getCalcWanted() == "div") {
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = "
                    + (request.getNumber1() / request.getNumber2()));
        } else {
            System.out.println("Only works for add, sub, mult and div");
        }
    }
}
