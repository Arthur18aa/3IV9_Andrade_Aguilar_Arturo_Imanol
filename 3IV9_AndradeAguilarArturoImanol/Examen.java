import java.util.Scanner;
import java.util.*;
import java.io.*;

class Examen{

    public static void main(String[] args) throws 
    IOException{

        Scanner entrada = new Scanner(System.in);
         int charmander, bulbasaur,squirtle, opcion;
         int vida1 = 95;
         int fuerza1 = 65;
         int ataque1 = 45;
         int ataquesec1 = 20;
         int vida2 = 110;
         int fuerza2 = 60;
         int ataque2 = 40;
         int ataquesec2 = 17; 
         int vida3 = 105;
         int fuerza3 = 55;
         int ataque3 = 14;       
         int ataquesec3 = 23;

             
    do{
       System.out.println("Este programa fue elaborado por:");
       System.out.println("3IV9_Andrade Aguilar Arturo Imanol");
       System.out.println(" ");
       System.out.println("Hola Gamer UwU");
       System.out.println("//////////////////");
       System.out.println("Bienvenido a Tu Pokedex");
       System.out.println("//////////////////");
       System.out.println(" ");
       System.out.println("Aquí podrás ver la variedad de Pokemones y podrás consultar sus datos");
       System.out.println("¿Que pokemon deseas conocer?");
       System.out.println(" ");
       System.out.println("1--Charmander");
       System.out.println("2--Bulbasaur");
       System.out.println("3--Squirtle");
       System.out.println("4--Salir");
       
       opcion = entrada.nextInt();
    
       switch (opcion) {
           case 1:
            System.out.println("¡Buenas Elección!, escogiste a Charmander");
            System.out.println("La ID de tu Charmander es: 1");
            System.out.println("La vida de tu Charmander es: " + vida1);
            System.out.println("La fuerza de tu Charmander " + fuerza1);
            System.out.println("El ataque Principal de tu Charmander es: " + ataque1);
            System.out.println("El ataque Secundario de tu Charmander es: " + ataquesec1);

             vida1 = 95 ;
             fuerza1 = 65 ;
             ataque1 = 45 ;
             ataquesec1 = 20 ;

               break;

           case 2:
             System.out.println("¡Ey, buena decision! Elegiste a Bulbasaur");
             System.out.println("La ID de tu Bulbasaur es: 2");
             System.out.println("La Vida de tu Bulbasaur es: " + vida2);
             System.out.println("La Fuerza de tu Bulbasaur " + fuerza2);
             System.out.println("El Ataque Principal de tu Bulbasaur es: " + ataque2);
             System.out.println("El Ataque Secundario de tu Bulbasaur es: " + ataquesec2);
             vida2 = 110;
             fuerza2 = 60;
             ataque2 = 40;
             ataquesec2 = 17;
              break;    
           case 3:
             System.out.println("¡Oleee, que gran decision! Elegiste a Squirtle");
             System.out.println("La ID de tu Squirtle es: 3");
             System.out.println("La Vida de tu Squirtle es: " + vida3);
             System.out.println("La Fuerza de tu Squirtle " + fuerza3);
             System.out.println("El Ataque Principal de tu Squirtle es: " + ataque3);
             System.out.println("El Ataque Secundario de tu Squirtle es: " + ataquesec3);
             vida3 = 105;
             fuerza3 = 55;
             ataque3 = 14;
             ataquesec3 = 23;
              break; 
           case 4:
                

             break;     
           case 5:
            default:
               break;    
       } 
        }while (opcion != 5); 
        

    } 
}           