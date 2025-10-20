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
}
