package Plantas;

import Interfaces.Combates;
import Interfaces.Simulacion;
import ProyectoSO2.Main;

public class Administrador {
    
    public Administrador(){
        
    }
    
    public void agregar(){
        double random1 = Math.random() * 100;
        double random21 = (Math.random() * 10000)/3;
        double random2 = Math.random() * 100;
        double random22 = (Math.random() * 10000)/3;
        Telefono nuevo1 = null;
        Telefono nuevo2 = null;
        int menos1 = this.restarCopas(1);
        int menos2 = this.restarCopas(2);
        int copas1 = (int)random21 - menos1;
        int copas2 = (int)random22 - menos2;
        if(copas1 < 1){
            copas1 = 0;
        }
        if(copas2 < 1){
            copas2 = 0;
        }
        
        if(Main.iniciales != 0){
            //Primera Planta.
            if(copas1 >= 3000){
                nuevo1 = new Telefono(Main.telefonos, 1, copas1, 1);
                Main.telefonos ++;
                Main.nivel11.encolar(nuevo1);
                
                Simulacion.ID1.setText(String.valueOf(nuevo1.getID()));
                Simulacion.prioridad1.setText("1");
                Simulacion.copas1.setText(String.valueOf(nuevo1.getCopas()));
                
                Simulacion.cola11.setText(Main.nivel11.imprimir(1));
                
            }else if(copas1 >= 2000){
                nuevo1 = new Telefono(Main.telefonos, 2, copas1, 1);
                Main.telefonos ++;
                Main.nivel21.encolar(nuevo1);
                
                Simulacion.ID1.setText(String.valueOf(nuevo1.getID()));
                Simulacion.prioridad1.setText("2");
                Simulacion.copas1.setText(String.valueOf(nuevo1.getCopas()));
                
                Simulacion.cola21.setText(Main.nivel21.imprimir(1));
                
            }else{
                nuevo1 = new Telefono(Main.telefonos, 3, copas1, 1);
                Main.telefonos ++;
                Main.nivel31.encolar(nuevo1);
                
                Simulacion.ID1.setText(String.valueOf(nuevo1.getID()));
                Simulacion.prioridad1.setText("3");
                Simulacion.copas1.setText(String.valueOf(nuevo1.getCopas()));
                
                Simulacion.cola31.setText(Main.nivel31.imprimir(1));
                
            }
            //Segunda Planta.
            if(copas2 >= 3000){
                nuevo2 = new Telefono(Main.telefonos, 1, copas2, 2);
                Main.telefonos ++;
                Main.nivel12.encolar(nuevo2);
                
                Simulacion.ID2.setText(String.valueOf(nuevo2.getID()));
                Simulacion.prioridad2.setText("1");
                Simulacion.copas2.setText(String.valueOf(nuevo2.getCopas()));
                
                Simulacion.cola12.setText(Main.nivel12.imprimir(1));
                
            }else if(copas2 >= 2000){
                nuevo2 = new Telefono(Main.telefonos, 2, copas2, 2);
                Main.telefonos ++;
                Main.nivel22.encolar(nuevo2);
                
                Simulacion.ID2.setText(String.valueOf(nuevo2.getID()));
                Simulacion.prioridad2.setText("2");
                Simulacion.copas2.setText(String.valueOf(nuevo2.getCopas()));
                
                Simulacion.cola22.setText(Main.nivel22.imprimir(1));
                
            }else{
                nuevo2 = new Telefono(Main.telefonos, 3, copas2, 2);
                Main.telefonos ++;
                Main.nivel32.encolar(nuevo2);
                
                Simulacion.ID2.setText(String.valueOf(nuevo2.getID()));
                Simulacion.prioridad2.setText("3");
                Simulacion.copas2.setText(String.valueOf(nuevo2.getCopas()));
                
                Simulacion.cola32.setText(Main.nivel32.imprimir(1));
            }
        }else{
            if(random1 <= 70){
               //Primera Planta.
                if(copas1 >= 3000){
                    nuevo1 = new Telefono(Main.telefonos, 1, copas1, 1);
                    Main.telefonos ++;
                    Main.nivel11.encolar(nuevo1);

                    Simulacion.ID1.setText(String.valueOf(nuevo1.getID()));
                    Simulacion.prioridad1.setText("1");

                    Simulacion.cola11.setText(Main.nivel11.imprimir(1));

                }else if(copas1 >= 2000){
                    nuevo1 = new Telefono(Main.telefonos, 2, copas1, 1);
                    Main.telefonos ++;
                    Main.nivel21.encolar(nuevo1);

                    Simulacion.ID1.setText(String.valueOf(nuevo1.getID()));
                    Simulacion.prioridad1.setText("2");

                    Simulacion.cola21.setText(Main.nivel21.imprimir(1));

                }else{
                    nuevo1 = new Telefono(Main.telefonos, 3, copas1, 1);
                    Main.telefonos ++;
                    Main.nivel31.encolar(nuevo1);

                    Simulacion.ID1.setText(String.valueOf(nuevo1.getID()));
                    Simulacion.prioridad1.setText("3");

                    Simulacion.cola31.setText(Main.nivel31.imprimir(1));

                }
                //Segunda Planta.
                if (random2 <= 70){
                    if(copas2 >= 3000){
                        nuevo2 = new Telefono(Main.telefonos, 1, copas2, 2);
                        Main.telefonos ++;
                        Main.nivel12.encolar(nuevo2);

                        Simulacion.ID2.setText(String.valueOf(nuevo2.getID()));
                        Simulacion.prioridad2.setText("1");

                        Simulacion.cola12.setText(Main.nivel12.imprimir(1));

                    }else if(copas2 >= 2000){
                        nuevo2 = new Telefono(Main.telefonos, 2, copas2, 2);
                        Main.telefonos ++;
                        Main.nivel22.encolar(nuevo2);

                        Simulacion.ID2.setText(String.valueOf(nuevo2.getID()));
                        Simulacion.prioridad2.setText("2");

                        Simulacion.cola22.setText(Main.nivel22.imprimir(1));

                    }else{
                        nuevo2 = new Telefono(Main.telefonos, 3,copas2, 2);
                        Main.telefonos ++;
                        Main.nivel32.encolar(nuevo2);

                        Simulacion.ID2.setText(String.valueOf(nuevo2.getID()));
                        Simulacion.prioridad2.setText("3");

                        Simulacion.cola32.setText(Main.nivel32.imprimir(1));
                } 
                }
            }
        }
    }
    
