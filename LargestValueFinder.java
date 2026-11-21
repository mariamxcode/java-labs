public class LargestValueFinder {
    public static void main(String[] args) {
        int[] data = {5, 152, 38, 81, 30, 16};
        // TODO: find the largest value without Arrays.sort; print: Max = <value>
        int max = 0;
        for(int value : data){
        if(value > max){
        max = value;
        }
        }
         System.out.println(max);
    }
}
