package Planta2;

import Interfaces.Combates;
import Interfaces.Inicio;
import ProyectoSO2.Main;

public class IA2 {
    public Telefono2 selector(Telefono2 telefono1, Telefono2 telefono2){
        double random = Math.random() * 100;
        double random2 = Math.random() * 100;
        Telefono2 seleccionado = null;
        if (random >= 60){
            //Alguno puede salir al mercado
            if (telefono1.getCopas() > telefono2.getCopas()){
                Combates.evento.setText("Hay Ganador");
                
                seleccionado = telefono1;
                
                int suma = Integer.parseInt(Inicio.mercado1.getText()) + 1;
                Inicio.mercado1.setText(String.valueOf(suma));
                
                int suma2 = Integer.parseInt(Inicio.desechados2.getText()) + 1;
                Inicio.desechados2.setText(String.valueOf(suma));
                
                Combates.ganador.setText("Planta1, ID: " + seleccionado.getID() + ", Número de Copas: " + seleccionado.getCopas());
            }else if (telefono1.getCopas() < telefono2.getCopas()){
                Combates.evento.setText("Hay Ganador");
                
                seleccionado = telefono2;
                
                int suma = Integer.parseInt(Inicio.mercado2.getText()) + 1;
                Inicio.mercado2.setText(String.valueOf(suma));
                
                int suma2 = Integer.parseInt(Inicio.desechados1.getText()) + 1;
                Inicio.desechados1.setText(String.valueOf(suma)); 
                
                Combates.ganador.setText("Planta2, ID: " + seleccionado.getID() + ", Número de Copas: " + seleccionado.getCopas());
            }else {
                //Empate por copas.
                Combates.evento.setText("Hay empate por Copas, se decidirá aleatoriamente");
                if (random2 > 50){
                    seleccionado = telefono1;

                    int suma = Integer.parseInt(Inicio.mercado1.getText()) + 1;
                    Inicio.mercado1.setText(String.valueOf(suma));

                    int suma2 = Integer.parseInt(Inicio.desechados2.getText()) + 1;
                    Inicio.desechados2.setText(String.valueOf(suma));

                    Combates.ganador.setText("Planta1, ID: " + seleccionado.getID() + ", Número de Copas: " + seleccionado.getCopas());
                }else{
                    seleccionado = telefono2;
                    int suma = Integer.parseInt(Inicio.mercado2.getText()) + 1;
                    Inicio.mercado2.setText(String.valueOf(suma));

                    int suma2 = Integer.parseInt(Inicio.desechados1.getText()) + 1;
                    Inicio.desechados1.setText(String.valueOf(suma)); 

                    Combates.ganador.setText("Planta2, ID: " + seleccionado.getID() + ", Número de Copas: " + seleccionado.getCopas());
                }
            }
        }else if (random <=27){
            //Empate.
            
            Combates.evento.setText("Hay Empate");
            Combates.ganador.setText("Ninguno");
            
            //Primera planta.
            if (telefono1.getPrioridad() == 1){
                Main.nivel11.encolar(telefono1);
                
                Inicio.cola11.setText(Main.nivel11.imprimir());
            }else if (telefono1.getPrioridad() == 2){
                Main.nivel21.encolar(telefono1);
                
                Inicio.cola21.setText(Main.nivel21.imprimir());
            }else{
                Main.nivel31.encolar(telefono1);
                
                Inicio.cola31.setText(Main.nivel31.imprimir());
            }
            //Segunda planta.
            if (telefono2.getPrioridad() == 1){
                Main.nivel12.encolar(telefono2);
                
                Inicio.cola12.setText(Main.nivel12.imprimir());
            }else if (telefono2.getPrioridad() == 2){
                Main.nivel22.encolar(telefono2);
                
                Inicio.cola22.setText(Main.nivel22.imprimir());
            }else{
                Main.nivel32.encolar(telefono2);
                
                Inicio.cola32.setText(Main.nivel32.imprimir());
            }
        }else{
            Combates.evento.setText("Enviados a Refuerzo");
            Combates.ganador.setText("Ninguno");
        }
        return(seleccionado);
    }
}
