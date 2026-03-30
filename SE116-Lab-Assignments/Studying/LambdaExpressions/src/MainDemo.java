import java.util.Collections;

public class MainDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.printf("2 over 5 is : %d \n", calculator.exp(2,5));
        //Here is the Lambda Expression

        IntegerMath additionObject = (a, b) -> {return a + b;};
        System.out.println(additionObject.operation(2,5)); // be aware! I defined the operation!

        IntegerMath subtractionObject = (a, b) -> {return a - b;}; //I define a function here???
        System.out.println(subtractionObject.operation(1,10));

        //COOL usage of Lambda Expressions
        System.out.printf("\n \n \n");
        calculator.integerOperation(11, 77, (a, b) -> {return a*b;}); // caution ==> (a, b) -> {return a*b;} returns an object which is type IntegerMath


    }
}
