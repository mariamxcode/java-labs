import java.util.Arrays;
public class Palindrome{
public static void main(String[]args){
String name = "madam";
System.out.println(isPalindrome(name));
}
public static boolean isPalindrome(String text){
String reverse = "";
boolean value = true;
for(int index = text.length()-1; index > -1; index-- ){
  reverse+=text.charAt(index);
}
if(text != reverse){
value=false;
}else{
value=true;
}
return value;
}

}
