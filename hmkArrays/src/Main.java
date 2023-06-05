import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*Exercise 1*/

        /*
        int givenArray[] = {1,2,3,4,5};

        int arrSum = 0;
        for(int num: givenArray){
            arrSum += num;
        }
        System.out.println("sum of array values: " + arrSum);


         */





        /*Exercise 2 (code listed below)
        *
        * Answer: The output returns the index of the highest value in exampleArray. */

        double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;

        for(int i = 1; i<exampleArray.length; i++){
            if(exampleArray[i] > maximum){
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println(index);

        /*Exercise 3, code for ToPower saved in attached class file*/

        ToPower exercise3 = new ToPower();
        exercise3.ToPower(8, 2);


    }
}