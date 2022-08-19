package learnArray;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] firstArr = {3,5,7,9,0,1};
        int [] secondArr = new int[6];
        for (int i = 0;i < 6;i++){
            secondArr[i] = firstArr[i];
            secondArr = Arrays.copyOf(firstArr,6);
            System.out.println(secondArr[i]);
        }

       int[] newArray = getNumbers(5);
        for (int i = 0;i < newArray.length;i++){
            System.out.println("index " + i + " " + "entered numbers" + newArray[i]);
        }
        System.out.println(" the average is" + " "+ getAverage(newArray));
    }

    public static int[] getNumbers(int num){
        System.out.println("Enter" + num +" "+ "integers\r");
        int [] value = new int[num];

        for (int i = 0;i < value.length;i++){
            value[i] = scanner.nextInt();
        }

        return value;
    }

    public static double getAverage(int [] array){
        int sum = 0;
        for (int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
//from reverse array class
//        int[] myArray = {8,4,3,2,9};
//        reverseArray(myArray);
//        for (int i = 0; i < myArray.length; i++)
//            System.out.println(myArray[i]);
    public static int[] reverseArray(int[] array){
        int temp = 0;
        for (int i = 0; i < (array.length / 2); i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
