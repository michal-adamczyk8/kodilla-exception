public class Anagram {
    public static String removeBang(String str) {
        String result = "";
        String[] words = str.split(" ");
        for (String word : words) {
            if (str.endsWith("!")) {
                result = str.substring(str.indexOf("("), str.length());
            }
        }
        System.out.println(result);
        return result;
    }
}



