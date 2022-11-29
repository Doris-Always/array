package hackarankCode;



public class SubArray {
    public static void main(String[] args) {
        int[] myArr = {2,4,3,5,6,-2,4,7,8,9};
        sumList(myArr,7);
    }
    public static int[] sumList(int [] lst,int sum){
        for (int i = 0;i <lst.length;i++){
            for(int j = i + 1;j < lst.length;j++){
                if(lst[i] + lst[j] == sum){
                    System.out.println(lst[i]+ "+" +lst[j]);
                }
            }
        }

        return lst;
    }
}
