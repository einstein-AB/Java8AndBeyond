package defaultMethods;

public interface Interface2 {

    default void printHello() {
        System.out.println("test msg from Interface - 2");
    }
}
