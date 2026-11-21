public class SmallestValueFinder{
    public static void main(String[] args) {
        int[] temps = {19, 2, 4, 18, 73, 30};
        // TODO: find the smallest value; print: Min = <value>
        int min = temps[0];
        for(int value : temps){
        if (value > min){
        continue;
        }
        min = value;
        
        }
        System.out.println(min);
    }
}
