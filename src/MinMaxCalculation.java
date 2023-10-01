import java.util.*;

public class MinMaxCalculation {
    private ArrayList<Integer> numbers;

    public MinMaxCalculation(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getMin() {
        return Collections.min(numbers);
    }
}