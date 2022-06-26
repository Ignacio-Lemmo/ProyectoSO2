package Planta2;

import Interfaces.Combates;
import Interfaces.Inicio;
import ProyectoSO2.Main;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulacion2 extends Thread{
    
    public void run(){
        Main.administrador.agregar();
        Administrador2.actualizarInterfaz();
        while(true){
            try{
                for (int i = 0; i < 2; i++) {     
                    if((!Main.nivel11.estaVacia() && (!Main.nivel12.estaVacia() || !Main.nivel22.estaVacia() || !Main.nivel32.estaVacia())) || (!Main.nivel21.estaVacia() && (!Main.nivel12.estaVacia() || !Main.nivel22.estaVacia() || !Main.nivel32.estaVacia())) || (!Main.nivel31.estaVacia() && (!Main.nivel12.estaVacia() || !Main.nivel22.estaVacia() || !Main.nivel32.estaVacia()))){
                        Administrador2.actualizarInterfaz();
                        
                        Thread.sleep(2000);
                        
                        Telefono2 telefono1 = Main.administrador.seleccionar(1);
                        Telefono2 telefono2 = Main.administrador.seleccionar(2);

                        Administrador2.actualizarInterfaz();

                        Main.nivel21.actualizar2(1);
                        Main.nivel31.actualizar2(1);

                        Main.nivel22.actualizar2(2);
                        Main.nivel32.actualizar2(2);
                        
                        Main.refuerzo1.actualizarRefuerzo();
                        Main.refuerzo2.actualizarRefuerzo();

                        Administrador2.actualizarInterfaz();
                        
                        Combates.evento.setText("Verificando...");
                        Combates.ganador.setText("Seleccionando...");
                        
                        Inicio.estadoAI.setText("Trabajando");
                        
                        Thread.sleep(2000);

                        Telefono2 seleccionado = Main.IA.selector(telefono1, telefono2);
                        
                        Thread.sleep(1000);
                        
                        Inicio.estadoAI.setText("Esperando");
                        Inicio.evento.setText("Esperando");
                        
                        Thread.sleep(3000);

                        Administrador2.actualizarInterfaz();
                    }else{
                        Main.refuerzo1.actualizarRefuerzo();
                        Main.refuerzo2.actualizarRefuerzo();
                    }
                }
                    Main.administrador.agregar();

                    Administrador2.actualizarInterfaz();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
