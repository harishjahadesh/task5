package task5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMPTYORNOT {

    public static void main(String[] args) {
        List<String> sStrings = Arrays.asList("abc", "'*", "bc", "efg", "abed", "", "jkl");
        List<String> nonEmptyStrings = new ArrayList<>();
        for (String str : sStrings) {
            if (!str.isEmpty()) {
                nonEmptyStrings.add(str);
            }
        }

        System.out.println("List with non-empty strings:");
        System.out.println(nonEmptyStrings);
    }
}
