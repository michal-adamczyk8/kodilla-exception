public class Kata {
    public static double find_average(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum/array.length;
        System.out.println(sum + "            " + average);
        return average;
    }
}
