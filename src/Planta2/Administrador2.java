package Planta2;

import Interfaces.Combates;
import Interfaces.Inicio;
import ProyectoSO2.Main;

public class Administrador2 {
    
    public Administrador2(){
        
    }
    
    public void agregar(){
        double random1 = Math.random() * 100;
        double random21 = Math.random() * 100;
        double random2 = Math.random() * 100;
        double random22 = Math.random() * 100;
        Telefono2 nuevo1 = null;
        Telefono2 nuevo2 = null;
        
        if(Main.telefonos == 0){
            //Primera Planta.
            if(random21 >= 66){
                nuevo1 = new Telefono2(Main.telefonos, 1);
                Main.telefonos ++;
                Main.nivel11.encolar(nuevo1);
                
                Inicio.ID1.setText(String.valueOf(nuevo1.getID()));
                Inicio.prioridad1.setText("1");
                Inicio.copas1.setText(String.valueOf(nuevo1.getCopas()));
                
                Inicio.cola11.setText(Main.nivel11.imprimir());
                
            }else if(random21 >= 33){
                nuevo1 = new Telefono2(Main.telefonos, 2);
                Main.telefonos ++;
                Main.nivel21.encolar(nuevo1);
                
                Inicio.ID1.setText(String.valueOf(nuevo1.getID()));
                Inicio.prioridad1.setText("2");
                Inicio.copas1.setText(String.valueOf(nuevo1.getCopas()));
                
                Inicio.cola21.setText(Main.nivel21.imprimir());
                
            }else{
                nuevo1 = new Telefono2(Main.telefonos, 3);
                Main.telefonos ++;
                Main.nivel31.encolar(nuevo1);
                
                Inicio.ID1.setText(String.valueOf(nuevo1.getID()));
                Inicio.prioridad1.setText("3");
                Inicio.copas1.setText(String.valueOf(nuevo1.getCopas()));
                
                Inicio.cola31.setText(Main.nivel31.imprimir());
                
            }
            //Segunda Planta.
            if(random22 >= 66){
                nuevo2 = new Telefono2(Main.telefonos, 1);
                Main.telefonos ++;
                Main.nivel12.encolar(nuevo2);
                
                Inicio.ID2.setText(String.valueOf(nuevo2.getID()));
                Inicio.prioridad2.setText("1");
                Inicio.copas2.setText(String.valueOf(nuevo2.getCopas()));
                
                Inicio.cola12.setText(Main.nivel12.imprimir());
                
            }else if(random22 >= 33){
                nuevo2 = new Telefono2(Main.telefonos, 2);
                Main.telefonos ++;
                Main.nivel22.encolar(nuevo2);
                
                Inicio.ID2.setText(String.valueOf(nuevo2.getID()));
                Inicio.prioridad2.setText("2");
                Inicio.copas2.setText(String.valueOf(nuevo2.getCopas()));
                
                Inicio.cola22.setText(Main.nivel22.imprimir());
                
            }else{
                nuevo2 = new Telefono2(Main.telefonos, 3);
                Main.telefonos ++;
                Main.nivel32.encolar(nuevo2);
                
                Inicio.ID2.setText(String.valueOf(nuevo2.getID()));
                Inicio.prioridad2.setText("3");
                Inicio.copas2.setText(String.valueOf(nuevo2.getCopas()));
                
                Inicio.cola32.setText(Main.nivel32.imprimir());
            }
        }else{
            if(random1 <= 70){
               //Primera Planta.
                if(random21 >= 66){
                    nuevo1 = new Telefono2(Main.telefonos, 1);
                    Main.telefonos ++;
                    Main.nivel11.encolar(nuevo1);

                    Inicio.ID1.setText(String.valueOf(nuevo1.getID()));
                    Inicio.prioridad1.setText("1");

                    Inicio.cola11.setText(Main.nivel11.imprimir());

                }else if(random21 >= 33){
                    nuevo1 = new Telefono2(Main.telefonos, 2);
                    Main.telefonos ++;
                    Main.nivel21.encolar(nuevo1);

                    Inicio.ID1.setText(String.valueOf(nuevo1.getID()));
                    Inicio.prioridad1.setText("2");

                    Inicio.cola21.setText(Main.nivel21.imprimir());

                }else{
                    nuevo1 = new Telefono2(Main.telefonos, 3);
                    Main.telefonos ++;
                    Main.nivel31.encolar(nuevo1);

                    Inicio.ID1.setText(String.valueOf(nuevo1.getID()));
                    Inicio.prioridad1.setText("3");

                    Inicio.cola31.setText(Main.nivel31.imprimir());

                }
                //Segunda Planta.
                if(random22 >= 66){
                    nuevo2 = new Telefono2(Main.telefonos, 1);
                    Main.telefonos ++;
                    Main.nivel12.encolar(nuevo2);

                    Inicio.ID2.setText(String.valueOf(nuevo2.getID()));
                    Inicio.prioridad2.setText("1");

                    Inicio.cola12.setText(Main.nivel12.imprimir());

                }else if(random22 >= 33){
                    nuevo2 = new Telefono2(Main.telefonos, 2);
                    Main.telefonos ++;
                    Main.nivel22.encolar(nuevo2);

                    Inicio.ID2.setText(String.valueOf(nuevo2.getID()));
                    Inicio.prioridad2.setText("2");

                    Inicio.cola22.setText(Main.nivel22.imprimir());

                }else{
                    nuevo2 = new Telefono2(Main.telefonos, 3);
                    Main.telefonos ++;
                    Main.nivel32.encolar(nuevo2);

                    Inicio.ID2.setText(String.valueOf(nuevo2.getID()));
                    Inicio.prioridad2.setText("3");

                    Inicio.cola32.setText(Main.nivel32.imprimir());
                } 
            }
        }
    }
    
