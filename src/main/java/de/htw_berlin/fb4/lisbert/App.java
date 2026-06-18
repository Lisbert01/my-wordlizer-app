package de.htw_berlin.fb4.lisbert;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

         Sentence s1 = new SimpleSentence("Hallo Welt");
        ProseBuilder proseBuilder = new ProseBuilder();
        proseBuilder.register(s1);
        System.out.println(proseBuilder.get());
    }
}

