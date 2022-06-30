package ProyectoSO2;

import Interfaces.Combates;
import Interfaces.Inicio;
import Interfaces.Simulacion;
import Plantas.Administrador;
import Plantas.Cola;
import Plantas.IA;
import Plantas.Simulaciones;

/**
 *
 * @author Ignacio Lemmo y Maria López
 */
public class Main {
    
    //Declaración de atributos.
    public static volatile Cola nivel11;
    public static volatile Cola nivel21;
    public static volatile Cola nivel31;
    
    public static volatile Cola nivel12;
    public static volatile Cola nivel22;
    public static volatile Cola nivel32;
    
    public static volatile Cola refuerzo1;
    public static volatile Cola refuerzo2;
    
    public static volatile int telefonos = 0;
    
    public static Administrador administrador;
    public static IA IA;
    
    public static Combates combates;
    
    public static volatile int mercado1 = 0;
    public static volatile int mercado2 = 0;
    
    public static volatile int segundos = 11000;
    public static volatile int iniciales = 1;
    public static volatile int agregados = 1;
    
    
    //Inicio.
    public static void main(String[] args) {        
        nivel11 = new Cola();
        nivel21 = new Cola();
        nivel31 = new Cola();
        
        nivel12 = new Cola();
        nivel22 = new Cola();
        nivel32 = new Cola();
        
        refuerzo1 = new Cola();
        refuerzo2= new Cola();
        
        administrador = new Administrador();
        IA = new IA();
        
        combates = new Combates();
        combates.setLocationRelativeTo(null);
        combates.setVisible(false);
        
        Inicio inicial = new Inicio();
        inicial.setLocationRelativeTo(null);
        inicial.setVisible(true);
    }
    
}
