
import java.util.*;

    class Menu{
    
        Scanner entrada = new Scanner(System.in);

        int eleccion;

        public void Metodos() {
    
        do{
                Sueldo lol = new Sueldo();
                Proovedores op = new Proovedores();
                BiblioteCompleta ok = new BiblioteCompleta();

                System.out.println("Bienvenido\nAntes que nada\n¿Como esta?\nBien supongo, continuemos");
                System.out.println("Elije una de las opciones:");
                System.out.println("1.....Sueldos");
                System.out.println("2.....Proovedores");
                System.out.println("3.....Biblioteca");
                System.out.println("4.....Salir");

                eleccion = entrada.nextInt();

                switch (eleccion) {
                        case 1:

                    lol.Sueldo();
                    break;

                    case 2:

                    op.Proovedores();
                    break;

                    case 3:

                    ok.BiblioteCompleta();
                    break;

                    case 4:

                    System.out.println("Quedo chido el código, ¿si o no?");
                    break;
             }
                }while (eleccion != 4);
    }
}