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
        while(true){
            for (int i = 0; i < 2; i++) {
                Telefono2 telefono1 = Main.administrador.seleccionar(1);
                Telefono2 telefono2 = Main.administrador.seleccionar(2);
                System.out.println("Seleccionados");
                Inicio.cola11.setText(Main.nivel11.imprimir());
                Inicio.cola21.setText(Main.nivel21.imprimir());
                Inicio.cola31.setText(Main.nivel31.imprimir());

                Inicio.cola12.setText(Main.nivel12.imprimir());
                Inicio.cola22.setText(Main.nivel22.imprimir());
                Inicio.cola32.setText(Main.nivel32.imprimir());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Simulacion2.class.getName()).log(Level.SEVERE, null, ex);
                }
                Telefono2 seleccionado = Main.IA.selector(telefono1, telefono2);
            }
            Main.administrador.agregar();
            Main.administrador.agregar();
            Main.administrador.agregar();
            Main.administrador.agregar();
            System.out.println("Agregados");
            
            Inicio.cola11.setText(Main.nivel11.imprimir());
            Inicio.cola21.setText(Main.nivel21.imprimir());
            Inicio.cola31.setText(Main.nivel31.imprimir());
            
            Inicio.cola12.setText(Main.nivel12.imprimir());
            Inicio.cola22.setText(Main.nivel22.imprimir());
            Inicio.cola32.setText(Main.nivel32.imprimir());
        }
    }
}
