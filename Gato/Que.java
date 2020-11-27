import java.util.*;
class Que extends Principal{

    public void Que(){

        Scanner entrada = new Scanner(System.in);

         int matriz[][] = new int [3][3];

         String player1,player2;

        int opcion,o,x;

    do{

       System.out.println("Hola Gamers\nBienvenido a League of Gato");
        System.out.println("\nEste programa fue realizado por:\n3IV9 Andrade Aguilar Arturo Imanol\n");

        System.out.println("\nPara empezar a jugar necesito sus nombres\n");

        System.out.println("Player 1: ");

        player1=entrada.nextLine();

        System.out.println("Player 2: ");

        player2=entrada.nextLine();

        System.out.println("¿Quién va a empezar?");

        System.out.println("1." +player1);
        System.out.println("2."+player2);

      opcion=entrada.nextInt();

      
      switch(opcion){
        
        case 1:

      Juego ayuda = new Juego();

        ayuda.p1();
      
      break;

      case 2:

      Juego aiuda = new Juego();
        aiuda.p2();
        
      break;

    }
    }while(opcion!=3);
  }
}