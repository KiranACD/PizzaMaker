public class Tomato implements Pizza{
    private Pizza pizza;

    public Tomato(Pizza p){
        this.pizza = p;
    }

    public int getCost(){
        return pizza.getCost() + 30;
    }

    public String getDescription(){
        return pizza.getDescription() + " + Tomato";
    }
}
