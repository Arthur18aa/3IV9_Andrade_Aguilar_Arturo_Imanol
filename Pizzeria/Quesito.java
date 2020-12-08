import java.util.Scanner;

public class Quesito extends Pizzas{


    public Quesito() {
    }

    public Quesito (String masa, String[] sauce, String[] ingredientes) {

        super(masa, sauce, ingredientes);

        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mosarela";
    }

    public String tipoqueso(){


        Scanner entrada = new Scanner(System.in);
        String quesillo ;

        System.out.println("Tipo de Queso:");
        System.out.println("1.- Parmesano");
        System.out.println("2.- Mosalera");

        quesillo = entrada.next();

        return quesillo;

        //supongamos que estoy haciendo bien la tarea
    }
}