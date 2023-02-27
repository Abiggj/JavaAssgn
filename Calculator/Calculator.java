package Calculator;

public class Calculator {
    float a, b, result;
    // the constructor to initialise the operands
    Calculator(float left, float right){
        this.a = left;
        this.b = right;
    }

    // each of the four operations are listed one by one as functions that return answer in float
    float addition(float a, float b){
        result = a + b;
        return result;
    }
    float substraction(float a, float b){
        result = a - b;
        return result;
    }
    float multiplication(float a, float b){
        result = a * b;
        return result;
    }
    float division(float a, float b){
        if (b == 0){
            // if zero is divided with, then the operation is not performed
            System.out.println("Division by zero");
            return 0;
        }
        result = a / b;
        return result;
    }
}
