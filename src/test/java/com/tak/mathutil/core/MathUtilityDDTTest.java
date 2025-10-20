package com.tak.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
// chuẩn bị bộ data để riêng sau đó fill vào
    // mảng 2 chiều, bao gồm giá trị kì vọng | con n!
    public static Object[][] initTestData() {
        // trả về mảng 2 chiều
        Object [][] dataset = {
                {5, 120},
                {6, 720},
                {4, 240},
                {2, 2},
                {1, 1},
                {0, 1}
        }; // = các phần tử mảng cách nhau dấu ,
        //[7][2]
        return  dataset;
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, long expectedValue) {
        assertEquals(expectedValue, MathUtility.getFactorial(n));
    }
}