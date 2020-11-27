import java.util.Scanner;
  class Juego extends Que{


    Scanner entrada = new Scanner(System.in);
    
    int x,o;
    String player1,player2;

    private int matriz[][] = new int [3][3];

    public void p1(){

      try{

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");

        System.out.println(player1 + " X Columna: ");
        o=entrada.nextInt();

        System.out.println(player1 + " X Fila: ");
        x=entrada.nextInt();

          matriz[o][x]=1;

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
        System.out.println(player2 + " O Columna: ");
        o=entrada.nextInt();

        System.out.println(player2 + " O Fila: ");
        x=entrada.nextInt();

          matriz[o][x]=2;

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
        System.out.println(player1 + " X Columna: ");
        o=entrada.nextInt();

        System.out.println(player1 + " X Fila: ");
        x=entrada.nextInt();
      
          matriz[o][x]=1;

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
        System.out.println(player2 + " O Columna: ");
        o=entrada.nextInt();

        System.out.println(player2 + " O Fila: ");
        x=entrada.nextInt();

          matriz[o][x]=2;

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
        System.out.println(player1 + " X Columna: ");
        o=entrada.nextInt();

        System.out.println(player1 + " X Fila: ");
        x=entrada.nextInt();
      
          matriz[o][x]=1;

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
        System.out.println(player2 + " O Columna: ");
        o=entrada.nextInt();

        System.out.println(player2 + " O Fila: ");
        x=entrada.nextInt();

          matriz[o][x]=2;

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
        System.out.println(player1 + " X Columna: ");
        o=entrada.nextInt();

        System.out.println(player1 + " X Fila: ");
        x=entrada.nextInt();

          matriz[o][x]=1;

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
        System.out.println(player2 + " O Columna: ");
        o=entrada.nextInt();
      
        System.out.println(player2 + " O Fila: ");
        x=entrada.nextInt();
      
          matriz[o][x]=2;

        System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
        System.out.println(player1 + " X Columna: ");
        o=entrada.nextInt();
      
        System.out.println(player1 + " X Fila: ");
        x=entrada.nextInt();
      
          matriz[o][x]=1;

          for(int o=0;o<matriz.length;o++){
          for(int x=0;x<matriz.length;x++){

        System.out.println("Si O="+o+"X="+x+" : "+ matriz[o][x]);

    }
  }

        System.out.println("Bien jugado, ha ganado: " + player1);


        }catch(Exception e){
        

      System.out.println("Que parte de solo se puede poner 1,2 o 3 ¿no entiendes? ");
  

    }
  }



    public void p2(){

        try{

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player2 + " O Columna: ");
      o=entrada.nextInt();
    
      System.out.println(player2 + " O Fila: ");
      x=entrada.nextInt();
    
        matriz[o][x]=2;

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player1 + " X Columna: ");
      o=entrada.nextInt();
    
      System.out.println(player1 + " X Fila: ");
      x=entrada.nextInt();
    
        matriz[o][x]=1;

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player2 + " O Columna: ");
      o=entrada.nextInt();
      
      System.out.println(player2 + " O Fila: ");
      x=entrada.nextInt();
      
        matriz[o][x]=2;

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player1 + " X Columna: ");
      o=entrada.nextInt();
      
      System.out.println(player1 + " X Fila: ");
      x=entrada.nextInt();
      
        matriz[o][x]=1;

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player2 + " O Columna: ");
      o=entrada.nextInt();
      
      System.out.println(player2 + " X Fila: ");
      x=entrada.nextInt();
        
        matriz[o][x]=2;

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player1 + " X Columna: ");
      o=entrada.nextInt();
      
      System.out.println(player1 + " X Fila: ");
      x=entrada.nextInt();
        
        matriz[o][x]=1;

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player2 + " X Columna: ");
      o=entrada.nextInt();
      
      System.out.println(player2 + " X Fila: ");
      x=entrada.nextInt();
        
        matriz[o][x]=2;

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player1 + " X Columna: ");
      o=entrada.nextInt();
      
      System.out.println(player1 + " X Fila: ");
      x=entrada.nextInt();
        
        matriz[o][x]=1;

      System.out.println("Para localizar la posicion de la X ingres un numero del 0 al 2");
      System.out.println(player2 + " X Columna: ");
      o=entrada.nextInt();
      
      System.out.println(player2 + " X Fila: ");
      x=entrada.nextInt();
        
        matriz[o][x]=2;

        for(int o=0;o<matriz.length;o++){
        for(int x=0;x<matriz.length;x++){

      System.out.println("Si O="+o+"X="+x+" : "+ matriz[o][x]);

    }
  }
      
      System.out.println("Bien jugado, ha ganado: "+ player2 );

      return;
      
      }catch(Exception e){
      

    System.out.println("Que parte de solo se puede poner 1,2 o 3 ¿no entiendes?");

    }
  }
}
