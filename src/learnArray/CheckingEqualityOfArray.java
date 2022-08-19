package learnArray;

public class CheckingEqualityOfArray {
    static String [] myArray1 = {"life","is", "good"};
    static String [] myArray2 = {"life","was","good"};

    static boolean isItTrue;
    public static void checkForEquality(String []array1, String[] array2){
        for (int i = 0; i < myArray1.length; i++){
            for (int j = 0; j < myArray2.length; j++){
                if (array1[i] == array2[j]){
                  isItTrue = true;
                }else isItTrue = false;
            }
        }
        System.out.println(isItTrue);

    }

    public static void main(String[] args) {
        checkForEquality(myArray1,myArray2);
    }
}
