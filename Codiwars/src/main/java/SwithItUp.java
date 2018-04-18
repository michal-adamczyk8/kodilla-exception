public class SwithItUp {
    public static String findNeedle(Object[] haystack) {
        String result = null;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                 result = "found the needle at position " + i;
            }
        } return result;
    }
}
