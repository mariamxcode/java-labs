public class Main1{
    public static void main(String[] args) {
        int[] numbers = {39, 22, 29, 59, 54, 58};
        // TODO: sum all elements with a loop; print: Sum = <total>
        int sum = 0;
        for(int number : numbers){
        sum+=number;
        }
        System.out.println(sum);
    }
}
