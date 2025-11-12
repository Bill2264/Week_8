package ie.atu;

public class Calculator {
    public int add(int FirstNum, int SecondNum) {
        if (FirstNum >= Integer.MAX_VALUE || SecondNum >= Integer.MAX_VALUE) {
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        }
        return FirstNum + SecondNum;
    }
    public int sub(int FirstNum, int SecondNum) {
        if (FirstNum <= Integer.MIN_VALUE || SecondNum <= Integer.MIN_VALUE) {
            throw new ArithmeticException("Number cannot be less than or equal to Integer.MIN_VALUE");
        }
        return FirstNum - SecondNum;
    }

    public int multi(int FirstNum, int SecondNum) {
        if (FirstNum >= Integer.MAX_VALUE || SecondNum >= Integer.MAX_VALUE) {
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        }
        return FirstNum * SecondNum;
    }

    public float divide(int FirstNum, int SecondNum) {
        if (FirstNum == 0 || SecondNum == 0) {
            throw new ArithmeticException("Number cannot be equal to 0");
        }
        return (float)FirstNum / SecondNum;
    }
}
