import java.util.Scanner;

/**
 * @author fazliberkordek
 */
//This program finds the armstrong number:..
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking the number from user:
        int number;
        int stepValue;
        int result = 0;
        int valuePow;
        System.out.print("value :");
        number = input.nextInt();
        int tempNumber = number;

        //lets find the length of the number:
        int lenNumber = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            lenNumber++;
        }
        //Example if the number is 12345 ==> lenNumber returns 5;,
        tempNumber = number;
        while (tempNumber != 0) {
            stepValue = tempNumber % 10;
            valuePow = 1;
            for (int i = 1; i <= lenNumber; i++) {
                valuePow *= stepValue;
            }
            result += valuePow;
            tempNumber /= 10;

        }
        System.out.println("Result : " + result);


    }
}