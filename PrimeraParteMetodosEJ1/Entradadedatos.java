import java.util.*;
import javax.swing.JOptionPane;


public class Entradadedatos{

        Scanner entrada = new Scanner(System.in);
        int FECHADEN = 0; 
        int FECHAACT = 0;
        int edad = 0;

 
    public void Datos(){
        

        JOptionPane.showMessageDialog(null, "Si quieres saber tu edad debes venir aqui");
        FECHADEN = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu a\u00f1o de nacimiento"));
        FECHAACT = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el a\u00f1o de consulta"));
      
        

    }
    public void Edad(){
         
        edad = FECHAACT-FECHADEN;
        JOptionPane.showMessageDialog(null, "Tu edad es: "+edad);

    }
} 