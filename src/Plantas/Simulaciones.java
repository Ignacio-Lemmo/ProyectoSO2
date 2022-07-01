package Plantas;

import Interfaces.Combates;
import Interfaces.Simulacion;
import ProyectoSO2.Main;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulaciones extends Thread{
    
    public void run(){
        for (int i = 0; i < Main.iniciales; i++) {
            Main.administrador.agregar();
        }
            Main.iniciales = 0;
            Administrador.actualizarInterfaz();
        while(true){
            try{
                for (int i = 0; i < 2; i++) {     
                    if((!Main.nivel11.estaVacia() && (!Main.nivel12.estaVacia() || !Main.nivel22.estaVacia() || !Main.nivel32.estaVacia())) || (!Main.nivel21.estaVacia() && (!Main.nivel12.estaVacia() || !Main.nivel22.estaVacia() || !Main.nivel32.estaVacia())) || (!Main.nivel31.estaVacia() && (!Main.nivel12.estaVacia() || !Main.nivel22.estaVacia() || !Main.nivel32.estaVacia()))){
                        Administrador.actualizarInterfaz();
                                               
                        Telefono telefono1 = Main.administrador.seleccionar(1);
                        Telefono telefono2 = Main.administrador.seleccionar(2);

                        Administrador.actualizarInterfaz();

                        Main.nivel21.actualizar2(1);
                        Main.nivel31.actualizar2(1);

                        Main.nivel22.actualizar2(2);
                        Main.nivel32.actualizar2(2);
                        
                        Main.refuerzo1.actualizarRefuerzo();
                        Main.refuerzo2.actualizarRefuerzo();

                        Administrador.actualizarInterfaz();
                        
                        Combates.evento.setText("Verificando...");
                        Combates.ganador.setText("Seleccionando...");
                        
                        Simulacion.estadoAI.setText("Trabajando...");
                        
                        Thread.sleep(Main.segundos);
                        
                        Telefono seleccionado = Main.IA.selector(telefono1, telefono2);
                        
                        Simulacion.estadoAI.setText("Esperando...");
                        
                        //Thread.sleep(3000);
                        
                        Simulacion.evento.setText("Esperando...");

                        Administrador.actualizarInterfaz();
                        
                    }else{
                        Main.refuerzo1.actualizarRefuerzo();
                        Main.refuerzo2.actualizarRefuerzo();
                    }
                }
                for (int i = 0; i < Main.agregados; i++) {
                    Main.administrador.agregar();

                    Administrador.actualizarInterfaz();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
