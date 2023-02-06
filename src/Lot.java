public class Lot {
    private int id;
    private float poids;
    private float volume;
    
    
    public Lot(int i,float p,float v){
        this.id = i;
        this.poids = p;
        this.volume = v;
        
    }
    
    public String toString(){
        return this.id  +this.poids + this.volume + " ";
    }
    
    public float getPoids(){
        return this.poids;
    }
    
    public float getVolume(){
        return this.volume;
    }
}
