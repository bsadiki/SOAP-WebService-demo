package webService;

import java.io.Serializable;

public class Compte implements Serializable{
    private int code;
    private double montant;

    public Compte() {
    }

    public Compte(int code, double montant) {

        this.code = code;
        this.montant = montant;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
