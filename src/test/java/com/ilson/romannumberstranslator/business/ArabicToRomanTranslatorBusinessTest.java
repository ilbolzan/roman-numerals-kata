package com.ilson.romannumberstranslator.business;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArabicToRomanTranslatorBusinessTest {

    @Test
    public void translate_whenZero_ThrowsExeption() {
        // arrange
        ArabicToRomanTranslator translator = new ArabicToRomanTranslator();

        // actAssert
        assertThrows(IllegalArgumentException.class, () -> {
            translator.translate(0);
        });
    }

    @Test
    public void translate_when4000_ThrowsExeption() {
        // arrange
        ArabicToRomanTranslator translator = new ArabicToRomanTranslator();

        // actAssert
        assertThrows(IllegalArgumentException.class, () -> {
            translator.translate(4000);
        });
    }

    @ParameterizedTest(name = "{index} => When Arabic={0}, Roman numeral should be={1}")
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V",
        "8, VIII",
        "9, IX",
        "13, XIII",
        "19, XIX",
        "40, XL",
        "50, L",
        "90, XC",
        "100, C",
        "400, CD",
        "500, D",
        "900, CM",
        "1000, M",
        "1997, MCMXCVII",
        "3494, MMMCDXCIV",
        "3999, MMMCMXCIX"
    })
    public void translate_whenArabic_returnRoman(int arabicNumber, String romanNumberExpected) {
        // arrange
        ArabicToRomanTranslator translator = new ArabicToRomanTranslator();

        // act
        String romanNumber = translator.translate(arabicNumber);

        // assert
        assertEquals(romanNumberExpected, romanNumber);
    }

}
