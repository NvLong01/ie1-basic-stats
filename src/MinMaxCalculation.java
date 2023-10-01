import java.util.*;

public class MinMaxCalculation {
    private ArrayList<Integer> numbers;

    public MinMaxCalculation(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    //using getMix to get the minimum value from the set of number
    public int getMin() {
        return Collections.min(numbers);
    }
    //using getMax to get the maxmium value from the set of number
    public int getMax() {
        return Collections.max(numbers);
    }

}