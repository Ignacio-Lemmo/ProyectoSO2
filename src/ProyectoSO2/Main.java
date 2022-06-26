package ProyectoSO2;

import Interfaces.Inicio;
import Planta2.Administrador2;
import Planta2.Cola2;
import Planta2.IA2;
import Planta2.Simulacion2;

/**
 *
 * @author Ignacio Lemmo y Maria López
 */
public class Main {
    
    //Declaración de atributos.
    public static volatile Cola2 nivel11;
    public static volatile Cola2 nivel21;
    public static volatile Cola2 nivel31;
    
    public static volatile Cola2 nivel12;
    public static volatile Cola2 nivel22;
    public static volatile Cola2 nivel32;
    
    public static volatile Cola2 refuerzo;
    
    public static volatile int telefonos = 0;
    
    public static Administrador2 administrador;
    public static IA2 IA;
    
    //Inicio.
    public static void main(String[] args) {        
        nivel11 = new Cola2();
        nivel21 = new Cola2();
        nivel31 = new Cola2();
        
        nivel12 = new Cola2();
        nivel22 = new Cola2();
        nivel32 = new Cola2();
        
        refuerzo = new Cola2();
        administrador = new Administrador2();
        IA = new IA2();
        
        Inicio interfaz = new Inicio();
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
        
        Simulacion2 simulacion = new Simulacion2();
        simulacion.start();
    }
    
}
