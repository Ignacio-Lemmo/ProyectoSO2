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
    
    public Telefono2 Desencolar(){
        Telefono2 ultimo = null;
        if(!this.estaVacia()){
            if(size > 1){
                int contador = 1;
                Telefono2 contador2 = pFirst;
                while ((contador - 1) != size){
                    contador2 = contador2.getPNext();
                    contador ++;
                }
                ultimo = contador2.getPNext();
                size --;
                contador2.setPNext(null);
                this.setPLast(contador2);
                return (ultimo);
            }else if (size == 1){
                ultimo = pFirst;
                this.pFirst = null;
                this.pLast = null;
                this.size = 0;
                return (ultimo);
            }
        }
        return (ultimo);
    } 
}
