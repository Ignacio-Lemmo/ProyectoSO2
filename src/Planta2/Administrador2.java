package Planta2;

import ProyectoSO2.Main;

public class Administrador2 {
    
    public Administrador2(){
        
    }
    
    public void agregar(){
        double random = Math.random() * 100;
        double random2 = Math.random() * 3;
        Telefono2 nuevo = null;
        if(Main.telefonos == 0){
            if(random2 >= 3){
                nuevo = new Telefono2(Main.telefonos, 1);
                Main.telefonos ++;
                Main.nivel1.encolar(nuevo);
            }else if(random2 >= 2){
                nuevo = new Telefono2(Main.telefonos, 2);
                Main.telefonos ++;
                Main.nivel2.encolar(nuevo);
            }else{
                nuevo = new Telefono2(Main.telefonos, 3);
                Main.telefonos ++;
                Main.nivel3.encolar(nuevo);
            }
        }else{
            if(random <= 70){
               if(random2 >= 3){
                    nuevo = new Telefono2(Main.telefonos, 1);
                    Main.telefonos ++;
                    Main.nivel1.encolar(nuevo);
                }else if(random2 >= 2){
                    nuevo = new Telefono2(Main.telefonos, 2);
                    Main.telefonos ++;
                    Main.nivel2.encolar(nuevo);
                }else{
                    nuevo = new Telefono2(Main.telefonos, 3);
                    Main.telefonos ++;
                    Main.nivel3.encolar(nuevo);
                } 
            }
        }
    }
    
    public void actualizar(){
        //Actualizar cola.
        
    }
    
    public Telefono2 establecer(){
        if (!Main.nivel1.estaVacia()){
           //Verificar cola de nivel 1. 
           
        }else if (!Main.nivel2.estaVacia()){
            //Verificar cola de nivel 2.
            
        }else if (!Main.nivel2.estaVacia()){
            //Verificar cola de nivel 3.
            
        }
        return (null);
    }
}
