package Planta2;

import Interfaces.Inicio;
import ProyectoSO2.Main;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulacion2 extends Thread{
    
    public void run(){
        Main.administrador.agregar();
        Main.administrador.agregar();
        Main.administrador.agregar();
        Main.administrador.agregar();
        Main.administrador.agregar();
        Main.administrador.agregar();
        Main.administrador.agregar();
        Main.administrador.agregar();
        
        Administrador2.actualizarInterfaz();
        while(true){
            try{
//                for (int i = 0; i < 2; i++) {                
                Administrador2.actualizarInterfaz();

                Telefono2 telefono1 = Main.administrador.seleccionar(1);
                Telefono2 telefono2 = Main.administrador.seleccionar(2);
                
                Administrador2.actualizarInterfaz();
                
                Main.nivel21.actualizar(1);
                Main.nivel31.actualizar(1);
                
                Main.nivel22.actualizar(2);
                Main.nivel32.actualizar(2);
                
                Administrador2.actualizarInterfaz();

                Thread.sleep(3000);
                
                Telefono2 seleccionado = Main.IA.selector(telefono1, telefono2);
                
                Administrador2.actualizarInterfaz();
                
                Main.administrador.agregar();
                
                Administrador2.actualizarInterfaz();
//            }
            }catch(Exception e){
                System.out.println("MEGA PEO");
            }
        }
    }
}
