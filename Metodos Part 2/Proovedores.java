import java.util.*;
public class Proovedores{

        String NombredeCliente;
        int i;
        int[] costo = new int[10];
        int[] existencia = new int[10];
        String[] producto = new String[10];

         float suma, Max, Min, Pro;

        Scanner entrada = new Scanner(System.in);
    
        public void Proovedores(){        
            EntradaDatos();
    }
        public void EntradaDatos(){

        System.out.println("Ingresa el nombre del cliente");
        NombredeCliente = entrada.next();

        System.out.println("Digite el costo y nombre de los productos");
            for(i = 0; i < costo.length; i++){

                System.out.println("Producto " + (i + 1));
                producto[i] = entrada.next();

                System.out.println("Costo");
                costo[i] = entrada.nextInt();

                suma += costo[i];
                System.out.println("Existencia " + (i + 1));
                
                existencia[i] = entrada.nextInt();
            }

        Min = Max = costo[0];

            for (i = 0; i < costo.length; i++){
                if(costo[i] > Max){
                    Max = costo[i];
                }
                else if(costo [i] < Min){
                    Min = costo[i];
                }
            }
        System.out.println("Existencia"); 
            
        Datos();
    }
        public void Datos(){      

        System.out.println("Los datos de los productos de nuestro cliente " + NombredeCliente + ".");
        System.out.println("Existencia: " + existencia[1]+ " producto de: " + producto[1] + ", con un costo de: $" + costo[1] + " cada uno");
        System.out.println("Existencia: " + existencia[2]+ " producto de: " + producto[2] + ", con un costo de: $" + costo[2] + " cada uno");

        System.out.println("Existencia: " + existencia[3]+ " producto de: " + producto[3] + ", con un costo de: $" + costo[3] + " cada uno");
        System.out.println("Existencia: " + existencia[4]+ " producto de: " + producto[4] + ", con un costo de: $" + costo[4] + " cada uno");
       
        System.out.println("Existencia: " + existencia[5]+ " producto de: " + producto[5] + ", con un costo de: $" + costo[5] + " cada uno");
        System.out.println("Existencia: " + existencia[6]+ " producto de: " + producto[6] + ", con un costo de: $" + costo[6] + " cada uno");
        
        System.out.println("Existencia: " + existencia[7]+ " producto de: " + producto[7] + ", con un costo de: $" + costo[7] + " cada uno");
        System.out.println("Existencia: " + existencia[8]+ " producto de: " + producto[8] + ", con un costo de: $" + costo[8] + " cada uno");
        
        System.out.println("Existencia: " + existencia[9]+ " producto de: " + producto[9] + ", con un costo de: $" + costo[9] + " cada uno");
        System.out.println("El total de costos es de: $" + suma);
        
        System.out.println("Costo mayor: $" + Max);
        System.out.println("Costo menor: $" + Min);

        Pro = suma/10;
        System.out.println("El promedio de los costos es de: $" + Pro);
    }
}