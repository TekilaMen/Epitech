import java.util.HashMap;

public abstract class Fret {
    private String villeDepart;
    private String villeArrivee;
    private int duree;
    private int distance;
    private TypeVehicule leTypeVehicule;
    HashMap<Marchandise,Lot>lesLots;
    
    
    public Fret(String vd,String va,int du,int di, TypeVehicule tpv){
        this.villeArrivee = va;
        this.villeDepart = vd;
        this.duree = du;
        this.distance = di;
        this.leTypeVehicule = tpv;
        this.lesLots = new HashMap<Marchandise,Lot>();
    }
    
    public float calculerPoidTotal(){
        float poidTot = 0;
        for(Marchandise uneMarchandise : lesLots.keySet()){
            poidTot += lesLots.get(uneMarchandise).getPoids();
        }
        return poidTot;
    }
    
    public String getVilleD(){
        return this.villeDepart;
    }
    
    public String getVilleA(){
        return this.villeArrivee;
    }
    
    public int getDist(){
        return this.distance;
    }
    
    public int getDur(){
        return this.duree;
    }
    
    public TypeVehicule getV(){
        return this.leTypeVehicule;
    }
    
    public float getTauxConsoKm(){
        return this.leTypeVehicule.getTaux();
    }
   
    
    public float calculerVolumeTotal(){
         float volTot = 0;
        for(Marchandise uneMarchandise : lesLots.keySet()){
            volTot += lesLots.get(uneMarchandise).getVolume();
        }
        return volTot;
    }
    
    public int getVmax(){
        return this.leTypeVehicule.getVmax();
    
    }
    public boolean ajouterLot(int i,float p,float v,Marchandise lm){
        boolean ok = true;
        for(Marchandise l : lesLots.keySet()){
            if(l == lm){
                ok = false;
            }
        }
        if(ok){
            Lot unLot = new Lot(i,p,v);
            lesLots.put(lm,unLot);
            
        }
        return ok;
    }
    
    public abstract float calculerPrix();
    
    public abstract float calculerEmpreintCarbone();
    
    @Override
    public abstract String toString();
}
