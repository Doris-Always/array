package hackarankCode;

import java.util.Arrays;
//
////ToDo declare an array
////ToDo create a method,reverse array
////ToDo pass in array as a parameter
////ToDo reverse the array,such that last index becomes 1st
////ToDo put the reversed array in a new array
public class ReverseArray {
    public static void main(String[] args) {
        int[] myArr = {2,1,8,1,5,6,9};
        reverseMethod(myArr);
        System.out.println(Arrays.toString(myArr));
        int [] firstArr = {2,1,8,1,5};

    }

    public static int[] reverseMethod(int [] array){
       int temp = 0;
        for (int i = 0; i < array.length / 2; i++){
            temp = array[i];
            array[i] =array[array.length-1 -i ];
            array[array.length-1 - i] = temp;
        }


        return array;
    }

//    public static int[] reverseMethod2(int [] array){
//
//        int [] reversedArr = {};
//        int counter = 0;
//        for (int i = 0;i < array.length - 1; i--){
//            reversedArr[counter] =
//        }
//
//    }
}
