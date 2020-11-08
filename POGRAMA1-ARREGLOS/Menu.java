import java.util.*;

public class Menu{

    public static void main (String[] args) {

        
    }

    public void menu(){

        Soluciones casos = new Soluciones();
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        do{
        System.out.println("Elige algunas de nuestras opciones:");
        System.out.println("1. Promedio de valores positivos y negativos");
        System.out.println("2. Promedio de valores pares");
        System.out.println("3. Calificaciones de una asignatura");
        System.out.println("4. Suma de matrices");
        System.out.println("5. Salir");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
              casos.Case1();
                break;
            case 2:
              casos.Case2();
                break;
            case 3:
              casos.Case3();
                break;
            case 4:
              casos.Case4();
                break;
            case 5:
                System.out.println("Gracias por venir 7u7");
                break;
            default:
                break;
        } 
        }while(opcion != 5);
    }
}