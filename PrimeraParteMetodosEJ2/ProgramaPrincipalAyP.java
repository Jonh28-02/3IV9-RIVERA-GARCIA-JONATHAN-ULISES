import java.util.*;
public class ProgramaPrincipalAyP{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        Entradadedatos2 AyP = new Entradadedatos2();
        char letra;
        System.out.println("Bienvenido al programa 2 Unu");
        System.out.println("Elaborado por Rivera Garcia Jonatha Ulises");
        do{
        AyP.Figurasxd();
        System.out.println("Si desea continuar presione C de continuar, si no S de Salir");
        letra = entrada.next().charAt(0);
        }while (letra != 's');
    }
}