import java.util.*;

public class BiblioteCompleta{
    public void BiblioteCompleta(){
        
        Scanner entrada = new Scanner(System.in);
        OperacionesSi obj = new OperacionesSi();

            Libritoss l = new Libritoss();
            int opcion, i, cant, id;

            try{

                do{

                    System.out.println("Ingresa cuantos libros vas a registrar");
                    cant = entrada.nextInt();

                    if(cant<=0){
                        System.out.println("Em, ¿Todo bien en casa?");
                    }

             }while(cant<=0);

                 entrada.nextLine();

                    String Titulos[] = new String[cant];
                    String Autores[] = new String[cant];
                    int Libros[] = new int[cant];
                    int Prestados[] = new int[cant];
                    int Disponibles[] = new int[cant];

                 for(i=0;i<cant;i++){

                        System.out.println("Ingresa el titulo del libro del libro "+(i+1));
                        Titulos[i] = entrada.nextLine();
                        System.out.println("Ingresa el nombre del autor del libro "+(i+1));
                        
                        Autores[i] = entrada.nextLine();
                        l.random();
                        Libros[i] = l.getnohaylibro();
                        Prestados[i] = l.getavailable();
            }
                for(i=0;i<cant;i++){

                    Disponibles[i] = (Libros[i]-Prestados[i]);
                    System.out.println(Titulos[i]+", "+Autores[i]+", disponibles: "+Disponibles[i]);
            }
                do{
                    System.out.println("Elige una opcion");
                    System.out.println("1.....Prestamo");
                    System.out.println("2.....Devolver");
                    System.out.println("3.....Salir");

                    opcion = entrada.nextInt();

                switch(opcion){

                    case 1:

                        obj.mostrar(Titulos, Autores, Disponibles);

                        do{

                            System.out.println("Ingrese el ID del libro que se va a pedir a prestamo");
                            id = entrada.nextInt();
                            if(id<0||id>=cant){
                                System.out.println("No existe, como quieres que lo busque, si no existe? ");
                            }

                        }while(id<0||id>=cant);
                        if(Disponibles[id]>0){
                            Disponibles[id] -= 1;
                        }else{

                            System.out.println("Me bugie aqui, ¿como se hace?");
                        }
                    break;

                    case 2:

                        obj.mostrar(Titulos, Autores, Disponibles);
                        do{
                            System.out.println("Ingresa el ID del libro que vas a devolver");
                            id = entrada.nextInt();
                            if(id<0||id>=cant){
                                System.out.println("Otra vez tu con tus chistesitos, mejor pon bien el ID");
                            }
                        }while(id<0||id>=cant);

                        Disponibles[id] += 1;

                    break;

                    case 3:

                        System.out.println("Kmara ahí nos vemos");
                    break;
                }

             }while(opcion!=3);

             }catch(Exception e){

                System.out.println("Em, ¿Estas seguro que no necesitas ayuda?");
        }
    }
}