import java.util.List;

public class TwoDimensionalArrayLists{
    public static void main(String args[]) {
        List<List<Integer>> list = List.of(
                               List.of(1, 2, 3),
                               List.of(4, 5, 6),
                               List.of(7, 8, 9)
                           );

        List<List<String>> list_String = List.of(
                        List.of("hi", "hello", "Howdy"),
                        List.of("hi", "hello", "Howdy"),
                        List.of("hi", "hello", "Howdy")
                    );

        System.out.println(list_String);
    }
}