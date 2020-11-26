public class UnLibro{
    
    private String titulo,autor;
    private int nohaylibro,available;


        public UnLibro(){

            this.titulo = titulo;
            this.autor = autor;
            this.nohaylibro = nohaylibro;
            this.available = available;
    }

        public void setTitulo(String titulo){
            this.titulo = titulo;
    }
        public String getTitulo(){
            return titulo;
    }

        public void setAutor(String autor){
            this.autor = autor;
    }
        public String getAutor(){
            return autor;
    }

        public void setnohaylibro(int nohaylibro){
            this.nohaylibro = nohaylibro;
    }
        public int getnohaylibro(){
            return nohaylibro;
    }

        public void setavailable(int available){
            this.available = available;
    }
        public int getavailable(){
            return available;
    }
}