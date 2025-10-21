

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import vn.fpoly.Calculator;


public class CalculatorTest {

    private Calculator calculator;
    @BeforeClass
    public void setup() {
        calculator = new Calculator();
        System.out.println("Đã khởi tạo đối tượng Calculator.");
    }


    @Test(description = "Kiểm tra cộng hai số dương (5 + 3 = 8)")
    public void testAddPositiveNumbers() {
        int a = 5;
        int b = 3;
        int expectedResult = 8;

        int actualResult = calculator.add(a, b);

        // So sánh kết quả thực tế với kết quả mong đợi
        Assert.assertEquals(actualResult, expectedResult, "Phép cộng hai số dương không chính xác.");
        System.out.println("Test Case 1 OK: " + a + " + " + b + " = " + actualResult);
    }

    @Test(description = "Kiểm tra cộng số âm và số dương (-10 + 7 = -3)")
    public void testAddNegativeAndPositive() {
        int a = -10;
        int b = 7;
        int expectedResult = -3;

        int actualResult = calculator.add(a, b);

        Assert.assertEquals(actualResult, expectedResult, "Phép cộng số âm và số dương không chính xác.");
        System.out.println("Test Case 2 OK: " + a + " + " + b + " = " + actualResult);
    }


    @Test(description = "Kiểm tra cộng với số 0 (9 + 0 = 9)")
    public void testAddWithZero() {
        int a = 9;
        int b = 0;
        int expectedResult = 9;

        int actualResult = calculator.add(a, b);

        Assert.assertEquals(actualResult, expectedResult, "Phép cộng với số 0 không chính xác.");
        System.out.println("Test Case 3 OK: " + a + " + " + b + " = " + actualResult);
    }
}
