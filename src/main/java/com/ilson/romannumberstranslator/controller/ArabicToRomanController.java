package com.ilson.romannumberstranslator.controller;

import com.ilson.romannumberstranslator.business.ArabicToRomanTranslator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ArabicToRomanController
 */
@RestController
@RequestMapping("/ArabicToRoman")
public class ArabicToRomanController {

    @Autowired
    ArabicToRomanTranslator translator;

    @GetMapping("{arabicNumber}")
    public ResponseEntity<String> translate(@PathVariable int arabicNumber) {
        try {
            return ResponseEntity.ok(translator.translate(arabicNumber));
        }catch(IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.toString());
        }
    }

    
}