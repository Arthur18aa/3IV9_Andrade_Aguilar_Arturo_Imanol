import java.util.Scanner;

public class Vegetariana extends Pizzas{

    Scanner entrada = new Scanner(System.in);

    public Vegetariana() {
    }

    public Vegetariana(String masa, String[] salsa, String[] ingredientes) {

        super(masa, salsa, ingredientes);

        this.ingredientes = new String[4];

        //No se de comida vegana espero no ser juzgado por esto
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Pepino";
        this.ingredientes[2] = "Cosas Veganas";
        this.ingredientes[3] = "Lechuga";

    }

    public String ingredientesxd(){

        String Ingrediente;

        System.out.println("Se que no aprecias tu paladar al comer esto, dime que quieres agregarle a tu sufrimiento");
        System.out.println("1....Champiñon");
        System.out.println("2....¿Pepino?");
        System.out.println("3....¿Cosas Veganas?");
        System.out.println("4....¿Lechuga?");
        Ingrediente = entrada.next();

        return Ingrediente;
    }
} 