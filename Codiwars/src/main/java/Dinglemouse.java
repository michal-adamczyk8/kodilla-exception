public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears;
        int dogYears;
        if(humanYears < 2) {
            catYears = 15;
            dogYears =15;
        }
        else if(humanYears == 2) {
            catYears = 15 + 9;
            dogYears =15 + 9;
        }
        else {
            catYears = 15 + 9 + 4 * (humanYears - 2);
            dogYears = 15 + 9 + 5 * (humanYears - 2);
        }
        return new int[]{humanYears, catYears, dogYears};
    }

}
