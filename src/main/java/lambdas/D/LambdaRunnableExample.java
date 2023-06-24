package lambdas.D;

public class LambdaRunnableExample {

    public static void main(String[] args) {

        //Inner class way
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed from Inner class thread");
            }
        });
        thread1.run();

        //--------------------------------------------------------------

        //Lambda way
        Thread thread2 = new Thread( () -> System.out.println("Printed from lambda"));
        thread2.start();

    }
}
