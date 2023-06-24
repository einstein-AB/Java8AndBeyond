package defaultMethods;

public class InterfaceImplExample2 implements Interface1 {

    /*
        If interface1 is implemented in class and impl is provided (this example `InterfaceImplExample2`),
        then below impl is executed.

        If interface1 is implemented in class and impl is NOT provided,
        then default impl from Interface1 is executed.
     */

    @Override
    public void printHello() {
        System.out.println("Msg from Interface Implementation 2 ");
    }

}
