package behavioral.chain_of_responsibility;

public interface Chain {
    public void setNextInChain(Chain nextInChain);
    public void process(Request request);
}
