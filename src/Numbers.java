import java.util.Arrays;

public class Numbers {
    private int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int maxNumber(){
        int maxNr = numbers[0];
        for (int number : numbers)
            if (number > maxNr)
                maxNr = number;
        return maxNr;
    }

    public int minNumber(){
        int minNr = numbers[0];
        for (int number : numbers)
            if (number < minNr)
                minNr = number;
        return minNr;
    }

    private int[] sortNumbers(){
        int[] sorted = numbers;
        Arrays.sort(sorted);
        return sorted;
    }

    public int maximalSum(){
        int[] sortedValues = sortNumbers();
        int sum = 0;
        for (int i = numbers.length-1; i>0; i--)
            sum += numbers[i];
        return sum;
    }
}
