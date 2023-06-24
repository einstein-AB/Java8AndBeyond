package lambdas.A;

public class Greeter {

    public void greet() {
        System.out.println("Greetings");
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();
    }
}
