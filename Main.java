import java.util.Scanner;

public class Main{

  
    public int a;

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String letra;

       int a;

        Que obj = new Que();
        do{
           
        obj.Que();

        System.out.println("¿Quieres volver a jugar?:\n 2.No     1.Si");

        a=entrada.nextInt();
        }while(a!=0);


    }
}