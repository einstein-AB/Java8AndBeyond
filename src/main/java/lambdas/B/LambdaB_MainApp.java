package lambdas.B;

public class LambdaB_MainApp {

    public static void main(String[] args) {
        GreeterInterface greeterInterface;

        //Traditional way
        greeterInterface = new GreeterImplOne();
        greeterInterface.greet();

        greeterInterface = new GreeterImplTwo();
        greeterInterface.greet();

        //------------------------------------------------------------------//

        //Inner class way
        greeterInterface = new GreeterInterface() {
            @Override
            public void greet() {
                System.out.println("3. Inner Class impl for GreeterInterface");
            }
        };
        greeterInterface.greet();

        //------------------------------------------------------------------//

        //Lambda way
        greeterInterface = () -> {
            System.out.println("4. Lambda way of doing things");
        };

        greeterInterface.greet();
    }
}
