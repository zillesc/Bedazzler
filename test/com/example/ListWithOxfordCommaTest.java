package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zilles on 9/5/17.
 */
public class ListWithOxfordCommaTest {

    @Test
    public void noItemList() throws Exception {
        assertEquals("", ListWithOxfordComma.toString(new String[0]));
    }

    @Test
    public void singleItemList() throws Exception {
        assertEquals("Item1", ListWithOxfordComma.toString(new String[]{"Item1"}));
    }

    @Test
    public void twoItemList() throws Exception {
        assertEquals("Item1, and Item2", ListWithOxfordComma.toString(new String[]{"Item1", "Item2"}));
    }

    @Test
    public void threeItemList() throws Exception {
        assertEquals("Item1, Item2, and Item3",
                ListWithOxfordComma.toString(new String[]{"Item1", "Item2", "Item3"}));
    }

    @Test
    public void manyItemList() throws Exception {
        assertEquals("Item1, Item2, Item3, Item4, Item5, Item6, and Item7",
                ListWithOxfordComma.toString(new String[]{"Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7"}));
    }
}