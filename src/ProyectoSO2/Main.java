package ProyectoSO2;


import Planta2.Administrador2;
import Planta2.Cola2;
import Planta2.IA2;
import Planta2.Telefono2;

/**
 *
 * @author Ignacio Lemmo y Maria López
 */
public class Main {
    
    //Declaración de atributos.
    public static volatile Cola2 nivel1;
    public static volatile Cola2 nivel2;
    public static volatile Cola2 nivel3;
    public static volatile Cola2 refuerzo;
    
    public static volatile int telefonos = 0;
    
    public static Administrador2 administrador;
    public static IA2 IA;
    
    //Inicio.
    public static void main(String[] args) {
        nivel1 = new Cola2();
        nivel2 = new Cola2();
        nivel3 = new Cola2();
        refuerzo = new Cola2();
        administrador = new Administrador2();
        IA = new IA2();
    }
    
}
