package model;

public class PistaTenis extends Pista {
    private String tipusSuperficie;
    
    //getters and setters:
    private String tipusXarxa;

    //getter i setter de tipusSuperficie
    public String getTipusSuperficie() {
        return tipusSuperficie;
    }

    public void setTipusSuperficie(String tipusSuperficie) {
        this.tipusSuperficie = tipusSuperficie;
    }
    
    
    //getter i setter de tipusXarxa
    public String getTipusXarxa() {
        return tipusXarxa;
    }

    public void setTipusXarxa(String tipusXarxa) {
        this.tipusXarxa = tipusXarxa;
    }
    
    
    
    PistaTenis(String nom, String idServei, boolean iluminada, String tipusTanca, int mida, String tipusSuperficie, String tipusXarxa){
        //with the keyword "super." we reference to the atributes of the progenitor class: "Servei".
        super.nom = nom;
        super.id = idServei;
        
        //here we're referencing to the atributes of the progenitor class: "Pista"
        super.iluminada = iluminada;
        super.tipusTanca = tipusTanca;
        super.mida = mida;
        
        //now we're going to reference to the atributes of the actual class: "PistaTennis".
        this.tipusSuperficie = tipusSuperficie;
        this.tipusXarxa = tipusXarxa;
        
                
    }
}
