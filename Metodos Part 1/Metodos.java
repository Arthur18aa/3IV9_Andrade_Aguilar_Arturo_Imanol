import java.util.Scanner;
import java.util.*;

public class Metodos{

    public void menu(){

        Scanner entrada = new Scanner(System.in);

        int  eleccion;
        char letra;
        
        do{
            System.out.println("");
            System.out.println("Ey, asies, este programa fue hecho por mi: ");
            System.out.println("3IV9 Andrade Aguilar Arturo Imanol");
            System.out.println("");
            System.out.println("");
            System.out.println("Elige un programa a ejecutar");
            System.out.println("1. Edad");
            System.out.println("2. Area y Perimetro");
            System.out.println("3. Llamadas");
            

            eleccion = entrada.nextInt();


            switch(eleccion){

                case 1:

                    do{

                    Edad obj = new Edad();
                    obj.Edad();

                    System.out.println("Si quieres repetir presiona la letra 'r', si deseas salir presiona la letra 's'");

                    letra = entrada.next().charAt(0);

                    }while(letra == 'r');

                break;

                case 2:

                    do{

                    AreayPerimetro obj = new AreayPerimetro();
                    obj.Figuras();

                    System.out.println("Si quieres repetir presiona la letra 'r', si deseas salir presiona la letra 's'");

                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');

                break;

                case 3:

                    do{
                    Llamada obj = new Llamada();
                    obj.Celular();

                    System.out.println("Si quieres repetir presiona la letra 'r', si deseas salir presiona la letra 's'");

                    letra = entrada.next().charAt(0);

                    }while(letra == 'r');

                break;
                  }

                  System.out.println("Si quieres repetir presiona la letra 'r', si deseas salir presiona la letra 's'");

                  letra = entrada.next().charAt(0);

                }while(letra == 'z');
      }
  }
