public class Main {
    public static void main(String[] args) {
        int[] scores = {86, 67, 73, 61};
        // TODO: compute the average as a double; print: Average = <value>
        int sum = 0;
        int counter = 1;
        for(int score : scores){
          sum+=score;
          counter++;
        }
        double average = (double)sum / counter;
        System.out.println(average);
    }
    
}
