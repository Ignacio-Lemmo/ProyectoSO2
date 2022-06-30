package Plantas;

public class Telefono {
    
    //Declaración de atributos.
    private Telefono pNext;
    private int prioridad;
    private int ID;
    private int contador;
    private int copas;
    private int planta;
    
    //Constructor.
    public Telefono(int ID, int prioridad, int copas, int planta){
        this.ID = ID;
        this.prioridad = prioridad;
        this.contador = 0;
        this.pNext = null;
        this.copas = copas;
        this.planta = planta;
    }
    
    //Métodos.
    public Telefono getPNext(){
        return(pNext);
    }
    
    public void setPNext(Telefono pNext) {
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
    
    public int getCopas(){
        return copas;
    }
    
    public int getPlanta(){
        return planta;
    }
    
    public void aumentar(){
        this.contador ++;
    }
    
    public void subir(){
        this.prioridad --;
    }
    
}
