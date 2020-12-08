import java.util.Scanner;

public class Pepperoni extends Pizzas{

    public Pepperoni() {

    }

    public Pepperoni (String masa, String[] salsa, String[] ingredientes) {

        super(masa, salsa, ingredientes);

        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[4] = "Doble Peperoni en Rodajas";

    }
    public String maiteperroni(){
        
        int opcion;

        Scanner entrada = new Scanner(System.in);
        String ruedaroja;

            System.out.println("No sabia que había tipos de peperoni pero escoja uno:");
            System.out.println("1......Solo Peperoni");
            System.out.println("2......Con Parmesano");
            System.out.println("3......Con Albaca");
            System.out.println("4......Más Pepperoni");

        ruedaroja = entrada.next();

        return ruedaroja;
    }
}