import java.util.List;

public class LastElement {
    public static <T> T last(final List<T> list) {
        T result = list.get(list.size()- 1)
        return result;
    }
    public static char last(final String string) {
        char result = string.charAt(string.length());
        return 0;
    }
    public static <T> T last(final T... list) {
        T result = last();
        return result;
    }
}
