package Planta2;

public class Cola2 {
    
    //Declaración de atributos.
    private Telefono2 pFirst;
    private Telefono2 pLast;
    private int size;
    
    //Constructor.
    public Cola2(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    //Métodos.
    public Telefono2 getPFist() {
        return pFirst;
    }
    
    public Telefono2 getPLast() {
        return pLast;
    }
    
    public void setPFirst(Telefono2 pFirst) {
        this.pFirst = pFirst;
    }
    
    public void setPLast(Telefono2 pLast) {
        this.pLast= pLast;
    }
    
    public boolean estaVacia(){
        if (pFirst == null && pLast == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void encolar(Telefono2 nuevo){
        if (this.estaVacia()) {
            this.pFirst = this.pLast= nuevo;
        } else {
            this.pLast.setPNext(nuevo);
            this.pLast= nuevo;
        }
        size++;
    }
    
    public Telefono2 desencolar() {
        Telefono2 nuevoNodo = null;
        switch (this.size) {
            case 0:
                break;
            case 1:
                nuevoNodo = this.pFirst;
                this.pFirst = null;
                this.pLast = null;
                this.size = 0;
                break;
            default:
                nuevoNodo = this.pFirst;
                pFirst = pFirst.getPNext();
                size --;
                break;
        }
        return nuevoNodo;
    }
    
    public String imprimir(){
        String string = "";
        for (int i = 0; i < size; i++) {
            Telefono2 nodo = this.desencolar();
            nodo.setPNext(null);
            if (i == 0) {
                string = Integer.toString(nodo.getID());
            }else{
                string += "\n" + Integer.toString(nodo.getID());
            }
            this.encolar(nodo);
        }
        return string;
    }
    
}
