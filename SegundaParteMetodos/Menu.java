import java.util.*;
class Menu{

    int opcion;

    Scanner entrada = new Scanner(System.in);
    
    
     public void EjerciciosXD() {
        
       do{
        Programa1 P1 = new Programa1();
        Programa2 P2 = new Programa2();
        Programa3 P3 = new Programa3();
        
        System.out.println("Bienvenido UnU");
        System.out.println("Elije alguna de las opciones");
        System.out.println("1. Programa 1");
        System.out.println("2. Programa 2");
        System.out.println("3. Programa 3");
        System.out.println("4. Salir");
        opcion = entrada.nextInt();
 
        switch (opcion) {
            case 1:
                P1.Programa1();
                break;
            case 2:
                P2.PROGRAMA2XD();
                break;
            case 3:
                P3.PROGRAMA3XD();
                break;
            case 4:
                 System.out.println("Gracias por venir OwO");
                break;
        
            default:
                break;
        }

       }while (opcion != 4);

       
       


     }
    

      
    


}