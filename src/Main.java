public class Main {
    public static void main(String[] args){
        int[] values = new int[]{9, 10, 56, 27, 93, 2};
        Numbers nr = new Numbers(values);
        System.out.println(nr.maxNumber());
    }
}
