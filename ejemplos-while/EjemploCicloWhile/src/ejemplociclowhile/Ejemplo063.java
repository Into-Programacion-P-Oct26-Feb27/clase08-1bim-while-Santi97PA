/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo063 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        String pais;
        String capital;
        String reporte = "";
        
        while(bandera==true){ //true == true //false==true
            System.out.println("Ingrese un pais"); 
            pais = entrada.nextLine();
            
            System.out.println("Ingrese la capital del pais"); 
            capital = entrada.nextLine();
            
            reporte = String.format("%s%s\t%s\n", reporte,pais, capital);
            
            String salir;            
            System.out.print("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine(); 
            if(salir.equals("si")){ 
                bandera = false;
            }
        }   
        System.out.printf("%s\n", reporte);
    }
}
/*
se esta utilizando while para que se controle por una variable bandera (o centinela)
para repetir un bloque de codigo hasta que el usuario decida detenerlo en este caso
el -100 detiene el codigo
*/

