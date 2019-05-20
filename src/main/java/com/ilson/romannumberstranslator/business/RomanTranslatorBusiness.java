package com.ilson.romannumberstranslator.business;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RomanTranslatorBusiness
{
    public String translate(int arabicNumber) {
        switch(arabicNumber){
            case 1: return "I";
            case 2: return "II";
        }
        return "";
    }
}