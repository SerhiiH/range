/**
 * Created by Сергей on 18.02.2017.
 */
public class Range <T extends Number & Comparable<T>> {
    private final Pair<T, T> pair;

    private Range(T begin, T end) {
        if(begin.compareTo(end) > 0)
            throw new IllegalArgumentException("low level > top level");
        pair = Pair.getPair(begin, end);
    }
    public static <T extends Number & Comparable<T>> Range<T> getRange(T low, T top) {
        return new Range(low, top);
    }
    public String toString() {
        return ("Range[low: " + pair.getLeft() +
                ", top: " + pair.getRight() + "]");
    }
}
