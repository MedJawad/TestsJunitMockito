package com.ensa.test;

import com.ensa.main.Facture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactureTest {
    Facture facture;

    @Before
    public void setUp() {
        this.facture = new Facture();
    }
    @After
    public void tearDown(){
        this.facture = null;
    }
    @Test
    public void testGetFraisFacture(){
        double montant = 601;
        double expectedFacture = 45;
        assertEquals(facture.getFrais(montant),expectedFacture);
    }
}
