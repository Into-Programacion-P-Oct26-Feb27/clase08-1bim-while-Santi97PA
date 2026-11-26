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
public class Ejemplo064 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        String pais;
        String capital;
        String reporte = "";
        int contador = 0;
        
        while(bandera==true){ //true == true //false==true
            System.out.println("Ingrese un pais"); 
            pais = entrada.nextLine();
            
            System.out.println("Ingrese la capital del pais"); 
            capital = entrada.nextLine();
            
            reporte = String.format("%s%s\t%s\n", reporte,pais, capital);
            contador = contador + 1;
            String salir;            
            System.out.print("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine(); 
            if(salir.equals("si")){ 
                bandera = false;
            }
        }   
        System.out.printf("Total de paises: %d\n%s\n", contador, reporte);
    }
}
/*
se esta utilizando while para que se controle por una variable bandera (o centinela)
para repetir un bloque de codigo hasta que el usuario decida detenerlo en este caso
el -100 detiene el codigo
*/

