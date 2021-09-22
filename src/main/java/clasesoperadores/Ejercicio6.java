
package clasesoperadores;


public class Ejercicio6 {

   
    public static void main(String[] args) {
       int LadoCuadrado = 8;
       int area = LadoCuadrado*LadoCuadrado;
       int perimetro = LadoCuadrado+LadoCuadrado+LadoCuadrado+LadoCuadrado;
        System.out.println("El area cuadrado es: "+area);
        System.out.println("El perimetro cuadrado es: "+perimetro);
        
        
       int baseTriangulo = 9;
       int alturaTriangulo = 8;
       int LadoUnoTriangulo = 8;
       int LadoDosTriangulo = 8;
       int area1 = baseTriangulo*alturaTriangulo;
       int perimetro1 = LadoUnoTriangulo+LadoDosTriangulo+baseTriangulo;
        System.out.println("El area del triangulo es: "+area1);
        System.out.println("El perimetro del triangulo es: "+perimetro1);
        
        
       int Baserectangulo = 8;
       int Alturarectangulo = 6;
       int area2 = Baserectangulo*Alturarectangulo;
       int perimetro2 = Baserectangulo+Baserectangulo+Alturarectangulo+Alturarectangulo;
        System.out.println("El area del rectangulo es: "+area2);
        System.out.println("El perimetro del rectangulo es: "+perimetro2);
       
    }
    
}
