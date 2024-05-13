package task5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class studentname {

    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Amer", "Bob", "Ashok","Catch","Dravid", "Army", "Ethan");

        List<String> studentsWithA = studentNames.stream()
        .filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());

        System.out.println("Students whose names start with 'A':");
        studentsWithA.forEach(System.out::println);
    }
}
