package Plantas;

import Interfaces.Combates;
import Interfaces.Simulacion;
import ProyectoSO2.Main;

public class IA {
    public Telefono selector(Telefono telefono1, Telefono telefono2){
        double random = Math.random() * 100;
        double random2 = Math.random() * 100;
        Telefono seleccionado = null;
        if (random >= 60){
            //Alguno puede salir al mercado
            if(random2 > 50){
                Combates.evento.setText("Hay Ganador");
                Simulacion.evento.setText("Hay Ganador");
                
                seleccionado = telefono1;
                
                Main.mercado1 ++;
                
                int suma = Integer.parseInt(Simulacion.mercado1.getText()) + 1;
                Simulacion.mercado1.setText(String.valueOf(suma));
                
                int suma2 = Integer.parseInt(Simulacion.desechados2.getText()) + 1;
                Simulacion.desechados2.setText(String.valueOf(suma));
                
                Combates.ganador.setText("Planta1, ID: " + seleccionado.getID() + ", Número de Copas: " + seleccionado.getCopas());
            }else{
                Combates.evento.setText("Hay Ganador");
                Simulacion.evento.setText("Hay Ganador");
                seleccionado = telefono2;
                
                Main.mercado2 ++;
                
                int suma = Integer.parseInt(Simulacion.mercado2.getText()) + 1;
                Simulacion.mercado2.setText(String.valueOf(suma));
                
                int suma2 = Integer.parseInt(Simulacion.desechados1.getText()) + 1;
                Simulacion.desechados1.setText(String.valueOf(suma)); 
                
                Combates.ganador.setText("Planta2, ID: " + seleccionado.getID() + ", Número de Copas: " + seleccionado.getCopas());
            }
        }else if (random <=27){
            //Empate.
            
            Combates.evento.setText("Hay Empate");
            Combates.ganador.setText("Ninguno");
            Simulacion.evento.setText("Hay empate");
            
            
            //Primera planta.
            if (telefono1.getPrioridad() == 1){
                Main.nivel11.encolar(telefono1);
                
                Simulacion.cola11.setText(Main.nivel11.imprimir(1));
            }else if (telefono1.getPrioridad() == 2){
                Main.nivel21.encolar(telefono1);
                
                Simulacion.cola21.setText(Main.nivel21.imprimir(1));
            }else{
                Main.nivel31.encolar(telefono1);
                
                Simulacion.cola31.setText(Main.nivel31.imprimir(1));
            }
            //Segunda planta.
            if (telefono2.getPrioridad() == 1){
                Main.nivel12.encolar(telefono2);
                
                Simulacion.cola12.setText(Main.nivel12.imprimir(1));
            }else if (telefono2.getPrioridad() == 2){
                Main.nivel22.encolar(telefono2);
                
                Simulacion.cola22.setText(Main.nivel22.imprimir(1));
            }else{
                Main.nivel32.encolar(telefono2);
                
                Simulacion.cola32.setText(Main.nivel32.imprimir(1));
            }
        }else{
            Combates.evento.setText("Enviados a Refuerzo");
            Combates.ganador.setText("Ninguno");
            Simulacion.evento.setText("Enviados a Refuerzo");
            
            Main.refuerzo1.encolar(telefono1);
            Main.refuerzo2.encolar(telefono2);
            
            Simulacion.refuerzo.setText(Main.refuerzo1.imprimir(2));
            Simulacion.refuerzo2.setText(Main.refuerzo2.imprimir(2));
        }
        return(seleccionado);
    }
}
