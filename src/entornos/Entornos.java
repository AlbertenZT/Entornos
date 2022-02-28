
package entornos;

import java.util.Scanner;

/**
 *
 * @author zarag
 */
public class Entornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola");
        System.out.println("hola2");
        
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola "+nombre);
    }
    
}
