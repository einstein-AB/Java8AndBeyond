package defaultMethods;

public interface Interface1 {

    default void printHello() {
        System.out.println("test msg from Interface - 1");
    }
}
