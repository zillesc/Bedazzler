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
    public void brokenTest() throws Exception {
        assertEquals("*F*o*o* *B*a*r*", Bedazzler.bedazzle("Foo Bar"));
    }
}