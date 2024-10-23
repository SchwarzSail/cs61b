import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        return L.stream().mapToInt(Integer::intValue).sum();
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        return L.stream().filter(x -> x % 2 == 0).toList();
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        return L1.stream()
                .filter(L2::contains)
                .distinct()
                .toList();
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        return (int) words.stream()
                .flatMapToInt(String::chars)
                .filter(ch -> ch == c)
                .count();
    }
}
