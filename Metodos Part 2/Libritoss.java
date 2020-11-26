public class Libritoss extends UnLibro{

    private int nLibro,nPrestados;

    public Libritoss(){}
    public void random(){

        nLibro = ((int)Math.round(Math.random()*20));

        do{
            nPrestados = ((int)Math.round(Math.random()*20));
        }while(nPrestados>nLibro);

        setnohaylibro(nLibro);

        setavailable(nPrestados);

    }
}