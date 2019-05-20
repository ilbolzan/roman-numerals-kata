package com.ilson.romannumberstranslator.business;

import java.util.Map.Entry;

import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

/**
 * Implements the translation from Arabic Numerals to Roman Numerals
 */
@NoArgsConstructor
@Component
public class ArabicToRomanTranslator {

    /**
     * Transtates arabic numeral to roman numeral
     * @param arabicNumber
     * @return Roman representation of the arabic number
     */
    public String translate(int arabicNumber) {
        var intermediateNumber = arabicNumber;
        StringBuilder romanNumber = new StringBuilder();

        if (arabicNumber <= 0) {
            throw new IllegalArgumentException("Romans do not go bellow zero");
        }
        if (arabicNumber >= 4000) {
            throw new IllegalArgumentException("For the sake of sanity we're not counting over 3999");
        }

        // Iterates thought the roman symbols in descending order
        for (Entry<Integer, String> dictEntry : RomanNumeralsDictionary.getDictionaryDescending()) {
            // Romans dont go bellow zero
            if (intermediateNumber <= 0)
                break;

            // The quotient shows how many times the given current symbol has to be repeated
            int quotient = intermediateNumber / dictEntry.getKey();

            // Add the current symbol to the output variable
            romanNumber.append(dictEntry.getValue().repeat(quotient));

            // Subtracts the ammount equivalent of that symbol from the number
            intermediateNumber -= quotient * dictEntry.getKey();

        }
        return romanNumber.toString();
    }
}