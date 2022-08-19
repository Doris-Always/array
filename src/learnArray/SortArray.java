package learnArray;

public class SortArray {

  public static void main(String[] args) {

  }

  public void sortAscending(int[] numberOfIntegers){

    for(int i = 0;i<numberOfIntegers.length;i++){
      for(int j = i+1; j< numberOfIntegers.length; j++){
        if (numberOfIntegers[i] > numberOfIntegers[j]){
          int temp = 0;
          temp = numberOfIntegers[i];
          numberOfIntegers[i] = numberOfIntegers[j];
          numberOfIntegers[j] = temp;
        }
      }
      System.out.println(numberOfIntegers[i]+ " ");
    }
  }

  public void sortDescending(int[] numberOfIntegers){
    for(int i = 0;i<numberOfIntegers.length;i++){
      for(int j = i+1; j < numberOfIntegers.length; j++){
        int temp = 0;
        if (numberOfIntegers[i] > numberOfIntegers[j]){
          temp = numberOfIntegers[i];
          numberOfIntegers[i] = numberOfIntegers[j];
          numberOfIntegers[j] = temp;
        }
      }
      System.out.println(numberOfIntegers[i] + " ");
    }
  }
}
