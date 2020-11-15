import java.util.Scanner;

public class Llamada{

    public void Celular(){
        
        Scanner entrada = new Scanner(System.in);

        int i, credito = 150;
        int numeros[] = new int [10];
        int Na = 0; 
        int Inter = 0; 
        int Cel = 0;
        double GasTotal;
        double sumaNa = 0;
        double sumaInter = 0;
        double sumaCel = 0;
        char letra;
        
        System.out.println("Bienvenido a Telcel");
        System.out.println("Escoge uno de los planes telefónicos");
        System.out.println("");
        System.out.println("1......Llamadas Nacionales");
        System.out.println("2......Llamadas Internacionales");
        System.out.println("3......Celular Común");
        System.out.println("El saldo con el que cuenta es de $150");

        for (i = 0; i < numeros.length; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (i = 0; i < numeros.length; i++){
            if (numeros[i] == 1){
                Na++;
                sumaNa = Na*0.5;
            }

            else if (numeros[i] == 2){
                Inter++;
                sumaInter = (Inter/2)*(0.6);
            }

            else if (numeros[i] == 3){
                Cel++;
                sumaCel = (Cel/3)*0.2;
            }
        }
            
        GasTotal = sumaNa + sumaInter + sumaCel;

        System.out.println("Se ha gastado un total de $" + GasTotal);

        System.out.println("Si deseas saber tu saldo, presiona la letra 'a', si no es así presiona cualquier otra letra ");
        
        letra = entrada.next().charAt(0);
        
        if(letra == 'a'){

            System.out.println("Tu saldo original es de $" + credito );

            System.out.println("Su saldo actual es de $" + (credito - GasTotal));
        }
    }
}
