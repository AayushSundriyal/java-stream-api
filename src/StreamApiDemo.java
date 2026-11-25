import java.util.*;
import java.util.stream.*;

public class StreamApiDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 20);

        List<String> names = Arrays.asList(
                "Aayush", "Rahul", "Aman", "Priya", "Rohit"
        );
        // 1. map()
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> result1 = numbers1.stream()
                .map(n -> n * 10)
                .toList();
        System.out.println("Map : " + result1);

        // 2. flatMap()
        List<List<Integer>> numbers2 = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> result2 = numbers2.stream()
                .flatMap(list -> list.stream())
                .toList();
        System.out.println("flatMap : " + result2);

//        3. filter()
        List<Integer> numbers3 = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> result3 = numbers3.stream()
                .filter(n -> n > 20)
                .toList();
        System.out.println("Filter : " + result3);

//        4. distinct()
        List<Integer> numbers4 = Arrays.asList(10, 20, 20, 30, 30, 40);
        List<Integer> result4 = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Distinct : " + result4);

//        5. sorted()
        List<Integer> numbers5 = Arrays.asList(50, 10, 40, 20, 30);
        List<Integer> result5 = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted : " + result5);

//        6. Limit(n)
        List<Integer> numbers6 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> result6 = numbers.stream()
                .limit(3)
                .toList();
        System.out.println("Limit : " + result6);

//        7. skip()
        List<Integer> numbers7 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> result7 = numbers.stream()
                .skip(2)
                .toList();

        System.out.println("Skip : " + result7);

//        8.peek()
        List<Integer> numbers8 = Arrays.asList(10,20,30);
        List<Integer> result8 = numbers8.stream()
                .peek(n -> System.out.println("Before : " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("After : " + n))
                .toList();

        System.out.println("Peek : " + result8);

//        9. takeWhile()
        List<Integer> numbers9 = Arrays.asList(10, 20, 30, 15, 40, 50);
        List<Integer> result9 = numbers9.stream()
                .takeWhile( n -> n < 30)
                .toList();
        System.out.println("Takewhile : " + result9);

//        10. findFirst()
        List<Integer> numbers10 = Arrays.asList(10, 20, 30, 40);
        Optional<Integer> result10 = numbers10.stream()
                .findFirst();
        System.out.println("Find first : " + result10.get());

//        11. findAny()
        List<Integer> numbers11 = Arrays.asList(10, 20, 30, 40);
        Optional<Integer> result11 = numbers11.stream()
                .findAny();
        System.out.println("FindAny : " + result11.get());

//        12. anyMatch()
        List<Integer> numbers12 = Arrays.asList(10, 20, 30, 40);
        boolean result12 = numbers12.stream()
                .anyMatch(n -> n > 30);
        System.out.println("anyMatch() : " + result12);

//        13. allMatch()
        List<Integer> numbers13 = Arrays.asList(10, 20, 30, 40);
        boolean result = numbers13.stream()
                .allMatch(n -> n >5);
        System.out.println("allMatch() : " + result);

//        14. noneMatch()
        List<Integer> numbers14 = Arrays.asList(10, 20, 30, 40);
        boolean result14 = numbers.stream()
                .noneMatch( n -> n < 0);
        System.out.println("noneMatch() : " + result14);

//        15. count()
        List<Integer> numbers15 = Arrays.asList(10, 20, 30, 40, 50);
        long result15 = numbers15.stream()
                .count();
        System.out.println("count() : " + result15);

//        16. reduce()
        List<Integer> numbers16 = Arrays.asList(10, 20, 30, 40);
        int result16 = numbers16.stream()
                .reduce(0,(a, b) -> a + b);
        System.out.println("reduce() : " + result16);

//        17. collect()
        List<Integer> numbers17 = Arrays.asList(10, 20, 30, 40);
        List<Integer> result17 = numbers17.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println("collect() : " + result17);

//        18. toList()
        List<Integer> numbers18 = Arrays.asList(10, 20, 30);
        List<Integer> result18 = numbers18.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("toList() : " + result18);

//        19. min()
        List<Integer> numbers19 = Arrays.asList(50, 10, 30, 20, 40);
        Optional<Integer> result19 = numbers.stream()
                .min(Comparator.naturalOrder());
        System.out.println("min() : " + result19.get());

//        20. max()
        List<Integer> numbers20 = Arrays.asList(50, 10, 30, 20, 40);
        Optional<Integer> result20 = numbers20.stream()
                .max(Comparator.naturalOrder());
        System.out.println("max() : " + result20.get());

//        21. forEach()
        List<Integer> numbers21 = Arrays.asList(1 , 2 , 3 , 4 , 5);
        numbers21.stream()
                .forEach(n -> System.out.println("forEach : " + n));

//        22. mapToInt()
        List<String> names22 = Arrays.asList("Aayush", "Rahul", "Aman");
        int totalLength = names22.stream()
                .mapToInt(name22 -> name22.length())
                .sum();
        System.out.println("mapToInt() : " + totalLength);
    }

}