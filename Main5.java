public class Main5 {
    public static void main(String[] args) {
        int[] nums = {28, 8, 4, 8, 6, 26, 22};
        // TODO: count the even values; print: Even count = <n>
         int counter = 0;
         for(int num : nums){
         if(num % 2 == 0){
         	counter++;
         }
         }
         System.out.println(counter);
    }
}
