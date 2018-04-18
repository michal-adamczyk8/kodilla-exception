import java.util.Arrays;

public class Solutuion {
    public static String isSortedAndHow(int[] array) {
        String result = null;
        int isGreater = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                for(int k = 0; k < array.length - 2; k++) {
                    if(array[k + 1] < array[k + 2]){
                        isGreater = 2;
                    }
                    isGreater = 1;
                }

            }
            isGreater = 0;
        }


//        switch (isGreater) {
//            case 0 :
//                result = "yes, ascending";
////                break;
////            case 1 :
////                result = "yes, descending";
////                break;
////            case 2 :
////                result = "no";
////                break;
//        }
        System.out.println(isGreater);
        return result;
    }
}
