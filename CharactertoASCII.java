//To find ASCII value to character:
import java.util.*;
public class CharactertoASCII {
    public static void main(String[] args){
        char x;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a character to find its ASCII value:");
        x= sc.next().charAt(0);
        int ascii = x;
        System.out.println("The ASCII value of "+ x +" is:" + ascii);

    }
}
