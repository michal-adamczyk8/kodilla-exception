public class FindDivisior {
    public static long numberOfDivisors(int n) {
        long divisorsCount = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorsCount++;
            }
        }
        System.out.println(divisorsCount);
        return divisorsCount;
    }
}
