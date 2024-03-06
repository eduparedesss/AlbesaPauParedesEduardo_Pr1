package model;

/**
*

@‌author Eduar???? pAUUUU
*/
public class PistaFutbol extends Pista {
    
    private int porteries; //num of goals.
    private String tipusPorteries;

    //getters and setters:
    public int getPorteries(){
        return porteries;
    }
    public void setPorteries(int porteries){
        this.porteries = porteries;
    }


    public String getTipusPorteries(){
       return tipusPorteries;
    }
    public void setTipusPorteries(String tipusPorteries){
       this.tipusPorteries = tipusPorteries;
    }

    public PistaFutbol(String nom, String id, boolean iluminada, String tipusTanca, int mida, String tipusPorteries, int numPorteries){
        super(mida, tipusTanca, iluminada);
        
        
        this.tipusPorteries = tipusPorteries;
        this.porteries = numPorteries;
}
}