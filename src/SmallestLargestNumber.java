import java.util.Scanner;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        int largest = 1;
        int smallest = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = input.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = input.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = input.nextInt();

        if (num1 > num2) {
            smallest = num2;
            if (num1 > num3) {
                largest = num1;
                if (num2 > num3) {
                    smallest = num31;
                }
            } else {
                largest = num3;
            }
        } else {
            smallest = num1;
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
    }
}
