package com.ilson.romannumberstranslator.business;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ArabicToRomanTranslatorBusinessTest {

	@Test
	public void translate_when1_returnI() {
        //arrange
        RomanTranslatorBusiness translator = new RomanTranslatorBusiness();

        //act
        String romanNumber = translator.translate(1);


        //assert
        assertEquals("I", romanNumber);
    }
    
    @Test
	public void translate_when2_returnII() {
        //arrange
        RomanTranslatorBusiness translator = new RomanTranslatorBusiness();

        //act
        String romanNumber = translator.translate(2);


        //assert
        assertEquals("II", romanNumber);
	}

}
