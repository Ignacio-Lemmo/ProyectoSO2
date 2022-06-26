package Planta2;

import ProyectoSO2.Main;

public class IA2 {
    public Telefono2 selector(Telefono2 telefono1, Telefono2 telefono2){
        double random = Math.random() * 100;
        double random2 = Math.random() *100;
        Telefono2 seleccionado = null;
        if (random >= 40){
            //Alguno puede salir al mercado.
            System.out.println("Hay Ganador");
            if (random2 >= 50){
                seleccionado = telefono1;
            }else{
                seleccionado = telefono2;
            }
        }else if (random >=27 && random < 40){
            //Empate.
            System.out.println("Hay Empate");
            //Primera planta.
            if (telefono1.getPrioridad() == 1){
                Main.nivel11.encolar(telefono1);
            }else if (telefono1.getPrioridad() == 2){
                Main.nivel21.encolar(telefono1);
            }else{
                Main.nivel31.encolar(telefono1);
            }
            //Segunda planta.
            if (telefono2.getPrioridad() == 1){
                Main.nivel12.encolar(telefono2);
            }else if (telefono2.getPrioridad() == 2){
                Main.nivel22.encolar(telefono2);
            }else{
                Main.nivel32.encolar(telefono2);
            }
        }else{
            //Alguno requiere refuerzo.
            System.out.println("Entraron en Refuerzo");
        }
        return(seleccionado);
    }
}
