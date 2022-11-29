package hackarankCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
////ToDo declare an array
////ToDo create a method,reverse array
////ToDo pass in array as a parameter
////ToDo reverse the array,such that last index becomes 1st
////ToDo put the reversed array in a new array
public class ReverseArray {
    public static void main(String[] args) {
//        int[] myArr = {2,1,8,1,5,6,9};
//        reverseMethod(myArr);
//        System.out.println(Arrays.toString(myArr));
//        int [] firstArr = {2,1,8,1,5};

//        int [] myList = new int[]{1, 1, 3, 3, 4, 4, 4, 5};
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 4, 4, 4, 5));
        System.out.println(removeDuplicate(myList));
        ArrayList<Integer> myArr = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 4, 4, 4, 5));
//        System.out.println(removeDuplicate2(myArr));
    }

//    public static int[] reverseMethod(int [] array){
//       int temp = 0;
//        for (int i = 0; i < array.length / 2; i++){
//            temp = array[i];
//            array[i] =array[array.length-1 -i ];
//            array[array.length-1 - i] = temp;
//        }
//
//
//        return array;
//    }

//    public static int[] reverseMethod2(int [] array){
//
//        int [] reversedArr = {};
//        int counter = 0;
//        for (int i = 0;i < array.length - 1; i--){
//            reversedArr[counter] =
//        }
//
//    }
    //question: use duplicate fron the array

    public static List<Integer> removeDuplicate(List<Integer> lst){
        List <Integer> list = new ArrayList<>();
        for (int i = 0;i < lst.size() -1;i++){
            if (lst.get(i) != lst.get(i+1)){
                list.add(lst.get(i));
            }
        }
        return list;
    }
}

//    public static int[] removeDuplicate2(ArrayList<Integer> lst){
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0;i < lst.size();i++){
//            for (int j = i+1;j < lst.size()-1;j++){
//                if (lst.get(j) != lst.get(i)){
//                    arr.add(lst.get(j));
//                }
//            }
//
//    }
//        return new int[0];
//    }
