package com.ilson.romannumberstranslator.business;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * Generates an ordered Set with the symbols necessary to understand the roman numerals
 */
public class RomanNumeralsDictionary {
    
    private static TreeMap<Integer, String> dictionary = new TreeMap<Integer, String>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static Set<Entry<Integer, String>> getDictionaryDescending(){
        return dictionary.descendingMap().entrySet();
    }
    
}