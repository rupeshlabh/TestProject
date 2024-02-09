import java.util.Scanner;

public class CheckEqualNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        System.out.println("Both numbers are equal");
        else
        System.out.println("Both numbers are not equal");
    }
}
