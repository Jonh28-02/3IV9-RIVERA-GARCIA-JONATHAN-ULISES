import java.util.*;
public class Entradadedatos2{
  
    
    Scanner entrada = new Scanner(System.in);
    //variables de instancia xdxdxdxdxdxddxdxdxdxdxddxdx
    double areacirculo, perimetrocirculo, arearectangulo, perimetroregtangulo,areacuadrado, perimetrocuadrado,areatrangulo, perimetrotriangulo;
    double baserectangulo, alturarectangulo, ladocuadrado, ladotriangulo;
    int opcion;
    double radio, alturatriangulo;
    
   
    public void Figurasxd(){
        
        Entradadedatos2 casos = new Entradadedatos2();
        System.out.println("Bienvenido al programa de area y perimetro, elige algunas de nuestras opciones");
        System.out.println("1. Area y Perimetro del Circulo");
        System.out.println("2. Area y Perimetro del Rectangulo");
        System.out.println("3. Area y Perimetro del Cuadrado");
        System.out.println("4. Area y Perimetro del Trangulo");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
               casos.AyPC();
                break;
            case 2:
               casos.AyPR();
                break;  
            case 3:
               casos.AyPCU();
                break;
            case 4:
                casos.AyPT();
                break;  
            default:
                break;
        }


        
    }
    public void AyPC() {
        System.out.println("Ingresa el radio del circulo");
        radio = entrada.nextDouble();
        areacirculo = 3.1416*(radio*radio);
        perimetrocirculo = 2*3.1416*radio;
        System.out.println("El area del circulo es: "+areacirculo);
        System.out.println("El perimetro del circulo es: "+perimetrocirculo);
        
    }
    public void AyPR() {
        System.out.println("Ingresa la altura del rectangulo");
        alturarectangulo = entrada.nextDouble();
        System.out.println("Ingresa la base del rectangulo");
        baserectangulo = entrada.nextDouble();

        arearectangulo = (alturarectangulo*baserectangulo)/2;
        perimetroregtangulo = (alturarectangulo*2)+(baserectangulo*2);
        System.out.println("El area del rectangulo es: "+arearectangulo);
        System.out.println("El perimetro del rectangulo es: "+perimetroregtangulo);

    }
    public void AyPCU() {
        System.out.println("Ingresa un lado del cuadrado");
        ladocuadrado = entrada.nextDouble();
        areacuadrado = ladocuadrado*ladocuadrado;
        perimetrocuadrado = ladocuadrado*4;
        System.out.println("El area del cuadrado es: "+areacuadrado);
        System.out.println("El perimetro del cuadrado es: "+perimetrocuadrado);
        
    }
    public void AyPT() {
        System.out.println("Ingresa un base del triangulo");
        ladotriangulo = entrada.nextDouble();
        System.out.println("Ingresa la altura del triangulo");
        alturatriangulo = entrada.nextDouble();
        areatrangulo = (ladotriangulo*alturatriangulo)/2;
        perimetrotriangulo = ladotriangulo*3;
        System.out.println("El area del triangulo es: "+areatrangulo);
        System.out.println("El perimetro del triangulo es: "+perimetrotriangulo);

        
    }
}