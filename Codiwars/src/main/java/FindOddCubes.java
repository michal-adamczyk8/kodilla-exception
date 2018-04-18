import java.lang.reflect.Array;

public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        int[] cubes = new int[arr.length];
        int sum = 0;
        for(int k = 0; k < cubes.length; k++) {
            cubes[k] = arr[k] * arr[k];
        }


        for (int i = 0; i < cubes.length; i++) {
            if(cubes[i] % 2 != 0) {
                sum =+ cubes[i];
            }
        }
        System.out.println(cubes[1]);
        System.out.println(sum);
        return sum;
    }
}
