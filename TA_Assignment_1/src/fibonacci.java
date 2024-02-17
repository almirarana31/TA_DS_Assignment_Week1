import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Fibonacci sequence up to " +x+ ": ");
        for (int i=0;i<=x;i++){
            System.out.print(fib(i)+" ");}
        System.out.println("\nThe time complexity of this code is: O(n^2)");

    }
    static int fib(int x) {
        if (x<=1) return x;
        int a=0, b=1;
        for (int i=2;i<=x;i++) {
            int c=a+b;
            a=b;
            b=c;
        } return b;
    }
}