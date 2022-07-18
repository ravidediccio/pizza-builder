public class Main {
    public static void main(String[] args) {

        //builder della pizza margherita
        System.out.println("Stiamo preparando la pizza margherita per te:");
        PizzaDirector pizzaDirector = new PizzaDirector();
        PizzaBuilder pizzaMargheritaBuilder = new PizzaMargheritaBuilder();
        pizzaDirector.makePizzaMargherita(pizzaMargheritaBuilder);
        Pizza pizzaMargherita = pizzaMargheritaBuilder.getPizza();

        System.out.println("");

        //builder della pizza patate e salsiccia
        System.out.println("Stiamo preparando la pizza patate e salsiccia per te:");
        PizzaBuilder pizzaPatateSalsicciaBuilder = new PizzaPatateSalsicciaBuilder();
        pizzaDirector.makePizzaPatateSalsiccia(pizzaPatateSalsicciaBuilder);
        Pizza pizzaPatateSalsiccia = pizzaPatateSalsicciaBuilder.getPizza();


        System.out.println("\n");


        System.out.println(pizzaMargherita);
        System.out.println(pizzaPatateSalsiccia);
    }
}