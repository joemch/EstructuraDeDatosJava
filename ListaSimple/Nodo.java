public class Nodo {
    
    private int dato;
    private Nodo sgte;
    
    public Nodo(int nro) {        
        this.dato = nro;
        this.sgte = null;        
    }
    
    public int getDato() {
        return dato;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
}
