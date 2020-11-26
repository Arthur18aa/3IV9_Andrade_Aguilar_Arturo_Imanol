  
import java.util.*;

public class Sueldo{

        int ID, puesto, SueldoD, SueldoN;

        double gastos, sueldos;
        double SueldoEntrada = 5000;
        double SueldoSalida = 8000;
        double Infonavit = 8;
        double ISR = 16; 
        double SeguroGM = 12.8;

        String Nombresito;

         Scanner entrada = new Scanner(System.in);

     public void Sueldo(){

            Sueldo obj = new Sueldo();

            obj.dinerito();
    }
        public void dinerito(){

        System.out.println("Ingresa tu ID:");

        ID = entrada.nextInt();

        System.out.println("Ingresa tu nombre");

        Nombresito = entrada.next();
        
            do{

                System.out.println("Ingresa el puesto de trabajo");
                System.out.println("1.....Esclavo o era ¿Empleado?");
                System.out.println("2.....El mero mero, el supervisor");

                puesto = entrada.nextInt();

            }while (puesto > 2 ||  puesto < 1);

             if(puesto == 1){
                Empleado();
        }
            else{
                Supervisor();
        }
    }

        public void Empleado(){
            System.out.println("Escribe la cantidad de horas extra trabajadas durante el dia");
            int SueldoD = entrada.nextInt();
            System.out.println("Escribe la cantidad de horas extra trabajadas en horario de noche");
            int SueldoN = entrada.nextInt();

            SueldoD = SueldoD*50;
            SueldoN = SueldoN*60;

            sueldos = SueldoEntrada + SueldoD + SueldoN;
            Total();
    }
            public void Supervisor(){

                gastos = Infonavit + ISR + SeguroGM;
                sueldos = SueldoSalida - gastos;

            Total();
    }

        public void Total(){

            System.out.println("El sueldo de: "+ID+" "+Nombresito+" es de: $" +sueldos);
    }
}