package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ReduceExample {

    /* In Java, reducing is a terminal operation that aggregates a stream into a type or a primitive type.
     * Java 8 provides Stream API with set of predefined reduction operations such as:
     * average(), sum(), min(), max(), and count().
     * These operations return a value by combining the elements of a stream.
    */

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Sum of numbers using aggregate functions
        //1st way
        int sum = intList.stream()
                .mapToInt(integer -> integer)
                .sum();
        //2nd way
        Integer reduceSum = intList.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(
                "sum: "+ sum + " || " +
                "reduceSum: "+ reduceSum);

        /*==========================================================*/

        //Max of numbers using aggregate functions
        //1st way
        OptionalInt max = intList.stream()
                .mapToInt(integer -> integer)
                .max();
                //.min();
        //2nd way
        Integer reduceMax = intList.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(
                "max: "+ max.getAsInt() + " || " +
                "reduceMax: "+ reduceMax);

        /*==========================================================*/

        //Average of numbers using aggregate functions
        OptionalDouble average = intList.stream()
                .mapToInt(integer -> integer)
                .average();
        System.out.println("average: "+ average.getAsDouble());
    }
}
