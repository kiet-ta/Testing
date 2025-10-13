package com.tak;

import com.tak.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }

//    TEST CASE #1L: Check/Verify getFactorial method with valid parameter, e.g. n = 0
//        STEPS/PRODUCE:
//     1. Given a valid n, e.g. n = 0
//     2. Call/invoke getFactorial(n = 0)
//        3. Execute
//        EXPECTED RESULT:
//        the method will return 1 as the result of 0!

    public static void testFactorialGivenRightArg0RunsWell() {
        int n = 0; // đầu vào
        long expectedValue = 1; //hope to see 0! = 1, kì vọng
        long actualValue = MathUtility.getFactorial(n);

        //test nè, so sánh actual vs. expected
        // dùng biến boolean hoặc ỉn ra
        System.out.println("0! expected: " + expectedValue);
        System.out.println("0! actual: " + actualValue);

    }
//    TEST CASE #2L: Check/Verify getFactorial method with valid parameter, e.g. n = 2
//        STEPS/PRODUCE:
//     1. Given a valid n, e.g. n = 5
//     2. Call/invoke getFactorial(n = 5)
//        3. Execute
//        EXPECTED RESULT:
//        the method will return 120 as the result of 5!

    public static void testFactorialGivenRightArg5RunsWell() {
        int n = 5; // đầu vào
        long expectedValue = 120; //hope to see 0! = 1, kì vọng
        long actualValue = MathUtility.getFactorial(n);

        //test nè, so sánh actual vs. expected
        // dùng biến boolean hoặc ỉn ra
        System.out.println("5! expected: " + expectedValue);
        System.out.println("5! actual: " + actualValue);
    }
    //    TEST CASE #3L: Check/Verify getFactorial method with valid parameter, e.g. n = 2
//        STEPS/PRODUCE:
//     1. Given a valid n, e.g. n = 5
//     2. Call/invoke getFactorial(n = 5)
//        3. Execute
//        EXPECTED RESULT:
//        the method will return 120 as the result of 5!

    public static void testFactorialGivenRightArg6RunsWell() {
        System.out.println("6! expected = 720 | actual " + MathUtility.getFactorial(6));
    }
    //    TEST CASE #4L: Check/Verify getFactorial method with valid parameter, e.g. n = 2
//        STEPS/PRODUCE:
//     1. Given a valid n, e.g. n = -5
//     2. Call/invoke getFactorial(n = -5)
//        3. Execute
//        EXPECTED RESULT:
//        the method will throw an exception
//        STATUS: PASSED HAY FAILED Đoán xem, chạy app đã !!!
    public static void testFactorialGivenWrongArgMinus5ThrowsException() {
        MathUtility.getFactorial(-5); //PASSED VÌ KÌ VỌNG NGOẠI LỆ XH,
        // VÀ NGOẠI LỆ XH THẬT!!!!!
        // THẤY NGOẠI LỆ MÀ PASSED LÀ TÌNH HUỐNG TA THIẾT KẾ HÀM SẼ XẢY RA NGOẠI LỆ VỚI
        //SỐ ÂM GIAI THỪA!!!!
    }
}