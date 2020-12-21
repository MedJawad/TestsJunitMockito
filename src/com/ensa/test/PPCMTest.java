package com.ensa.test;

import com.ensa.main.PPCM;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PPCMTest {

    @Test
    public void testPpcm(){
        int a = 7;
        int b = 2;
        int expected = 14;
        assertEquals(PPCM.ppcm(a,b),expected);
    }

    @Test
    public void testPpcmWithOne(){
        int a = 985;
        int b = 1;
        int expected = 985;
        assertEquals(PPCM.ppcm(a,b),expected);
    }
}
