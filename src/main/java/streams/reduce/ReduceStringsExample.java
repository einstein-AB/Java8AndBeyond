package streams.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceStringsExample {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abhishek", "vitthal", "daulatrao", "raut");
        System.out.println("Original list of strings: "+stringList);

        //Combine arrays string using reduce()
        String reduce2 = stringList.stream()
                .reduce("", (earlierResult, newElement) -> earlierResult + " " + newElement);
        System.out.println("String List Combined and added spaces in between name: "+reduce2);
    }
}
