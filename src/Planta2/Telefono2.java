package Planta2;

public class Telefono2 {
    
    //Declaración de atributos.
    private Telefono2 pNext;
    private int prioridad;
    private int ID;
    private int contador;
    
    //Constructor.
    public Telefono2(int ID, int prioridad){
        this.ID = ID;
        this.prioridad = prioridad;
        this.contador = 0;
        this.pNext = null;
    }
    
    //Métodos.
    public Telefono2 getPNext(){
        return(pNext);
    }
    
    public void setPNext(Telefono2 pNext) {
        this.pNext = pNext;
    }
    
    public int getID() {
        return ID;
    }
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public void aumentar(){
        this.contador ++;
    }
    
    public void subir(){
        this.prioridad --;
    }
}
