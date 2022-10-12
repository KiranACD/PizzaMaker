public class Cheese implements Pizza{
    private Pizza pizza;

    public Cheese(Pizza p){
        this.pizza = p;
    }

    public int getCost(){
        return pizza.getCost() + 80;
    }

    public String getDescription(){
        return pizza.getDescription() + " + Cheese";
    }
}
