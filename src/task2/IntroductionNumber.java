package task2;
import java.util.HashSet;
import java.util.Set;

public class IntroductionNumber {
    public static void main(String[] args) {
        String str1 = "1 2 3 4 5";
        String str2 = "3 4 5 6 7";

        Set<Integer> numbers1 = convertStringToSet(str1);
        Set<Integer> numbers2 = convertStringToSet(str2);

        numbers1.retainAll(numbers2);

        System.out.println("similar numbers: " + numbers1);
    }

    private static Set<Integer> convertStringToSet(String str) {
        Set<Integer> set = new HashSet<>();
        String[] numbers = str.split(" ");
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
        return set;
    }
}

