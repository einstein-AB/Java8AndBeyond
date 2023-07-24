package lambdas.C;

public class LambdaC_MainApp {

    public static void main(String[] args) {

        int result=0;
        PrintResult printResult;

        NoArgsInterface greetingsLambda = () -> System.out.println("Greetings from Calculator");
        greetingsLambda.noArgsMethod();

        //Add
        TwoArgsInterface addLambda = (int a, int b) ->  a + b;
        result = addLambda.twoArgsOperation(3, 7);

        printResult = (expression, data) -> String.format(expression, data);
        System.out.println(printResult.print("Addition result is %d", result));

        //Multiply
        TwoArgsInterface multiplyLambda = (int a, int b) -> a*b;
        result = multiplyLambda.twoArgsOperation(2, 3);

        printResult = (expression, data) -> String.format(expression, data);
        System.out.println(printResult.print("Multiplication result is %d", result));
    }
}

interface NoArgsInterface {
    public void noArgsMethod();
}

interface TwoArgsInterface {
    public int twoArgsOperation(int a, int b);
}

interface PrintResult {
    public String print(String resultStr, int result);
}

