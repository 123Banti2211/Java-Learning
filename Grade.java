import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        int english,chemistry,computer,physics,math,total,percentage;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for English:");
        english=sc.nextInt();
        System.out.println("Enter the marks for Chemistry:");
        chemistry=sc.nextInt();
        System.out.println("Enter the marks for Computer:");
        computer=sc.nextInt();
        System.out.println("Enter the marks for Physics:");
        physics=sc.nextInt();
        System.out.println("Enter the marks for Math:");
        math=sc.nextInt();
        total=english+chemistry+computer+physics+math;
        percentage=(total/500);

        
        
    }
}