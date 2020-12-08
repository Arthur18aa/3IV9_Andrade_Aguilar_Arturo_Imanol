import java.util.Scanner;

public class Restauran {

    private int total = 0;
    private int opciones;
    private int compra;

    public void MenuOp(){

        Scanner entrada = new Scanner(System.in);

        //No supe que poner  así que ignore mis chascarillos ciberneticos
        int ded;
        String juan = null;
        final int precios[] = new int[16];

        precios[0] = 75;
        precios[1] = 89;
        precios[2] = 112;
        precios[3] = 135;
        precios[4] = 89;
        precios[5] = 115;
        precios[6] = 135;
        precios[7] = 175;
        precios[8] = 96;
        precios[9] = 119;
        precios[10] = 131;
        precios[11] = 167;
        precios[12] = 88;
        precios[13] = 97;
        precios[14] = 111;
        precios[15] = 157;


        Pizzas pisa = null;

                System.out.println("Bienvenido a la Pizzeria Mama Mia, le copiamos la frase a Mario y Luigi Asies");
                System.out.println("No soy su empleado ni su sirviente solo lo voy a atender, suelteme su orden y cantadita que no tengo todo el día");
        
        compra = entrada.nextInt();

        while (compra < 1) {

            do {

                System.out.println("Esta vez no hay mensaje que incite al odio o a la burla Admin triste\nPon bien el dato");
                compra = entrada.nextInt();

            } while (compra < 1);

        }
        Pizzas barca [] = new Pizzas[compra];

        for (int i = 0; i < compra; i++) {


                    System.out.println("Bueno ya se la sabe joven, escoja la que le guste más:");
                    System.out.println("1....Pizza Queso");
                    System.out.println("2....Pizza Pepperoni");
                    System.out.println("3....Pizza Vegetariana");

            opciones = entrada.nextInt();

            while (opciones < 1 || opciones > 3) {
                do {

                    System.out.println("Esta vez no hay mensaje que incite al odio o a la burla Admin triste\nPon bien el dato");
                    opciones = entrada.nextInt();

                } while (opciones < 1 || opciones > 3);
            }

                    System.out.println("¿De qué tamaño el ataud?");
                    System.out.println("1.....Chica");
                    System.out.println("2.....Mediana");
                    System.out.println("3.....Grande");
                    System.out.println("4.....Familiar");

            ded = entrada.nextInt();

            while (ded < 1 || ded > 4) {
                do {

                    System.out.println("Esta vez no hay mensaje que incite al odio o a la burla, pero ya bajale un poquito a tu comedia");
                    ded = entrada.nextInt();

                } while (ded < 1 || ded > 4);
            }


            switch(opciones){
                case 1:
                    
                        //supongamos que se usar polimorfismo

                    pisa = new Quesito();

                    Quesito queso = new Quesito();

                    queso.tipoqueso();
                    pisa.horno();
                    pisa.corte(ded);
                    pisa.empaque();

                    if (queso.equals("Mosarela")){
                        total += precios[ded-1];

                    }else{
                        total += precios[ded+3];
                    }

                    break;

                case 2:

                    pisa = new Pepperoni();

                    Pepperoni pepe = new Pepperoni();

                    pepe.maiteperroni();
                    pisa.horno();
                    pisa.corte(ded);
                    pisa.empaque();

                    total += precios[ded+7];

                    break;

                case 3:

                    pisa = new Vegetariana();

                    Vegetariana Veg = new Vegetariana();

                    Veg.ingredientesxd();
                    pisa.horno();
                    pisa.corte(ded);
                    pisa.empaque();

                    total += precios[ded+11];

                break;

            }
        }

        System.out.println("No invita la casa, debe de pagar: $"+total);

    }
}