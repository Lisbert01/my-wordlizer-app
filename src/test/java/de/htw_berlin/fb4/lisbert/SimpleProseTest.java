package de.htw_berlin.fb4.lisbert;

import de.htw_berlin.fb4.ossd.prose.Sentence;

import junit.framework.TestCase;
import java.util.Arrays;

public class SimpleProseTest extends TestCase {

    /**
     * Testet, ob SimpleProse die Texte mehrerer Sätze korrekt
     * zu einem einzigen String mit Zeilenumbrüchen zusammenfügt.
     */
    public void testGetReturnsCombinedText() {
        // Zwei einfache Sätze erzeugen
        Sentence s1 = new SimpleSentence("Hallo");
        Sentence s2 = new SimpleSentence("Welt");

       // SimpleProse erhält eine Liste dieser Sätze
        SimpleProse prose = new SimpleProse(Arrays.asList(s1, s2));

        // Erwartet wird: "Hallo\nWelt"
        assertEquals("Hallo\nWelt", prose.get());
    }

    // Testet, ob die Länge des kombinierten Textes richtig ist
    public void testGetLength() {
        Sentence s1 = new SimpleSentence("Test");
        Sentence s2 = new SimpleSentence("123");

        SimpleProse prose = new SimpleProse(Arrays.asList(s1, s2));

        // Prüft die Länge des erzeugten Textes mit Lerrzeichen und Zeilenumbruch
        assertEquals(8, prose.get().length());          // daher ist hier das Ergebniss 8!!!
    }

    // Testet was passiert wenn eine leere Liste übergeben wird
    public void testEmptyProse() {
        // Leere Liste wird übergeben
        SimpleProse prose = new SimpleProse(Arrays.asList());

        // erwartet wird ein leerer String
        assertEquals("", prose.get());
        assertEquals(0, prose.get().length());
    }
}
