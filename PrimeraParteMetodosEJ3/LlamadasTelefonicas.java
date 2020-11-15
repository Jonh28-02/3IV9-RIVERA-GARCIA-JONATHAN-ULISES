import java.util.*;


public class LlamadasTelefonicas{

    double celular;
    Scanner entrada = new Scanner(System.in);
    
    double credito = 0; 
    int opcion, opcion2;
    double comprarcredito;
    double naciones = 0.5;
    double internaciones = 0.6;
    double Acelular = 0.2;

    public void MenuCompania() {
        LlamadasTelefonicas XD = new LlamadasTelefonicas();
        System.out.println("Bienvenido a Movistonston, LO MEJOR PARA EL MEJOR");
        System.out.println("INGRESA TU NUMERO DE CELULAR DE 4 DIGITOS");
        celular = entrada.nextDouble();
            while(celular < 999){
            System.out.println("El numero ingresado es incorrecto o invalido ingreselo nuevamente");
            celular = entrada.nextDouble();
            while(celular > 9999){
                System.out.println("El numero ingresado es incorrecto o invalido ingreselo nuevamente");
                celular = entrada.nextDouble();
            }
            }
        do{   
        System.out.println("Gracias, elige algunas de nuestras opciones UnU");    
        System.out.println("1. Realizar una llamada");
        System.out.println("2. Comprar credito");
        System.out.println("3. Consultar credito");
        System.out.println("4. Salir");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                do{
                XD.LLamada();
                System.out.println("Presiona 1 si deseas salir al menu principal, si deseas seguir realizando llamadas presiona 2");
                opcion2 = entrada.nextInt();
                }while (opcion2 != 1);
                break;
            case 2:
                XD.Comprar();
                break;  
            case 3:
                XD.Consulta();
                break;  
            case 4:
                //opcion de salirrr AHHH xd
                break;      
        
            default:
                break;
        }
            
        }while (opcion != 4);
    }
    public void LLamada() {
        System.out.println("Elija el tipo de llamada a realizar");
        System.out.println("1. Nacional");
        System.out.println("2. Internacionales");
        System.out.println("3. A celular");
        System.out.println("4. Salir");
        opcion2 = entrada.nextInt();
        switch (opcion2) {
            case 1:
                if (credito <= 0.4){
                   System.out.println("No tienes suficiente saldo "+credito);
                   System.out.println("Necesitas hacer una recarga en nuestro menu principal");
                }else {
                    credito = credito-naciones;
                    System.out.println("Gracias por llamar por medio de nuestra telefonia UnU saldo final: "+credito);}
                break;
            case 2:
             if (credito <= 0.5){
                System.out.println("No tienes suficiente saldo "+credito);
                System.out.println("Necesitas hacer una recarga en nuestro menu principal");
             }else {
                 credito = credito-internaciones;
                 System.out.println("Gracias por llamar por medio de nuestra telefonia UnU saldo final: "+credito);}
             break;
                
            case 3:
             if (credito <= 0.1){
                System.out.println("No tienes suficiente saldo "+credito);
                System.out.println("Necesitas hacer una recarga en nuestro menu principal");
             }else {
                 credito = credito-Acelular;
                 System.out.println("Gracias por llamar por medio de nuestra telefonia UnU saldo final: "+credito);}
             break;
                
            case 4:
                
                break;
            default:
                break;
        }


        
    }
    public void Comprar() {
        System.out.println("Holi bienvenido a la compra de credito");
        System.out.println("Ponga la cantidad de credito que deseas comprar");
        comprarcredito = entrada.nextInt();
        credito = credito + comprarcredito;
        System.out.println("Gracias por comprar con nosotros");
        System.out.println("Tu saldo final es: "+credito);
        
        
    }
    public void Consulta() {
        System.out.println("Gracias por estar con nosotros");
        System.out.println("Tu saldo es de: "+credito);
    }
        
} 