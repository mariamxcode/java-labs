public class Main7{
    public static void main(String[] args) {
        int[] arr = {16, 19, 12, 9, 10};
        // TODO: multiply each element by 2 IN PLACE, then print them separated by spaces
        for(int number = 0; number <= arr.length-1; number++){
        arr[number]*=2;
        System.out.println(arr[number]);
        }
    }
}
