package defaultMethods;

public class InterfaceImplExample1 implements Interface1, Interface2 {

    /*
        If interface1 and 2 both and implemented in class (this example `InterfaceImplExample1`),
        then COMPULSORY implementation should be provided to resolve DIAMOND problem/ ambiguity
     */

    @Override
    public void printHello() {
        System.out.println("Msg from forced implementation when both interfaces are implemented and both have same default method");
    }
}
