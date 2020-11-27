import java.util.*;
import javax.swing.JOptionPane;

public class EXAMEN2{

    Scanner entrada = new Scanner(System.in);

    public String palabra;
    private int ultimaletra, letradeM, tampal; 
    private char ultimal, lertraMedia;

    public EXAMEN2(){

    }

    public void palabra(String palabra){

        this.palabra = palabra;
        this.ultimaletra = ultimaletra;
        this.letradeM = letradeM;
        this.ultimaletra = ultimaletra;
        this.lertraMedia = lertraMedia;

    }

    public String GetPalabra(){
        return palabra;
    }

    public void SetPalabra(String palabra){
        this.palabra = palabra;
    }

    public int GetTampal(){
        return tampal;
    }

    public void SetTampal(int tampal){
        this.tampal = tampal;
    }

    
    public void Eleccion(){

        try{
            
            System.out.println("Bienvenido al ahorcadoo Wii");
            System.out.println("ELABORADO POR");
            System.out.println("RIVERA GARCIA JONATHAN ULISES 3IV9 UnU");
            System.out.println("Regla: Tienes 5 puntos y se restan 1 po cada equivocacion, si llegas a 2 pierdes"); //hiba a poner 1 pero por alguna razon no se pudo UnU truste
            System.out.println("Digite la palabra para jugar: ");
            palabra = entrada.next();

            ultimaletra = palabra.length()-1;
            ultimal = palabra.charAt(ultimaletra);
            letradeM = palabra.length()/2;
            lertraMedia = palabra.charAt(letradeM);
            
            System.out.println("Pistas: ");
            System.out.println("La palabra inicia con: ");
            System.out.println("Inicia con: "+palabra.charAt(0));
            System.out.println("Letra aleatoria de la palabra: "+lertraMedia);
            System.out.println("La palabra termina con: "+ultimal);
            
            
        }
        catch(NullPointerException e){
            System.out.println("Has finalizado este pograma");
            
        }
        
    }

    public void tampal(){
        tampal = palabra.length();
    }

    

}