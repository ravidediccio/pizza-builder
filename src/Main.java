public class Main {
    public static void main(String[] args) {

        PizzaDirector pizzaDirector = new PizzaDirector();
        Pizza pizza = pizzaDirector.makePizzaMargherita(new PizzaMargheritaBuilder());

    }
}