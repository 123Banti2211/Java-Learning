import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
       int a,b,operator;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any two value to calculate:");
       a=sc.nextInt();
       b=sc.nextInt();
       System.out.println("Choose any number on basis of operator u want to do:");
       System.out.println("Press 1. For ADDITION");
       System.out.println("Press 2. For SUBSTRACTION");
       System.out.println("Press 3. For MULTIPLICATION");
       System.out.println("Press 4. For DIVISION");
       System.out.println("Press 5. For MODULO DIVISION");
       operator=sc.nextInt();
       switch (operator) {
        case 1: System.out.println(a+b);   
            break;
        case 2: System.out.println(a-b);   
            break;
        case 3: System.out.println(a*b);   
            break;
        case 4: if(b==0){
                    System.out.println("INVALID DIVISION");
                }
                else{
                    System.out.println(a/b);
                }
            break;
        case 5: if(b==0){
                System.out.println("INVALID DIVISION");
            }
            else{
                System.out.println(a%b);
            }
            break; 
        default:System.out.println("Invalid Choice!!");
            break;
       }
    }
}
