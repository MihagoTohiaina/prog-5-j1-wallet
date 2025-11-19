package org.example;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private String couleur;
    private double poid;
    private String marque;
    private List<PorteCarte> porteCarte;
    private double solde;

    public Wallet(String couleur, double poid, String marque, List<PorteCarte> porteCarte, double solde) {
        this.couleur = couleur;
        this.poid = poid;
        this.marque = marque;
        this.porteCarte = porteCarte;
        this.solde = solde;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public List<PorteCarte> getPorteCarte() {
        return porteCarte;
    }

    public void setPorteCarte(List<PorteCarte> porteCarte) {
        this.porteCarte = porteCarte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    public void getMoney(double expendMoney){
        double newSolde = solde - expendMoney;
    }

    public void addMoney(double addingMoney){
        double newSolde = solde + addingMoney;
    }

    public double checkMoney(){
        return solde;
    }

    public void addCard(PorteCarte newCard){
        List<PorteCarte> porteCartes = this.porteCarte;
        porteCartes.add(newCard);
    }

    public void lost(){
        this.couleur=null;
        this.poid=0;
        this.marque=null;
        this.porteCarte=null;
        this.solde=0;
    }
}
