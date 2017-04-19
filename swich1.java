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
public class swich1 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner d = new Scanner(System.in);
        //Creacion de variables
        String opcion;
        char departamento;
        //Solicitud ingreso de variables
        System.out.println("Ingrese la letra para ver en que departamento esta: " + "\n A" + "\n B" + "\n C" + "\n D");
        opcion = d.next();
        //Convertir String a Char
        departamento=opcion.charAt(0);
        //switch
        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recusos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
                break;
            default:
                System.out.println("departamento incorrecto");
                break;
        }
        System.out.println("Codigo para el departamento es: " + departamento);

    }

}
