public class Olive implements Pizza{
    private Pizza pizza;

    public Olive(Pizza p){
        this.pizza = p;
    }

    public int getCost(){
        return pizza.getCost() + 20;
    }

    public String getDescription(){
        return pizza.getDescription() + " + Olive";
    }
}
