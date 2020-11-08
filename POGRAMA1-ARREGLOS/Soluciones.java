import java.util.*;
public class Soluciones{

    public static void main (String[] args){    


    }

    public void Case1(){

        Scanner entrada = new Scanner(System.in);
       
        double positivosuma = 0;
        double negativosuma = 0;
        double numerospositivos = 0;
        double numerosnegativos = 0;
        double promediopositivos, promedionegativos;

        System.out.println("Ingrese los numeros del arreglo");
        double numero[] = new double [10];
        for (int i = 0; i < numero.length; i++){
          System.out.println("Ingrese el digito "+(i+1));
          numero[i] = entrada.nextDouble();
        
          if (numero[i] > 0){
              positivosuma += numero[i];
              numerospositivos++;
          }else
              negativosuma += numero[i];
              numerosnegativos++;
        }
          promediopositivos = positivosuma/numerospositivos;
          promedionegativos = negativosuma/numerosnegativos;
          System.out.println("La suma de los numeros negativos son "+positivosuma);
          System.out.println("El promedio de los numeros positivos es igual a: "+promediopositivos);
          System.out.println("La suma de los numeros negativos son "+negativosuma);
          System.out.println("El promedio de los numeros positivos es igual a: "+promedionegativos);

    }
    
    public void Case2 (){
        Scanner entrada = new Scanner(System.in);
       
        double suma = 0;
        double promedio;
        int i = 0;

        System.out.println("Ingrese los numeros del arreglo");
        double numero[] = new double [10];
        for (i = 0; i < numero.length; i++){
          System.out.println("Ingrese el digito "+(i+1));
          numero[i] = entrada.nextDouble();        
        }
        suma += numero[0];
        suma += numero[2];
        suma += numero[4];
        suma += numero[6];
        suma += numero[8];


        promedio = suma/5;
        
        System.out.println("La suma de los numeros en posicion par es de: "+suma);
        System.out.println("El promedio de los numeros positivos es igual a: "+promedio);
    }

    public void Case3 (){
        Scanner entrada = new Scanner(System.in);
       
        double sumaparapromedio = 0;
        double aprobados = 0;
        double reprobados = 0;
        double promedio;
        double superioresalpromedio = 0; 
        double mayor, menor;

        System.out.println("Ingrese los calificaciones");
        double numero[] = new double [10];
        for (int i = 0; i < numero.length; i++){
          System.out.println("Ingrese la calificacion del alumno "+(i+1));
          numero[i] = entrada.nextDouble();
          sumaparapromedio += numero[i];
          if (numero[i] > 5){
              aprobados++;
          }else
             
              reprobados++;
        }
          System.out.println("Las calificaciones ingresadas son:");
          for(double i:numero){
              System.out.print("  "+i);
          }
          promedio = sumaparapromedio/10;
            for(int i = 0; i < numero.length; i++){
                if(numero[i] > promedio)
                superioresalpromedio++;
            }          
            mayor = numero [0];
            menor = numero [0];
            for(int i = 0; i < numero.length; i++){
                if (numero[i] > mayor){
                    mayor = numero[i];
                }
                if (numero[i] < menor){
                    menor = numero[i];
                }
            }
          
          System.out.println("\nEl promedio de las calificaciones es de: "+promedio);
          System.out.println("La calificacion mas alta es de: "+mayor);
          System.out.println("La calificacion mas baja es de: "+menor);
          System.out.println("Las calificaciones superioes al promedio: "+superioresalpromedio);
          System.out.println("La cantidad de alumnos aprobados es de: "+aprobados);
          System.out.println("La cantidad de alumnos reprobados es de: "+reprobados);
          
    }

    public void Case4 (){

        Scanner entrada = new Scanner(System.in);

        double sumatotal = 0; 
        double matrizA[][] = new double [3][3];
        double matrizB[][] = new double [3][3];
        double matrizC[][] = new double [3][3];
        System.out.println("Ingresa los valores de la matriz A");
        for(int i = 0; i < matrizA.length; i++){
            //columnas
            for(int j = 0; j < matrizA.length; j++){
                
                System.out.println("Ingresa el valor de la fila: "+ i + " y la columna : "+ j + " ");
                
                matrizA[i][j]=entrada.nextDouble();
            }
        }
        System.out.println("Ingresa los valores de la matriz B");
        for(int i = 0; i<matrizB.length; i++){
            
            for(int j = 0; j < matrizB.length; j++){
                
                System.out.println("Ingresa el valor de la fila: "+ i + " y la columna : "+ j + " ");
                
                matrizB[i][j]=entrada.nextDouble();
            }
        }
        for(int i = 0; i < matrizA.length; i++){
            
            for(int j = 0; j < matrizA.length; j++){
                
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("La suma de la Matriz A y la Matriz B en una Matriz C es: ");
        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA.length; j++){
               System.out.print("|"+matrizC[i][j]+"|");
            }
            System.out.println(" ");
        }

        

    }

}