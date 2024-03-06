package model;

public class SalaFitness extends Servei {
    private int numMaquines;
    private boolean monitorDisponible;

    public int getNumMaquines() {
        return numMaquines;
    }

    public void setNumMaquines(int numMaquines) {
        this.numMaquines = numMaquines;
    }

    public boolean isMonitorDisponible() {
        return monitorDisponible;
    }

    public void setMonitorDisponible(boolean monitorDisponible) {
        this.monitorDisponible = monitorDisponible;
    }
    
    public SalaFitness(String nom, String idServei, int numMaquines, boolean monitorDisponible) {
        
        //with the keyword "super." we're referencing to the atributes of the progenitor class: "Servei".
        super.nom = nom;
        super.id = idServei;
        
        //with the keyword "this." we're referencing to the atributes of the actual class: "SalaFitness"
        this.numMaquines = numMaquines;
        this.monitorDisponible = monitorDisponible;
    }
}
