import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Special cases
        if (num <= 1) {
            isPrime = false;
        } 
        else {
            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        //Print result
        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }


                // int count  = 0;
        // if(num>1){
        //     for(int i =1;i<=num;i++){
        //         if(num%i==0){
        //             count++;
        //         }
        //     }
        //     if(count==2){
        //         System.out.println(num + " is a prime number");
        //     }
        //     else{
        //         System.out.println(num+" - Not Prime");
        //     }

        // }
    }
}
