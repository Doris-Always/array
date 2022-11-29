package multiArray;

import java.util.ArrayList;
import java.util.Arrays;

//(Compute the weekly hours for each employee) Suppose the weekly hours for all
       // employees are stored in a two-dimensional array. Each row records an employee’s seven-day work hours with seven columns.
        // For example, the following
       // array stores the work hours for eight employees. Write a program that displays
        //employees and their total hours in decreasing order of the total hours
public class EmployeeHours {
    public static void main(String[] args) {

        int[][] employeeWorkHour =
                {{2,4,3,4,5,8,8}, {7,3,4,3,3,4,4}, {3,3,4,3,3,2,2},{9,3,4,7,3,4,1},{3,5,4,3,6,3,8}, {3,4,4,6,3,4,4}, {3,7,4,8,3,8,4},{6,3,5,9,2,7,9}
                };

        int sum = 0;
        int rowLength = employeeWorkHour.length;
        int columnLength = employeeWorkHour[0].length;
        int [] sumOfWorkingHour = new int[rowLength];

        for(int row = 0; row < rowLength ; row++) {
            for(int col = 0; col < columnLength ; col++) {
               sum += employeeWorkHour[row][col];

            }
              sumOfWorkingHour[row] = sum;
            sum = 0;

        }
        System.out.println(Arrays.toString(sumOfWorkingHour));
        int temp= 0;
        for (int i = 0; i < sumOfWorkingHour.length;i++){
            for (int j = i; j > 0;j--){

                if (sumOfWorkingHour[i] > sumOfWorkingHour[j-1]){
                    temp = sumOfWorkingHour[i];
                    sumOfWorkingHour[i] = sumOfWorkingHour[j-1];
                    sumOfWorkingHour[j - 1] = temp;
                }
            }

        }
        //TODO not sorted according to descending order yet
        for (int i = 0; i < sumOfWorkingHour.length; i++) {
            System.out.println(sumOfWorkingHour[i]);
        }

    }






}
