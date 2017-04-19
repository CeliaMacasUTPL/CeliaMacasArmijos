/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosenclase;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class swich2 {

 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner datos = new Scanner(System.in);
        
      //Creacion de variables
        String horario;
        
        //Solicitud ingreso de variables
        System.out.println("Eliga una numero para ver su clase y hora: "+"\n 1. Lunes"+"\n 2. Martes"+"\n 3. Miercoles"+"\n 4. Jueves"+"\n 5. Viernes");
        horario=datos.next();
        
        //switch
        switch(horario){
            case "1":
                System.out.println("Gestión Productiva  de: 15:00-17:00");
            break;
            case "2":
                System.out.println("Contabilidad de: 7:00-10:00");
            break;
            case "3":
                System.out.println("Fundamentos de la Programacion de: 7:00-10:00");
            break;
            case "4":
                System.out.println("Gestión Productiva  de: 8:00-11:00");
            break;
            case "5":
                System.out.println("Farra");
            break;
            default:
                System.out.println("Dia invalido");
            break;    
        }
        
    }
    
}
