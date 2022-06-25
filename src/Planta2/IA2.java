package Planta2;

public class IA2 {
    public Telefono2 procesador(Telefono2 telefono1, Telefono2 telefono2){
        double random = Math.random() * 100;
        if (random >= 40){
            //Alguno puede salir al mercado.
            return(null);
        }else if (random >=27 && random < 40){
            //Empate.
            return(null);
        }else{
            //Alguno requiere refuerzo.
            return(null);
        }
    }
}
