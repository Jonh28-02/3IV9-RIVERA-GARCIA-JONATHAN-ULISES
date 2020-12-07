
package pizza;

/**
 *
 * @author Ulises
 */
public class Pizza {
    
    private String masa;  //rellena de queso, crunch, con ajo
    private String[] salsa; //quiero una salva barbique, tomate, hiervas finas
    protected String[] ingredientes;
    
    public Pizza(){
    }
    
    public Pizza(String masa, String[] salsa, String[] ingredientes) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
    }
    
    //getter and setter
    
    public String getMasa() {
        return masa;
    }
    
    public void setMasa(String masa) {
        this.masa = masa;
    }
    
    public String[] getSalsa() {
        return salsa;
    }
    
    public void setSalsa(String[] salsa) {
        this.salsa = salsa;
    }
    
    public String[] getIngredientes() {
        return ingredientes;
    }
    
    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    //operaciones propias
    public void hornear(){
        System.out.println("Honear la pizza toma 15 min");
    }
    
    public void cortar(int porciones){
        switch(porciones){
            case 1:
                System.out.println("La pizza se corta en 4 porciones");
                break;
            case 2:
                System.out.println("La pizza se corta en 8 porciones");
                break;
            case 3:
                System.out.println("La pizza se corta en 12 porciones");
                break;
            case 4:
                System.out.println("La pizza se corta en 16 porciones");
                break;
                default:
        }
    }
    
    public void empacar(){
        System.out.println("La pizza se empaca en una cajita de corazon");
    }
    
    
    
    
    
}
