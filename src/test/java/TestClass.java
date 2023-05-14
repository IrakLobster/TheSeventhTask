import Logic.MathOperation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void operationSum() {
        MathOperation sum = new MathOperation(1,55.5555, 33.3211);
        Assert.assertEquals(55.5555 + 33.3211, sum.getResult(), 0);
        System.out.println("Тест успешен!");
    }

    @Test
    public void operationDifference(){
        MathOperation difference = new MathOperation(2,55.5555, 33.3211);
        Assert.assertEquals(55.5555 - 33.3211, difference.getResult(), 0);
        System.out.println("Тест успешен!");
    }

    @Test
    public void operationMultiplication(){
        MathOperation multiplication = new MathOperation(3,55.5555, 33.3211);
        Assert.assertEquals(55.5555 * 33.3211, multiplication.getResult(), 0);
        System.out.println("Тест успешен!");
    }

    @Test
    public void operationDivision(){
        MathOperation division = new MathOperation(4,55.5555, 33.3211);
        Assert.assertEquals(55.5555 / 33.3211, division.getResult(), 0);
        System.out.println("Тест успешен!");
    }

    @Test
    public void operationSumInputNegativeNumber() {
        MathOperation sum = new MathOperation(1,-55.5555, -33.3211);
        Assert.assertEquals(-55.5555 + (-33.3211), sum.getResult(), 0);
        System.out.println("Тест успешен!");
    }

    @Test
    public void negativeAnswerDifference() {
        MathOperation difference = new MathOperation(2,-55.5555, -33.3211);
        Assert.assertEquals(-55.5555 - (-33.3211), difference.getResult(), 0);
        System.out.println("Тест успешен!");
    }

    @Test
    public void operationMultiOnZero() {
        MathOperation multiplication = new MathOperation(3,55.5555, 0);
        Assert.assertEquals(55.5555 * 0, multiplication.getResult(), 0);
        System.out.println("Тест успешен!");
    }
}
