public class Bio {
    public String dnaToRna(String dna) {
        if (dna.contains("T")) {
            String result = dna.replace("T", "U");
            return result;
        }
        else {
            return dna;
        }
    }
}
