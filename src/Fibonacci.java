
public class Fibonacci {




    public int fiboCalculate(int value){

        return (value < 2) ? value : fiboCalculate(value - 1) + fiboCalculate( value - 2);
    }




    public String fibonacciSequence(int rangeValue){

        String sequence = "";

        for (int i = 0; i <= rangeValue; i++){
            sequence = sequence + "-"+ fiboCalculate(i);
        }

        return sequence;
    }


}
