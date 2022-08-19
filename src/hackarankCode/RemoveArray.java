package hackarankCode;

import java.util.Arrays;

public class RemoveArray {
   static int [] arr = new int[10];

    public static void createAnArray(int [] newArray) {

        for (int i =1;i < newArray.length;i++){
//            newArray[i] = i +1;
            arr[i] =newArray[i];
            System.out.println(arr[i]);
        }


    }
//    public static void populateArray(int num1, int num2, int num3, int num4, int num5, int num6, int) {
//        int[] array = new int[10];
//        for (int i =0;i < arr.length;i++){
//            for (int j = i + 1; j< arr.length; j++){
//                array[0] = num1;
//                array[1] = num2;
//            }
//        }   System.out.println(Arrays.toString(array));
//    }
//
//
//    public static void main(String[] args) {
//        createAnArray(arr);
//        System.out.println("output for populated array");
////        populateArray(arr);
//    }
}
