package behavioral.chain_of_responsibility;

public class Request {
    private int number1;
    private int number2;

    private String calculationWanted;

    public Request(int newNumber1, int newNumber2, String calcWanted){
        number1 = newNumber1;
        number2 = newNumber2;

        calculationWanted = calcWanted;
    }

    public int getNumber1(){return number1;}

    public int getNumber2() {
        return number2;
    }

    public String getCalcWanted() {
        return calculationWanted;
    }
    
}
