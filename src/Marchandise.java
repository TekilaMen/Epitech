public class Marchandise {
    private int id;
    private String libelle;
    private String precautions;
    
    public Marchandise(int i,String l,String p){
        this.id =i;
        this.libelle = l;
        this.precautions = p;
    
    }
    
   public String getLibelle(){
       return this.libelle;
   }
   
   public String getPreco(){
       return this.precautions;
   }
    
    
}
