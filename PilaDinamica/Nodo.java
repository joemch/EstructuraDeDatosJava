package cursoprogramacion.estructuraDatos.pilas;

/** Clase nodo (Elemento basico de la pila).
 **/
public class NodoPila {

    private int dato;
    private NodoPila sgte;
    
    public NodoPila(int nro) {       
        this.dato = nro;
        this.sgte = null;
    }
    
    public int getDato() {
        return dato;
    }

    public NodoPila getSgte() {
        return sgte;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSgte(NodoPila sgte) {
        this.sgte = sgte;
    }   
}
