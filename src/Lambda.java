import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        Consumer<String> peremennajaKudaKlademLambdaFunkciju = (s) -> System.out.println(s);
        for (int i = 1; i < 10; i++) {
            peremennajaKudaKlademLambdaFunkciju.accept(String.valueOf(i));
        }


        List<String> names = new ArrayList<>();

        Comparator<String> stringComparator = (a, b) -> b.compareTo(a);
        Collections.sort(names, stringComparator);

    }
}
