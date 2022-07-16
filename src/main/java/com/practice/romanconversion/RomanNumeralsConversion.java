package com.practice.romanconversion;

import java.util.TreeMap;

public class RomanNumeralsConversion {

    // TreeMaps are great at sorting by natural order
    private static final TreeMap<Integer, String> romanNumeralMap = new TreeMap<>();

    static {
        romanNumeralMap.put(1000, "M");
        romanNumeralMap.put(900, "CM");
        romanNumeralMap.put(500, "D");
        romanNumeralMap.put(400, "CD");
        romanNumeralMap.put(100, "C");
        romanNumeralMap.put(90, "XC");
        romanNumeralMap.put(50, "L");
        romanNumeralMap.put(40, "XL");
        romanNumeralMap.put(10, "X");
        romanNumeralMap.put(9, "IX");
        romanNumeralMap.put(5, "V");
        romanNumeralMap.put(4, "IV");
        romanNumeralMap.put(1, "I");
    }

    public String romanConverter(int numberToConvert) {
        //floorKey looks up the greatest key that is less than or equal to the given key
        int highestKey = romanNumeralMap.floorKey(numberToConvert);
        //Checks if the number provided is equal to the number thats being checked
        if (numberToConvert == highestKey) {
            return romanNumeralMap.get(numberToConvert);
        }
        // romanNumeralMap.get(highestKey) will have the roman numeral value and it will be stored in string format.
        // romanConverter(numberToConvert - highestKey); is then running the same method again to complete the remaining values
        return romanNumeralMap.get(highestKey) + romanConverter(numberToConvert - highestKey);
    }
}