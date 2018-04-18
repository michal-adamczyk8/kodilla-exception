import java.util.List;

public class SmileyFaces {
    public static int countSmileys(List<String> arr) {
        int coutOfSmileyfaces = 0;
        for (String faces : arr) {
            if (faces.length() == 3 && (faces.charAt(0) == ':' || faces.charAt(0) == ';')
                    && (faces.charAt(1) == '-' || faces.charAt(1) == '~')
                    && (faces.charAt(2) == ')' || faces.charAt(2) == 'D')) {
                coutOfSmileyfaces++;
            }
            else if (faces.length() == 2 && (faces.charAt(0) == ':' || faces.charAt(0) == ';')
                    && (faces.charAt(1) == ')' || faces.charAt(1) == 'D')) {
                coutOfSmileyfaces++;
            }
        }
        System.out.println(coutOfSmileyfaces);
        return coutOfSmileyfaces;
    }
}
