public class Pizzas{

    private String masa;
    private String[] sauce;
    protected String[] ingredientes;

    public Pizzas(){}
    
        public Pizzas(String masa, String[] sauce, String[] ingredientes) {
            this.masa = masa;
            this.sauce = sauce;
            this.ingredientes = ingredientes;
        }

        public String getMasa() {
            return masa;
        }

        public void setMasa(String masa) {
            this.masa = masa;
        }

        public String[] getSauce() {
            return sauce;
        }

        public void setSauce(String[] sauce) {
            this.sauce = sauce;
        }

        public String[] getIngredientes() {
            return ingredientes;
        }

        public void setIngredientes(String[] ingredientes) {
            this.ingredientes = ingredientes;
        }

        public void horno(){
            System.out.println("No se cuánto dura en honearse la vdd, pero sea paciente y vencerá");
        }
        public void corte(int partes){

            switch(partes){

            case 1:

                System.out.println("La pizza se corta en 4");

            break;

            case 2:

                System.out.println("La pizza se corta en 8");

            break;

            case 3:

                System.out.println("La pizza se corta en 12");
            
            break;
            
            case 4:

                System.out.println("La pizza se corta en 16");

            break;
        }
     }

            public void empaque(){

                System.out.println("Pues está empacada y lista para comer, si se le enfría ni piense que se la vamos a calentar");
        }
}