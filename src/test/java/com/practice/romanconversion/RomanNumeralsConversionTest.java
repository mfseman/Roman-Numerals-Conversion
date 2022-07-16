package com.practice.romanconversion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RomanNumeralsConversionTest {

    RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

    @Test
    void romanNumeralTest() {
        assertThat(romanNumeralsConversion.romanConverter("d")).isEqualTo(0);
    }
}
