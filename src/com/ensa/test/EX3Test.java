package com.ensa.test;

import com.ensa.main.IFacture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EX3Test {
    @Mock
    IFacture facture;



    @Test
    public void TestNegative() {
        when(facture.getFrais(-1)).thenThrow(new IllegalArgumentException());
        try {
            facture.getFrais(-1);
            Assert.fail();
        } catch (IllegalArgumentException iae) {
        }
    }
    @Test
    public void testFraisInclus() {
        when(facture.getFrais(599)).thenReturn(45.0);
        Assert.assertEquals(45.0, facture.getFrais(599), 0);
    }

    @Test
    public void testFraisExclus() {
        when(facture.getFrais(601.0)).thenReturn(0.0);
        Assert.assertEquals(0.0, facture.getFrais(601), 0);
    }
}