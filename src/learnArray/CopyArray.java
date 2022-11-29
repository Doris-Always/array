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
//        int [] firstArr = {3,5,7,9,0,1};
//        System.out.println(Arrays.toString(shuffleArr(firstArr)));

        System.out.println(Arrays.toString(shiftArr(firstArr)));
        String [] months ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        findMonthOfTheYear(months);

        System.out.println(Arrays.toString(copyArray(new int[]{8, 9, 0, 2, 3})));
        System.out.println(" reversed array is "+Arrays.toString(reverseArr(firstArr)));
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
    //shuffling an array using random generated index

    public static int[] shuffleArr(int [] myArr){

        double temp = 0;
        for (int i = myArr.length-1;i > 0;i--){
            int j = (int) ((Math.random()) * (i));
            temp = myArr[i];
            myArr[i] = myArr[j];
            myArr[j] = (int) temp;

        }
        return myArr;
    }

    public static int[] shiftArr(int[] myList){
        double temp = myList[0]; // Retain the first element of the array in temp
// Shift elements left i.e from index 1
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];// take what is at current position to a lesser index
        }
// Move the first element to fill in the last position after the loop is done
        myList[myList.length - 1] = (int) temp;
        return myList;
    }

    //a program that prints the month of the year when a user puts a number between 1 & 12
    public static void findMonthOfTheYear(String [] month){
        Scanner scanner = new Scanner(System.in);
        System.out.println("put number between 1 - 12 to get the month of the with that number");
        int monthNumber = scanner.nextInt();
        System.out.println("month is " + month[monthNumber -1]);


    }

    public static int[] copyArray(int [] array){
        int [] arr = {4,3,7,1,0};
        int[] newArray = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            newArray[i] = arr[i];
        }
        return arr;
    }

    //method to demonstrate returned array
    public static int[] reverseArr(int []list){
        int[] result = new int[list.length];
        for (int i =0;i < list.length;i++){
            for (int j = result.length - 1;j> 0;j--){
                result[j] = list[i];
            }

        }
        return result;
    }

}
