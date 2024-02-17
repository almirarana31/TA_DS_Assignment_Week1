import java.util.Scanner;

public class checker {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        x = sc.nextInt();
        int[] array = new int[x];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < x; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < x; i++) {
            System.out.println(array[i]);
        }
        checker obj = new checker();
        String result = obj.finalcheck(array);
        System.out.println("This array " + result);
        System.out.println("The time complexity of this code is: O(n)");
    }
    public String finalcheck (int[] numbers) {
        for (int number:numbers){
            if (number==0 || number ==-1){
                return ("contains 0 or -1");
            }
        }
        return ("does not contain 0 or -1");
    }
}

