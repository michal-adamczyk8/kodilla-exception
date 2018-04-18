public class Kata3 {
    public static String longestWord(String wordString) {
        String[] singleWords = wordString.split(" ");
        int maxLength = 0;
        String result = "";
        for (String word : singleWords){
            if (word.length() >= maxLength) {
                maxLength = word.length();
                result = word;
            }
        }
        System.out.println(result);
        return  result;
    }
}
