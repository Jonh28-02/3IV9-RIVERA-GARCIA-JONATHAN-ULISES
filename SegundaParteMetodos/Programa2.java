import java.util.*;
public class Programa2{

     String nombrecliente;
     int i;
     int[] costo = new int[10];
     int[] existencia = new int[10];
     String[] producto = new String[10];
     float sumacosto, max, min, promedio;

     Scanner entrada = new Scanner(System.in);

        
        public void PROGRAMA2XD(){
                
            ENTRADADEDATOS();

        }
        public void ENTRADADEDATOS(){
            System.out.println("Ingrese el nombre de su cliente:");
            nombrecliente = entrada.next();

            System.out.println("Digite el costo y el nombre de sus productos uno a uno.");
            for(i = 0; i < costo.length; i++){
                System.out.println("Producto " + (i + 1) + ":");
                producto[i] = entrada.next();
                System.out.println("Costo:");
                costo[i] = entrada.nextInt();
                sumacosto += costo[i];
                System.out.println("Existencia del producto " + (i + 1) + ":"); 
                existencia[i] = entrada.nextInt();
                
                
            }
    
            min = max = costo[0];

            for (i = 0; i < costo.length; i++){
                if(costo[i] > max){
                    max = costo[i];
                }
                else if(costo [i] < min){
                    min = costo[i];
                }
            }
    
            System.out.println("ECXISTENCIAS"); 
            
            DATOS();
            
        }
        public void DATOS(){
                
                
                System.out.println("Los datos de productos del cliente: " + nombrecliente + ".");
               //Por alguna razon si pongo un for no me lo jala se lo salta WTF?
                System.out.println("Existencias: " + existencia[1]+ " producto de " + producto[1] + " con un costo " + costo[1] + "$ cada uno");
                System.out.println("Existencias: " + existencia[2]+ " producto de " + producto[2] + " con un costo " + costo[2] + "$ cada uno");
                System.out.println("Existencias: " + existencia[3]+ " producto de " + producto[3] + " con un costo " + costo[3] + "$ cada uno");
                System.out.println("Existencias: " + existencia[4]+ " producto de " + producto[4] + " con un costo " + costo[4] + "$ cada uno");
                System.out.println("Existencias: " + existencia[5]+ " producto de " + producto[5] + " con un costo " + costo[5] + "$ cada uno");
                System.out.println("Existencias: " + existencia[6]+ " producto de " + producto[6] + " con un costo " + costo[6] + "$ cada uno");
                System.out.println("Existencias: " + existencia[7]+ " producto de " + producto[7] + " con un costo " + costo[7] + "$ cada uno");
                System.out.println("Existencias: " + existencia[8]+ " producto de " + producto[8] + " con un costo " + costo[8] + "$ cada uno");
                System.out.println("Existencias: " + existencia[9]+ " producto de " + producto[9] + " con un costo " + costo[9] + "$ cada uno");
                System.out.println("El total de costos es de: " + sumacosto + " $.");
                System.out.println("Costo mayor: " + max + " $.");
                System.out.println("Costo menor: " + min + " $.");
                promedio = sumacosto/10;
                System.out.println("El promedio de los costos es de: " + promedio + " $ .");
        }
        
        

      
      
 
    


}