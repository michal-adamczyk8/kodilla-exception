import java.util.ArrayList;

public class MultipliesOf3Or5 {
    public static int solution(int number) {
        ArrayList<Integer> numbersDivededBy3Or5 = new ArrayList<>();

        for (int i = number - 1; i > 0; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                numbersDivededBy3Or5.add(i);
            }
        }
        int sumOfNumbersWhichMeetCondition = numbersDivededBy3Or5.stream().mapToInt(Integer::intValue).sum();
        return sumOfNumbersWhichMeetCondition;
    }
}

