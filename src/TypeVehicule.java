public class TypeVehicule {
    private String libelle;
    private float tauxConsoKm;
    private int volumeMax;
    
    public TypeVehicule(String li,float tck,int vm){
        this.libelle = li;
        this.tauxConsoKm = tck;
        this.volumeMax = vm;
    }
    public String toString(){
        return this.libelle +" " +  this.tauxConsoKm + " " +this.volumeMax;
    }
    public String getTypeV(){
        return this.libelle;
    }
    
    public float getTaux(){
        return this.tauxConsoKm;
    }
    
    public int getVmax(){
        return this.volumeMax;
    }
}
