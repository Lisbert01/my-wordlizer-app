package de.htw_berlin.fb4.lisbert;

import junit.framework.TestCase;

public class SimpleSentenceTest extends TestCase {

    //Testet, ob die get()-Methode den ursprünglichen Text korrekt zurückgibt.
    public void testGetReturnsOriginalText() {
        // Ein einfacher Satz wird erzeugt
        SimpleSentence s = new SimpleSentence("Hallo Welt");

         // Erwartet wird genau der Text, der im Konstruktor übergeben wurde
        assertEquals("Hallo Welt", s.get());
    }

    // Testet, ob die Länge des kombinierten Textes richtig ist
    public void testGetLength() {
        SimpleSentence s = new SimpleSentence("Test");

        // Prüft die Länge des erzeugten Textes mit Leerzeichen und Zeilenumbruch
        assertEquals(4, s.get().length());
    }

    // Testet was passiert wenn eine leere Liste übergeben wird
    public void testEmptySentence() {
        // Leere Liste wird übergeben
        SimpleSentence s = new SimpleSentence("");
        // erwartet wird ein leerer String
        assertEquals("", s.get());
        assertEquals(0, s.get().length());
    }
}

