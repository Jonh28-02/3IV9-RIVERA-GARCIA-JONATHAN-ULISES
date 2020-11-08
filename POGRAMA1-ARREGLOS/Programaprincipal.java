import java.util.*;
public class Programaprincipal{

    public static void main (String[] args){
     
        Menu textos = new Menu();
        Scanner entrada = new Scanner(System.in);

        char letra;

        
        System.out.println("Bienvenido UnU");
        System.out.println("Este programa fue elaborado por Rivera Garcia Jonathan Ulises 3IV9");
        do{
         textos.menu();
         System.out.println("Si deseas repetir el menu presiona O, si no presiona S");
         letra = entrada.next().charAt(0);
        }while (letra!='s');

        

    }

}