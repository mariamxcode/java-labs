public class Main8 {
    public static void main(String[] args) {
        int[] a = {18, 38, 16, 30, 7};
         System.out.println(a.length);
        // TODO: reverse a IN PLACE (swap pairs), then print elements separated by spaces
        for(int index = 1; index <= a.length; index ++){
        a[index] = a[a.length-index];
        System.out.print(a[index]+", ");
        }
    }
}
