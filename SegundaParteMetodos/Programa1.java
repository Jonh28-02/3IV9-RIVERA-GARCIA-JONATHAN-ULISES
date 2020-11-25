import java.util.*;
public class Programa1{

    int id, puesto, sueldoextradia, sueldoextranoche;

    double gastos, sueldo;
    double sueldoempleado = 5000;
    double sueldosupervisor = 8000;
    //aca ya hice el calculo de estas cosas pa mas facil UnU
    double infonavid = 8;
    double ISR = 16; 
    double SGM = 12.8;
    String nombredelcliente;

    

    Scanner entrada = new Scanner(System.in);

    

    public void Programa1() {

        Programa1 NOSEQUEPONER = new Programa1();

        NOSEQUEPONER.Dinero();
    }
    public void Dinero(){

        System.out.println("Ingrese su ID");
        id = entrada.nextInt();
        System.out.println("Ingrese su Nombre");
        nombredelcliente = entrada.next();
        do{
        System.out.println("Ingrese su Puesto");
        System.out.println("1. Normalito UnU");
        System.out.println("2. Supervisor UnU");
        puesto = entrada.nextInt();
        }while (puesto > 2 ||  puesto < 1);
        
        
        if(puesto == 1){
            EMPLEADO1();
        }
        else{
            EMPLEADO2();
        }
    }
    public void EMPLEADO1(){
        System.out.println("Ingrese la cantidad de horas extra de dia trabajaste ");
        int sueldoextradia1 = entrada.nextInt();
        System.out.println("Ingrese la cantidad de horas extra de noche trabajaste");
        int sueldoextranoche2 = entrada.nextInt();

        sueldoextradia = sueldoextradia1*50;
        sueldoextranoche = sueldoextranoche2*60;

        sueldo = sueldoempleado + sueldoextradia + sueldoextranoche;

        TOTAL();

        
    }
    public void EMPLEADO2(){
        gastos = infonavid + ISR + SGM;
        sueldo = sueldosupervisor - gastos;

        TOTAL();
    }
    public void TOTAL(){
        System.out.println("El sueldo del empleado "+id+" "+nombredelcliente+" es de: " +sueldo+" $ UnU");
    }
}