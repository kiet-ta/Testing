package com.tak.mathutil.core.test;

import com.tak.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import static com.tak.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;
// IMPORT STATIC CHỈ DÀNH CHO NHỮNG HÀM STATIC, ĐỂ GIÚP TA LÀM BIẾNG GÕ TÊN CLASS CHẤM. LẼ RA PHẢI LÀ MathUtility.getFactorial(2); thì nay chỉ cần gõ getFactorial(5); là đủ
// giả sử class có nhiều hàm static
class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArg3RunsWell() {
        int n = 3;
        long expectedValue = 6;
        long actualValue = getFactorial(n);

        assertEquals(expectedValue,actualValue);
        assertEquals(6, getFactorial(n));
    }

    @Test
    public void testFactorialGivenRightArg4RunsWell() {
        int n = 4;
        long expectedValue = 24;
        long actualValue = getFactorial(n);

        assertEquals(expectedValue,actualValue);
        assertEquals(24, getFactorial(n));
    }

    @Test
    public void testFactorialGivenRightArg5RunsWell() {
        int n = 5;
        long expectedValue = 120;
        long actualValue = getFactorial(n);

        assertEquals(expectedValue,actualValue);
        assertEquals(120, getFactorial(n));
    }

    @Test   //@Test là 1 ghi chú annotation, đánh dấu, kí hiệu rằng hàm này là hàm main() có thể run
    //1 class test có thể có nhiều @Test, vậy 1 class Test có thể có nhiều hàm main() - để ứng với nhiều kịch bản test, nhiều test case khác nhau đều đc run!!!!

//    TEST CASE #1L: Check/Verify getFactorial method with valid parameter, e.g. n = 0
//        STEPS/PRODUCE:
//     1. Given a valid n, e.g. n = 0
//     2. Call/invoke getFactorial(n = 0)
//        3. Execute
//        EXPECTED RESULT:
//        the method will return 1 as the result of 0!
    public void testFactorialGivenRightArg0RunsWell() {
        int n = 0; // đầu vào
        long expectedValue = 1; //hope to see 0! = 1, kì vọng
        long actualValue = getFactorial(n);

        assertEquals(expectedValue,actualValue);

        // vietsub:so sánh xem 0! có trả về con số 1 hay ko
        //                          actual      expected

        assertEquals(1, getFactorial(n));
                    //expected      //actual
        //hàm assertEquals () so sánh giúp mình 2 value này, nó thảy ra 2 màu:
        //MÀU XANH PASSED NẾU 2 ĐỨA = NHAU
        // MÀU ĐỎ PASSED NẾU 2 ĐỨA != NHAU
    }
}