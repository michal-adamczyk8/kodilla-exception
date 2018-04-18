public class XO {
    public static boolean getXO(String str) {
        int xCount = 0;
        int oCount = 0;
        boolean result;
        String som = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if(som.charAt(i) == 'x') {
                xCount++;
            }
        }
        for (int k = 0; k < str.length(); k++) {
            if(som.charAt(k) == 'o') {
                oCount++;
            }
        }

        if (xCount == oCount) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println("xCount: " + xCount + "     oCount: " + oCount + " Result: " + result);
        return result;
    }
}
