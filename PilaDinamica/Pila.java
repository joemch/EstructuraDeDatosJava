public class Pila {
    
    private NodoPila cima;
    private int tam;
    
    public Pila(){
        this.cima = null;
    }
    
    public void insertar(int nro){
        NodoPila nuevo = new NodoPila(nro);
        nuevo.setSgte(cima);
        cima = nuevo;
        this.tam++;    
    }
    
    public void quitar() {
        if(pilaVacia())
            System.out.println("\t[Msg]: Pila vacia, no se puede extraer."); 
        else{
            this.cima = cima.getSgte();
            this.tam--;
        }
    }
    
    public int cimaPila() {
        if(pilaVacia())
            System.out.println("\t[Msg]: Pila vacia, no se puede mostrar.");
        else
            return this.cima.getDato();
        return -1;
    }
    
    public int limpiarPila(){
        if(pilaVacia()){
            System.out.println("\t[Msg]: La pila ya esta vacia...");
            return -1;
        }
        else{
            System.out.println("\t[Msg]: Limpiando pila...");
            while(!pilaVacia()){
                this.cima = this.cima.getSgte();
                this.tam--;
            }
        }
        return 0;    
    }
    
    public void mostrarPila(){
        if(pilaVacia()){
            System.out.println("\t[Msg]: Pila vacia, no se puede mostrar.");
        }
        else{
            NodoPila tmp = this.cima;
            while(tmp!=null){
                System.out.println("\t=> "+tmp.getDato());
                tmp = tmp.getSgte();
            }
        }
    }

    public int getTam() {
        return tam;
    }
    
    public boolean pilaVacia(){
        return cima == null;
    }
}
