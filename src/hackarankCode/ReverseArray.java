package hackarankCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArr = {2,1,8,1,5,6,9};
        reverseMethod(myArr);
        System.out.println(Arrays.toString(myArr));
        int [] firstArr = {2,1,8,1,5};

        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 4, 4, 4, 5));
        System.out.println(removeDuplicate(myList));


    }

    public static List<Integer> removeDuplicate(List<Integer> lst){
        List <Integer> list = new ArrayList<>();
        for (int i = 0;i < lst.size() -1;i++){
            if (lst.get(i) != lst.get(i+1)){
                list.add(lst.get(i));
            }
        }
        return list;
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





}



