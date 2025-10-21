

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



}
