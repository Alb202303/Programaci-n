public class Subclase1 extends Base{
    private int unidades;
    private float precio;
    private boolean aprobado;
    
    public Subclase1(int u, float p, boolean a){
        this.unidades=u;
        this.precio=p;
        this.aprobado=a;
    }
    
    //getters / setters
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }
    
    public void setPrecio(float precio){
        this.precio=precio;    
        
    }
    
    
    public void setAprobado(boolean aprobado){
        this.aprobado=aprobado;
    }
    
    public int getUnidades(){
        return this.unidades;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public boolean getAprobado(){
        return this.aprobado;
    }
    
    
    
    
}//cierra clase