public class Calculator {
    public int add(int a, int b){return a + b;}
    public int subtract(int a, int b){return a -b;}
    public int multiply(int a, int b){return a * b;}
    public int exp(int a, int b){return (int) Math.pow(a, b);}
    public int mod(int a, int b){return a % b;}
    // ... the list goes on ...

    //Usage of lambda expressions
    public int integerOperation(int a, int b, IntegerMath objectOfOperation) {
        int result = objectOfOperation.operation(a,b);
        System.out.printf("--------\n Calculating %d, %d -> %d ", a, b, result);
        return result;
    }
}