    public void actualizar(){
        //Actualizar cola.
        
    }
    
    public Telefono seleccionar(int planta){
        Telefono telefono = null;
        if (planta == 1){
            //Planta 1.
            if (!Main.nivel11.estaVacia()){
               //Verificar cola de nivel 1. 
               telefono = Main.nivel11.desencolar();
               
               Combates.ID1.setText(String.valueOf(telefono.getID()));
               Combates.prioridad1.setText(String.valueOf(telefono.getPrioridad()));
               Combates.copas1.setText(String.valueOf(telefono.getCopas()));
            }else if (!Main.nivel21.estaVacia()){
                //Verificar cola de nivel 2.
                telefono = Main.nivel21.desencolar();
                
                Combates.ID1.setText(String.valueOf(telefono.getID()));
                Combates.prioridad1.setText(String.valueOf(telefono.getPrioridad()));
                Combates.copas1.setText(String.valueOf(telefono.getCopas()));
            }else if (!Main.nivel31.estaVacia()){
                //Verificar cola de nivel 3.
                telefono = Main.nivel31.desencolar();
                
                Combates.ID1.setText(String.valueOf(telefono.getID()));
                Combates.prioridad1.setText(String.valueOf(telefono.getPrioridad()));
                Combates.copas1.setText(String.valueOf(telefono.getCopas()));
            }
        }else{
          //Planta 2.
            if (!Main.nivel12.estaVacia()){
               //Verificar cola de nivel 1. 
               telefono = Main.nivel12.desencolar();
               
               Combates.ID2.setText(String.valueOf(telefono.getID()));
               Combates.prioridad2.setText(String.valueOf(telefono.getPrioridad()));
               Combates.copas2.setText(String.valueOf(telefono.getCopas()));
            }else if (!Main.nivel22.estaVacia()){
                //Verificar cola de nivel 2.
                telefono = Main.nivel22.desencolar();
                
                Combates.ID2.setText(String.valueOf(telefono.getID()));
                Combates.prioridad2.setText(String.valueOf(telefono.getPrioridad()));
                Combates.copas2.setText(String.valueOf(telefono.getCopas()));
            }else if (!Main.nivel32.estaVacia()){
                //Verificar cola de nivel 3.
                telefono = Main.nivel32.desencolar();
                
                Combates.ID2.setText(String.valueOf(telefono.getID()));
                Combates.prioridad2.setText(String.valueOf(telefono.getPrioridad()));
                Combates.copas2.setText(String.valueOf(telefono.getCopas()));
            }  
        }
        try{
            telefono.setContador(0);  
        }catch(Exception e){
            
        }
        return (telefono);
    }
    
