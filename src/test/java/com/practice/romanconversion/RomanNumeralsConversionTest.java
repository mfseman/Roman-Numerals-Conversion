package com.practice.romanconversion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RomanNumeralsConversionTest {

    RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

    @Test
    void romanNumeralFor99() {
        assertThat(romanNumeralsConversion.romanConverter(99)).isEqualTo("XCIX");
    }

    @Test
    void romanNumeralFor121() {
        assertThat(romanNumeralsConversion.romanConverter(121)).isEqualTo("CXXI");
    }
}
