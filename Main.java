import java.util.Scanner;
import java.util.*;
import java.io.*;
//Se nombran las librerias
class Main{

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
      //Se declaran las variables
             
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
       System.out.println("4--Ir a la Batalla");
       System.out.println("5--Salir");
       
       //Se mencionan las opciones que hay y el funcionamiento de cada una

       opcion = entrada.nextInt();
    
       switch (opcion) {
         //Se abren las opciones a escoger
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
      //Se dice el contenido de la opcion
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
      //Se dice el contenido de la opcion
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
        //Se dice el contenido de la opcion
           case 4:
                System.out.println("Bienvenido al modo batalla");
        System.out.println("Elije a a tu pokemon");
        System.out.println("1--Charmander");
        System.out.println("2--Bulbasaor");
        System.out.println("3--squartle");
        vida1 = entrada.nextInt();
        vida2 = entrada.nextInt();
        vida3 = entrada.nextInt();
        //Se escriben las caractristicas

        if (vida1 == 95){
            System.out.println("Has elegido Charmander");
            System.out.println("Tu enemigo sera Bulbasaur");
            System.out.println("Batalla neutra");
            
            System.out.println("Elige tu ataque, (1= Primario, 2= Secundario");
            ataque1 = entrada.nextInt();
            //Se abre un if para verificar la caracteristica del ataque y saber si es efectivo o no
            if (ataque1 == 45 ){
            System.out.println("Haz atacado a Bulbasaur");
            }else{
                System.out.println("El ataque Tormenta de fuego fue efectivo");
                System.out.println("Bulbasaur esta cansado y ha sido derrotado");
            }
        }
        if (vida2 == 110){
            System.out.println("Has elegido Squirtle");
            System.out.println("Tu enemigo sera Charmander");
            System.out.println("Estas en ventaja");
            
            System.out.println("Elige tu ataque, (1= primario, 2= secundario");
            ataque2 = entrada.nextInt();
            if (ataque2 == 40){
            System.out.println("");
            }else{
                System.out.println("El ataque chorro de agua realizado fue efectivo y critico");
                System.out.println("Charmander se ha cansado y ha sido derrotado");
            }
        }
        if (vida3 == 105 ){
            System.out.println("Has elegido Bulbasaur");
            System.out.println("Tu enemigo sera Squirtle");
            System.out.println("Estas en desventaja");
            
            System.out.println("Elige tu ataque, (1. Primario, 2. Secundario");
            ataque3 = entrada.nextInt();
            if (ataque3 == 14){
            System.out.println("Haz atacado a Squirtle con fuerza");
            }else{
                System.out.println("Haz atacado a Squirtle con latigazo y el ataque fue efectivo");
                System.out.println("Squirtle se ha cansado y ha sido derrotado");
            }
        }
             break;     
           case 5:
            default:
               break;  
               //con esta opcion se sale directamente
       } 

        }while (opcion != 5); 
          

    } 
}           