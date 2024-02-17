import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        x = sc.nextInt();
        int[] array = new int[x];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<x;i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i=0;i<x;i++) {
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i=0;i<x;i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of all the elements of an array: "+ sum);
        System.out.println("The time complexity of this code is: O(n)");
    }
}
