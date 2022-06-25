
import Planta2.Cola2;
import Planta2.Telefono2;

/**
 *
 * @author Ignacio Lemmo y Maria López
 */
public class Main {

    public static void main(String[] args) {
        Telefono2 uno = new Telefono2(1,1);
        Telefono2 dos = new Telefono2(2,1);
        Telefono2 tres = new Telefono2(3,1);
        Telefono2 cuatro = new Telefono2(4,1);
        Telefono2 cinco = new Telefono2(5,1);
        
        Cola2 cola = new Cola2();
        
        cola.encolar(uno);
        cola.encolar(dos);
        cola.encolar(tres);
        cola.encolar(cuatro);
        cola.encolar(cinco);

        System.out.println(cola.imprimir());
        
        
    }
    
}