    public static void actualizarInterfaz(){
        Simulacion.cola11.setText(Main.nivel11.imprimir(1));
        Simulacion.cola21.setText(Main.nivel21.imprimir(1));
        Simulacion.cola31.setText(Main.nivel31.imprimir(1));

        Simulacion.cola12.setText(Main.nivel12.imprimir(1));
        Simulacion.cola22.setText(Main.nivel22.imprimir(1));
        Simulacion.cola32.setText(Main.nivel32.imprimir(1));
        
        Simulacion.refuerzo.setText(Main.refuerzo1.imprimir(2));
        Simulacion.refuerzo2.setText(Main.refuerzo2.imprimir(2));
    }
    
    public static int restarCopas(int tipo){
        double menos = 0;
        if(tipo == 1){
            double pantalla = Math.random() * 100;
            double pin = Math.random() * 100;
            
            for (int i = 1; i < 4; i++) {
                double boton = Math.random() * 100;
                if(boton > 85){
                    menos += 200;
                }
            }
            
            for (int i = 1; i < 3; i++) {
                double camara = Math.random() * 100;
                if(camara > 80){
                    menos += 300;
                }
            }
            
            if(pin > 84){
                menos += 200;
            }
            
            if(pantalla > 75){
                menos += 1000;
            }
        }else{
            double pantalla = Math.random() * 100;
            double pin = Math.random() * 100;
            
            for (int i = 1; i < 2; i++) {
                double boton = Math.random() * 100;
                if(boton > 85){
                    menos += 200;
                }
            }
            
            for (int i = 1; i < 2; i++) {
                double camara = Math.random() * 100;
                if(camara > 80){
                    menos += 300;
                }
            }
            
            if(pin > 84){
                menos += 200;
            }
            
            if(pantalla > 75){
                menos += 1000;
            }
        }
        return (int) menos;
    }
    
//    public void actualizarRefuerzo(){
//        double random = Math.random() * 100;
//        Telefono2 seleccionado = null;
//        Telefono2 seleccionado2 = null;
//        if(random <= 40){
//            if(!Main.refuerzo1.estaVacia()){
//                seleccionado = Main.refuerzo1.desencolar();
//                Main.refuerzo1.reEncolar(seleccionado, seleccionado.getPlanta());
//            }
//            if(!Main.refuerzo2.estaVacia()){
//                seleccionado2 = Main.refuerzo2.desencolar();
//                Main.refuerzo2.reEncolar(seleccionado, seleccionado2.getPlanta());
//            }
//        }
//    }
}
