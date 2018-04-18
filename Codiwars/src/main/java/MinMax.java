import java.lang.reflect.Array;
import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr) {
        int max;
        int min;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length - 1];
        int[] minMax = new int[]{min, max};
        System.out.println("Min: " + min + " Max: " + max);
        return minMax;
        }
    }

