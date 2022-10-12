public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}