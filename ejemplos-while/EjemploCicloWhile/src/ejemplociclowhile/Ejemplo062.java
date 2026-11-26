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
public class Ejemplo062 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        
        while(bandera==true){ //true == true //false==true
            System.out.println("Estoy en ciclo"); //Estoy en el ciclo
            
            
            String salir;
            
            System.out.print("Desea salir del ciclo, ingrese -100.");
            salir = entrada.nextLine(); 
            if(salir.equals("si")){ 
                bandera = false;
            }
        }       
    }
}
/*
se esta utilizando while para que se controle por una variable bandera (o centinela)
para repetir un bloque de codigo hasta que el usuario decida detenerlo en este caso
el -100 detiene el codigo
*/

