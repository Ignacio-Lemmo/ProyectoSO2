package ProyectoSO2;

import Interfaces.Simulacion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CSVEL {
    
    private static String linea;
    private static String lineaHistorica;
    private static String dataUnida = "";
    private static String historicaUnida = "";
    public static String[] data;
    public static String[] dataHistorica;
    public static String[] indice;
    
    public static void GuardarHistorico(String mercado1, String mercado2){
        try{
           FileWriter csvGuardar = new FileWriter("./Histórico.csv", true); 
           csvGuardar.append( mercado1 + "," + mercado2 + "break");
           csvGuardar.flush();
           csvGuardar.close();
        }catch(Exception e){
            
        }
    }
    
    public static void LeerHistorico(){
        try{
            historicaUnida = "";
            BufferedReader csvLeer = new BufferedReader(new FileReader("./Histórico.csv"));
            csvLeer.readLine();
            while ((lineaHistorica = csvLeer.readLine()) != null) {;
                historicaUnida += lineaHistorica + " ";
            }
            csvLeer.close();
            dataHistorica = historicaUnida.split("break");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

