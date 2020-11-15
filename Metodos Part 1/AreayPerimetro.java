import java.util.Scanner;

  public class AreayPerimetro{ 

    Scanner entrada = new Scanner(System.in);
        
      int figura, radio, base, altura, lado1, lado2;
      double perimetro, area;
    
      public void Figuras(){

        

        System.out.println("Escoge una figura para realizar el procedimiento");
        System.out.println("1.....Circulo");
        System.out.println("2.....Rectangulo");
        System.out.println("3.....Cuadrado");
        System.out.println("4.....Triangulo");
        
        figura = entrada.nextInt();
        
        switch(figura){

            case 1:

                circulo();

            break;

            case 2:

                rectangulo();

            break;
            
            case 3:

                cuadrado();

            break;

            case 4:

                triangulo();

            break;
        }
    }

    public void circulo(){

        System.out.println("Escribe el radio del circulo");
        
        radio = entrada.nextInt();
        perimetro = (2*3.14)*radio;
        area = 3.14*(radio*radio);
        
        System.out.println("La circunferencia mide" + perimetro);
        System.out.println("El area mide" + area);

    }

    public void rectangulo(){

        System.out.println("Escribe la medida de la base del rectangulo");
        
        base = entrada.nextInt();
        
        System.out.println("Escribe la altura de el rectangulo");
        
        altura = entrada.nextInt();
        perimetro = base*altura;
        area = 2*(base+altura);

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);

    }

    public void cuadrado(){

        System.out.println("Escribe la medida de el lado de el cuadrado");

        base = entrada.nextInt();
        perimetro = base*4;
        area = base*base;

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);

    }

    public void triangulo(){

        System.out.println("Escribe la medida de la base del triangulo");
        
        base = entrada.nextInt();

        System.out.println("Escribe la medida de los lados del triangulo");
        
        lado1 = entrada.nextInt();
        lado2 = entrada.nextInt();

        System.out.println("Escribe la altura del triangulo");
        
        altura = entrada.nextInt();
        perimetro = base+lado1+lado2;
        area = altura*(base/2);

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }
}
