package learnArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayWorks {
    static Scanner integerInput = new Scanner(System.in);


    public static void main(String[] args) {

//        int[] arrayOfIntegers =  getInteger(5);
//        printArray(arrayOfIntegers);

        int [] myArray = {30,21,34,19,60};
        System.out.println("my array" + Arrays.toString(myArray));

        System.out.println("maximum value in this array " + find_max(myArray));

        String[] str = returnArray();
        System.out.println("printed from returned array method " + Arrays.toString(str));


        int numOfItem = 10;
        int [] arrayRandom ;
        arrayRandom = arrayOfIntegers(numOfItem);
        for (int i = 0;i < arrayRandom.length;i++){
            System.out.println(arrayRandom[i]);
        }
    }


    public static int[] arrayOfIntegers (int numOfItem){
        int [] myArr = new int[numOfItem];
        for (int i = 0;i < myArr.length;i++){
            myArr[i] = (int) (Math.random() * 10);
        }
        return myArr;
    }








    public static int find_max(int [] array){
        int max_value = 0;
        for (int i = 0;i < array.length;i++){
            if (array[i] > max_value){
                max_value = array[i];
            }
        }

        return max_value;
    }

    public static String[] returnArray(){
        String[] retArr = {"java","python","C"};
        return retArr;
    }

    public static int[] getInteger(int numbers){

        int [] array = new int[numbers];
        System.out.println("Enter" + numbers +"integer values\n");
        for (int i =0;i < array.length;i++){
            array[i] = integerInput.nextInt();
        }

        return array;
    }

    public static void printArray(int [] array){
       for (int i = 0;i < array.length;i++){
           System.out.println("Element " + i  + "contents" +""+ array[i]);
       }
    }
}
