package learnArray;

import java.security.SecureRandom;
import java.util.Arrays;

public class SwitchPositionArray {

    public static void main(String[] args) {
        int [] myArray = {3,4,5,7,8,9};
        int [] items = new int[10];
        shufflerArr(myArray);
        shuflerA(items);

    }
    public static void shufflerArr(int myArray[]){
        SecureRandom random = new SecureRandom();
        for (int i =0;i < myArray.length;i++){
            int shuffler = random.nextInt(myArray.length);
            int temp = myArray[shuffler];
            myArray[shuffler] =myArray[i];
            myArray[i] = temp;
        }

        for (int arr: myArray){
            System.out.print(arr + " ");
        }
    }

    //Method that prints ten random numbers;
    public static void shuflerA(int[] items){
        SecureRandom random = new SecureRandom();
        for (int i = 0;i <items.length;i++){
            int number = random.nextInt(items.length);
            System.out.println();
            System.out.println(number);
        }

    }



























//    public static void shuffleArr(int []myArray){
//       SecureRandom random = new SecureRandom();
//       for (int i = 0;i<myArray.length;i++){
//           int shuffleArr = random.nextInt(myArray.length);
//           int temp = myArray[shuffleArr];
//           myArray[shuffleArr] = myArray[i];
//           myArray[i] = temp;
//       }
//     for (int array : myArray){
//         System.out.print(array + " ");
//     }
//   }

}
//    shuffleArr(myArray);