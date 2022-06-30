package Plantas;

import ProyectoSO2.Main;

public class Cola {
    
    //Declaración de atributos.
    private Telefono pFirst;
    private Telefono pLast;
    private int size;
    
    //Constructor.
    public Cola(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    //Métodos.
    public Telefono getPFist() {
        return pFirst;
    }
    
    public Telefono getPLast() {
        return pLast;
    }
    
    public void setPFirst(Telefono pFirst) {
        this.pFirst = pFirst;
    }
    
    public void setPLast(Telefono pLast) {
        this.pLast= pLast;
    }
    
    public boolean estaVacia(){
        if (pFirst == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void encolar(Telefono nuevo){
        if (this.estaVacia()) {
            this.pFirst = this.pLast= nuevo;
        } else {
            this.pLast.setPNext(nuevo);
            this.pLast= nuevo;
        }
        size++;
    }
    
    public Telefono desencolar() {
        Telefono nuevoNodo = null;
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
                Telefono telefono = this.desencolar();
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
                Telefono telefono = this.desencolar();
                telefono.setPNext(null);
                if (i == 0) {
                    string = "ID: " + Integer.toString(telefono.getID()) + ", Copas: " + Integer.toString(telefono.getCopas());
                }else{
                    string += "\nID: " + Integer.toString(telefono.getID()) + ", Copas: " + Integer.toString(telefono.getCopas());
                }
                this.encolar(telefono);
                } 
        }
        
        return string;
    }
    
    public void actualizar2(int planta){
        if(!this.estaVacia()){
            Telefono auxiliar = pFirst;
            if(pFirst.getContador() < 8){
                pFirst.aumentar();
            }
            for (int i = 0; i < size; i++) {
                if(auxiliar.getPNext() != null && auxiliar.getPNext().getContador() < 8){
                    auxiliar.getPNext().aumentar();
                }
                auxiliar = auxiliar.getPNext();  
            }
            while(pFirst.getContador() >= 8){
                pFirst.subir();
                pFirst.setContador(0);
                this.reEncolar(this.desencolar(), planta);
            }
        }
    }
    
    
    public static void reEncolar(Telefono telefono, int planta){
        if(telefono.getPrioridad() == 1 && planta == 1){
            Main.nivel11.encolar(telefono);
        }else if(telefono.getPrioridad() == 2 && planta == 1){
           Main.nivel21.encolar(telefono);
        }else if(telefono.getPrioridad() == 3 && planta == 1){
            Main.nivel31.encolar(telefono);
        }else if(telefono.getPrioridad() == 1 && planta == 2){
            Main.nivel12.encolar(telefono);
        }else if(telefono.getPrioridad() == 2 && planta == 2){
            Main.nivel22.encolar(telefono);
        }else if(telefono.getPrioridad() == 3 && planta == 2){
            Main.nivel32.encolar(telefono);
        }else{
            System.out.println("No Entra " + telefono.getPrioridad() + " " + telefono.getID() + " " + planta);
        }
    }
    
    public void actualizarRefuerzo(){
        double random = Math.random() * 100;
        Telefono seleccionado = null;
        if(random <= 40 && !this.estaVacia()){
            seleccionado = this.desencolar();
            this.reEncolar(seleccionado, seleccionado.getPlanta());
        }
    }
}
