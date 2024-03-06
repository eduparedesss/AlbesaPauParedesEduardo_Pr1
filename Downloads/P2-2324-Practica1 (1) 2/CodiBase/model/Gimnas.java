package model;

import java.time.LocalDateTime;
import vista.ExcepcioReserva;

public class Gimnas implements InGimnas{
    private String nom;
    private int numServeis;

    public Gimnas(String nom) {
        this.nom = nom;
    }
    
    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getNumServeis() {
        return numServeis;
    }

    @Override
    public void afegirSoci(String nom_, String dni_) {
        Soci(nom_, dni_);
    }

    @Override
    public void afegirPistaTenis(String nom_, String idServei_, boolean iluminada_, String tipusTanca_, float mida_, String tipusSuperficie_, String tipusXarxa_) {
        PistaTenis(nom_, idServei_, iluminada_, tipusTanca_, mida_, tipusSuperficie_, tipusXarxa_);
        // afegir a llista de serveis
    }

    @Override
    public void afegirPistaFutbol(String nom_, String idServei_, boolean iluminada_, String tipusTanca_, float mida_, String tipusPorteries_, int numPorteries_) {
        PistaFutbol(nom_, idServei_, iluminada_, tipusTanca_, mida_, tipusPorteries_, numPorteries_);
        // afegir a llista de serveis
    }

    @Override
    public void afegirSalaFitness(String nom_, String idServei_, int numMaquines_, boolean monitor_) {
        SalaFitness(nom_, idServei_, numMaquines_, monitor_);
    }

    @Override
    public void afegirReserva(String idServei_, String dni_, LocalDateTime data_) throws ExcepcioReserva {
        
    }

    @Override
    public float calculMidaTotalPistes() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int calculServeisOperatius() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
