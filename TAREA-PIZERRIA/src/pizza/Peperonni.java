
package pizza;

import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class Peperonni extends Pizza{
    
    public Peperonni() {
    }
    
    public Peperonni(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        //opciones de peperoni
        //rodajas, rodajas y parmesano, rodajas y albaca, doble
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[4] = "Doble Peperoni en Rodajas";
        
    }
    public String elegirpeperoni(){
        //es un metodo void, o string?
        int opcion;
        Scanner entrada = new Scanner(System.in);
        String peperoni;
        System.out.println("Elije el tipo de peperoni");
        System.out.println("1.- Rodajas");
        System.out.println("2.- Rodajas con parmesano");
        System.out.println("3. Rodajas y albaca");
        System.out.println("4. Doble Peperoni en Rodajas");
        peperoni = entrada.next();
        
        return peperoni;
    }
    
    
    
}
