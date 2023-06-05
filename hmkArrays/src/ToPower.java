
import java.util.*;
public class ToPower {
    public static double[] ToPower(int size, int power){

        double[] finalAns = new double[size];
        for(int i = 0; i < size; i++){
            double val = Math.pow(i, power);
            finalAns[i]= val;
        }
        System.out.println(Arrays.toString(finalAns));
        return finalAns;

    }

}
