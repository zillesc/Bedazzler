package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zilles on 8/31/17.
 */
public class BedazzlerTest {

    @Test
    public void shortTest() throws Exception {
        assertEquals("*T*h*i*s*", Bedazzler.bedazzle("This"));
    }

    @Test
    public void twoWordTest() throws Exception {
        assertEquals("*F*o*o*  *B*a*r*", Bedazzler.bedazzle("Foo Bar"));
    }

    @Test
    public void startsWithSpace() throws Exception {
        assertEquals("  *s*t*a*r*t*s*  *w*i*t*h*  *a*  *s*p*a*c*e*", Bedazzler.bedazzle(" starts with a space"));

    }

    @Test
    public void moreThanOneSpaceTogether() throws Exception {
        assertEquals("*t*w*o*    *s*p*a*c*e*s*", Bedazzler.bedazzle("two  spaces"));
    }

    @Test
    public void nullString() throws Exception {
        assertEquals("", Bedazzler.bedazzle(null));
    }

    @Test
    public void endsWithSpace() throws Exception {
        assertEquals("*e*n*d*s*  ", Bedazzler.bedazzle("ends "));
    }
}