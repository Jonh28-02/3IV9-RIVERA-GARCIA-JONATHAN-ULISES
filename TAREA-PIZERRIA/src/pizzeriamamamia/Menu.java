
package pizzeriamamamia;

/**
 *
 * @author Ulises
 */
import pizza.*;
import java.util.Scanner;

/**
 *
 * @author demon
 */
public class Menu {
    
    private int total = 0;
    private int opc;
    private int comprar;
    
    public void MenuOperaciones(){
        
        Scanner entrada = new Scanner(System.in);
        
        int XD;
        String que = null;
        final int precio[] = new int[16];
        precio[0] = 75;
        precio[1] = 89;
        precio[2] = 112;
        precio[3] = 135;
        precio[4] = 89;
        precio[5] = 115;
        precio[6] = 135;
        precio[7] = 175;
        precio[8] = 96;
        precio[9] = 119;
        precio[10] = 131;
        precio[11] = 167;
        precio[12] = 88;
        precio[13] = 97;
        precio[14] = 111;
        precio[15] = 157;
        
        
        //voy a crear un objeto llamado pizza
        Pizza piza = null;
        System.out.println("Bievenido a la pizzas de don krangejo");//no se como se escribe don krangejo xd
        System.out.println("Ponga las pizzas a comprar");
        comprar = entrada.nextInt();
        while (comprar < 1) {
            do {
                System.out.println("Ingresa el numero bien manco");
                comprar = entrada.nextInt();
            } while (comprar < 1);
        }
        Pizza pizadedonC [] = new Pizza[comprar];
        
        for (int i = 0; i < comprar; i++) {
            
            
            System.out.println("¿Que desea ordenar?");
            System.out.println("1.- Pizza de Queso");
            System.out.println("2.- Pizza de Peperoni");
            System.out.println("3.- Pizza de Vegetariana");
            opc = entrada.nextInt();
            while (opc < 1 || opc > 3) {
                do {
                    System.out.println("Ingresa el numero bien manco");
                    opc = entrada.nextInt();
                } while (opc < 1 || opc > 3);
            }
            System.out.println("Ingresa el tamaño de la pizza");
            System.out.println("1. Chica");
            System.out.println("2. Mediana");
            System.out.println("3. Grande");
            System.out.println("4. Familiar");
            XD = entrada.nextInt();
            while (XD < 1 || XD > 4) {
                do {
                    System.out.println("Ingresa el numero bien manco");
                    XD = entrada.nextInt();
                } while (XD < 1 || XD > 4);
            }
            
            
            switch(opc){
                case 1:
                    //polomorfismo
                    piza = new Queso();
                    
                    Queso ques = new Queso();
                    ques.elegirtipoqueso();
                    
                    piza.hornear();
                    piza.cortar(XD);
                    piza.empacar();
                    if (ques.equals("Mozzarela")){
                        total += precio[XD-1];
                    }else{
                        total += precio[XD+3];
                    }
                    
                    break;
                case 2:
                    piza = new Peperonni();
                    Peperonni Pep = new Peperonni();
                    Pep.elegirpeperoni();
                    piza.hornear();
                    piza.cortar(XD);
                    piza.empacar();
                    total += precio[XD+7];
                    
                    break;
                case 3:
                    piza = new Vegetariana();
                    Vegetariana Veg = new Vegetariana();
                    Veg.elegiringredientes();
                    piza.hornear();
                    piza.cortar(XD);
                    piza.empacar();
                    total += precio[XD+11];
                    break;
                default:
            }
            
            
        }
        
        System.out.println("La cantidad a pagar es de: "+total);
        
    }
    
}

