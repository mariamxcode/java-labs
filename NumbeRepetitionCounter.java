public class NumbeRepetitionCounter{
    public static void main(String[] args) {
        int[] values = {4, 2, 4, 2, 1, 2, 1};
        int key = 2;
        // TODO: count how many times key appears; print: Count = <n>
        int count = 0;
        for(int value : values){
          if(value == key){
            count++;
}
}
System.out.println(count);
    }
}
