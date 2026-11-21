public class NumberFinder{
    public static void main(String[] args) {
        int[] items = {28, 87, 30, 35, 51};
        int key = 56;
        // TODO: print: Found at index <i> (use -1 when key is missing)
        for (int number = 0; number <= items.length-1; number++){
        if(key == items[number]){
    System.out.println("Found at index "+number);
    }else{
    System.out.println("-1");
    }
        }
    }
}
