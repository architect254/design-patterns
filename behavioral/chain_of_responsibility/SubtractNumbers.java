package behavioral.chain_of_responsibility;

public class SubtractNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextInChain(Chain nextInChain) {
        this.nextInChain = nextInChain;

    }

    @Override
    public void process(Request request) {
        if (request.getCalcWanted() == "sub") {
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = "
                    + (request.getNumber1() - request.getNumber2()));
        } else {
            this.nextInChain.process(request);
        }
    }
}
