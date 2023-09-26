import java.util.ArrayList;
import java.util.List;

/**
 * @author tatek on 9/25/2023
 */

//find the number of palindromes between two given numbers
    //first find how many numbers have between them number1 - number2
    //then create arrays and store all numbers from number1 to number2
    //check all array elements if the values are palindrome by using string and stringBuffer.
public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 220;
        numberOfPalindrome(num1 , num2).stream().forEach(i-> System.out.print(" "+i));
    }

    private static List<Integer> numberOfPalindrome(int num1, int num2) {
        int bt = num2 - num1;
        int []array = new int[bt+1];
        List<Integer> newArray = new ArrayList<>();
        int temp = num1;

        for (int i = 0; i <= bt; i++) {
            array[i] = temp;
            temp++;
        }

        int cout = 0;

        for (int j : array) {
            StringBuffer stringBuffer = new StringBuffer();
            String st1 = String.valueOf(j);
            stringBuffer.append(j);
            stringBuffer.reverse();
            String st2 = stringBuffer.toString();

            if (st1.equals(st2)) {
                newArray.add(Integer.parseInt(st1));
                cout++;
            }
        }

        System.out.println("\n\nNumber of Palindrome between "+num1+" and "+ num2+" are "+cout);
        System.out.print("Numbers are: ");
        return newArray;
    }
}