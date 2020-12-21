package com.ensa.main;

public class Facture implements IFacture{

    double montant;

    public double getFrais(double montant){
        this.montant=montant;
        if(montant>600) return 45;
        return 0;
    }

    @Override
    public double getMontant() {
        return this.montant;
    }
}
