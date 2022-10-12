public class Paneer implements Pizza{
    private Pizza pizza;

    public Paneer(Pizza p){
        this.pizza = p;
    }

    public int getCost(){
        return pizza.getCost() + 60;
    }

    public String getDescription(){
        return pizza.getDescription() + " + Paneer";
    }
}
