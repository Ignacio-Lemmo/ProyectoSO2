package Planta2;

import ProyectoSO2.Main;

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
        if (pFirst == null){
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
    
    public String imprimir(int tipo){
        String string = "";
        if (tipo == 1){
            for (int i = 0; i < size; i++) {
                Telefono2 telefono = this.desencolar();
                telefono.setPNext(null);
                if (i == 0) {
                    string = "ID: " + Integer.toString(telefono.getID()) + ", Copas: " + Integer.toString(telefono.getCopas()) + ", Contador: " + Integer.toString(telefono.getContador());
                }else{
                    string += "\nID: " + Integer.toString(telefono.getID()) + ", Copas: " + Integer.toString(telefono.getCopas()) + ", Contador: " + Integer.toString(telefono.getContador());
                }
                this.encolar(telefono);
                }
        }else{
            for (int i = 0; i < size; i++) {
                Telefono2 telefono = this.desencolar();
                telefono.setPNext(null);
                if (i == 0) {
                    string = "ID: " + Integer.toString(telefono.getID()) + ", Copas: " + Integer.toString(telefono.getCopas()) + ", Planta " + Integer.toString(telefono.getPlanta());
                }else{
                    string += "\nID: " + Integer.toString(telefono.getID()) + ", Copas: " + Integer.toString(telefono.getCopas()) + ", Planta " + Integer.toString(telefono.getPlanta());
                }
                this.encolar(telefono);
                } 
        }
        
        return string;
    }
    
    public void actualizar(int planta){
        if(!this.estaVacia()){
            Telefono2 auxiliar = pFirst;
            if(pFirst.getContador() < 8){
                pFirst.aumentar();
            }else if(pFirst.getContador() >= 8){
                pFirst.subir();
                pFirst.setContador(0);
                Telefono2 subido = this.desencolar();
                this.reEncolar(subido, planta);
            }
            for (int i = 0; i < size; i++) {
                if(auxiliar.getPNext() != null && auxiliar.getPNext().getContador() < 8){
                    auxiliar.getPNext().aumentar();
                }
                auxiliar = auxiliar.getPNext();  
            }
        }
    }
    
    public static void reEncolar(Telefono2 telefono, int planta){
        if(telefono.getPrioridad() == 1 && planta == 1){
            Main.nivel11.encolar(telefono);
        }else if(telefono.getPrioridad() == 2 && planta == 1){
           Main.nivel21.encolar(telefono);
        }else if(telefono.getPrioridad() == 1 && planta == 2){
            Main.nivel12.encolar(telefono);
        }else if(telefono.getPrioridad() == 2 && planta == 2){
            Main.nivel22.encolar(telefono);
        }else{
            System.out.println("No Entra " + telefono.getPrioridad() + " " + telefono.getID() + " " + planta);
        }
    }
    
    public void actualizarRefuerzo(){
        double random = Math.random() * 100;
        Telefono2 seleccionado = null;
        if(random <= 40){
            seleccionado = this.desencolar();
            this.reEncolar(seleccionado, seleccionado.getPlanta());
        }
    }
}
