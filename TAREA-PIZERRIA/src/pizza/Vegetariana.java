
package pizza;
import java.util.*;
/**
 *
 * @author Ulises
 */
public class Vegetariana extends Pizza {
    
    Scanner entrada = new Scanner(System.in);
    
    public Vegetariana() {
    }
    
    public Vegetariana(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";
        
    }
    
    public String elegiringredientes(){
        
        String Ingrediente;
        
        System.out.println("Ingresa los ingredientes que llevara tu pizza UwU");
        System.out.println("1.Champiñones");
        System.out.println("2. Piña");
        System.out.println("3. Pimiento");
        System.out.println("4. Elote");
        Ingrediente = entrada.next();
        
        
        return Ingrediente;
        
    }
    
    
    
    
    
}