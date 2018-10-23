package com.cmb.app;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonToolkitTest {

    private static CommonToolkit commonToolkit;

    @BeforeClass
    public static void initCommonToolkitTest() {
        commonToolkit = new CommonToolkit();
    }

    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }

    @Test
    public void testNull() {
        String result = commonToolkit.convertToEnglishFormat(null);

        assertEquals(null, result);
    }

    @Test
    public void testNumber() {
        String result = commonToolkit.convertToEnglishFormat("23,5");

        assertEquals("23.5", result);
    }

}