    public void actualizar(){
        //Actualizar cola.
        
    }
    
    public Telefono2 seleccionar(int planta){
        Telefono2 telefono = null;
        if (planta == 1){
            //Planta 1.
            if (!Main.nivel11.estaVacia()){
               //Verificar cola de nivel 1. 
               telefono = Main.nivel11.desencolar();
               
               Combates.ID1.setText(String.valueOf(telefono.getID()));
               Combates.prioridad1.setText(String.valueOf(telefono.getPrioridad()));
            }else if (!Main.nivel21.estaVacia()){
                //Verificar cola de nivel 2.
                telefono = Main.nivel21.desencolar();
                
                Combates.ID1.setText(String.valueOf(telefono.getID()));
                Combates.prioridad1.setText(String.valueOf(telefono.getPrioridad()));
            }else if (!Main.nivel31.estaVacia()){
                //Verificar cola de nivel 3.
                telefono = Main.nivel31.desencolar();
                
                Combates.ID1.setText(String.valueOf(telefono.getID()));
                Combates.prioridad1.setText(String.valueOf(telefono.getPrioridad()));
            }
        }else{
          //Planta 2.
            if (!Main.nivel12.estaVacia()){
               //Verificar cola de nivel 1. 
               telefono = Main.nivel12.desencolar();
               
               Combates.ID2.setText(String.valueOf(telefono.getID()));
               Combates.prioridad2.setText(String.valueOf(telefono.getPrioridad()));
            }else if (!Main.nivel22.estaVacia()){
                //Verificar cola de nivel 2.
                telefono = Main.nivel22.desencolar();
                
                Combates.ID2.setText(String.valueOf(telefono.getID()));
                Combates.prioridad2.setText(String.valueOf(telefono.getPrioridad()));
            }else if (!Main.nivel32.estaVacia()){
                //Verificar cola de nivel 3.
                telefono = Main.nivel32.desencolar();
                
                Combates.ID2.setText(String.valueOf(telefono.getID()));
                Combates.prioridad2.setText(String.valueOf(telefono.getPrioridad()));
            }  
        }
        try{
            telefono.setContador(0);  
        }catch(Exception e){
            
        }
        return (telefono);
    }
    
    public static void actualizarInterfaz(){
        Inicio.cola11.setText(Main.nivel11.imprimir());
        Inicio.cola21.setText(Main.nivel21.imprimir());
        Inicio.cola31.setText(Main.nivel31.imprimir());

        Inicio.cola12.setText(Main.nivel12.imprimir());
        Inicio.cola22.setText(Main.nivel22.imprimir());
        Inicio.cola32.setText(Main.nivel32.imprimir());
    }
}
