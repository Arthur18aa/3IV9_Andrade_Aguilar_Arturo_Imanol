import java.util.Scanner;

public class Edad{
    
    public void Edad(){
        
        Scanner entrada = new Scanner(System.in);

        int fecha, edad;

        System.out.println("Para calcular tu edad se necesita el a\u00f1o en que naciste");
        System.out.println("Escribe tu a\u00f1o de nacimiento");

        fecha = entrada.nextInt();
        
        if(fecha > 2020){
            System.out.println("Ah perro, vienes del futuro");
            fecha = entrada.nextInt();   
        }
        else{
            edad = (2020)-(fecha);
            System.out.println("El aproximado a tu edad es de " + edad + "a\u00f1os");
        }
    }
}
