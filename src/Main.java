public class Main {
    public static void main(String[] args) {

        PizzaDirector pizzaDirector = new PizzaDirector();

        //builder della pizza margherita
        System.out.println("Stiamo preparando la pizza margherita per te:");
        PizzaBuilder pizzaMargheritaBuilder = new PizzaMargheritaBuilder();
        pizzaDirector.makePizzaMargherita(pizzaMargheritaBuilder);
        Pizza pizzaMargherita = pizzaMargheritaBuilder.getPizza();

        System.out.println("\n");

        //builder della pizza patate e salsiccia
        System.out.println("Stiamo preparando la pizza patate e salsiccia per te:");
        PizzaBuilder pizzaPatateSalsicciaBuilder = new PizzaPatateSalsicciaBuilder();
        pizzaDirector.makePizzaPatateSalsiccia(pizzaPatateSalsicciaBuilder);
        Pizza pizzaPatateSalsiccia = pizzaPatateSalsicciaBuilder.getPizza();

<<<<<<< HEAD
        System.out.println(" ");

        //builder della pizza patate e wustel
        System.out.println("stiamo preparando la pizza più buona tra tutte per te,ovvero patate e wustel :) :");
        PizzaBuilder pizzaWustelEPatateBuilder = new PizzaWustelEPatateBuilder();
        pizzaDirector.makePizzaWustelEPatate(pizzaWustelEPatateBuilder);
        Pizza pizzaWustelEPatate = pizzaWustelEPatateBuilder.getPizza();
=======
        System.out.println("\n");


        //builder della focaccia
        System.out.println("Stiamo preparando la focaccia per te:");
        PizzaBuilder focacciaBuilder = new FocacciaBuilder();
        pizzaDirector.makeFocaccia(focacciaBuilder);
        Pizza focaccia = focacciaBuilder.getPizza();

>>>>>>> a54dc5a9d2bd66177ed69221655675b7f4866365


        System.out.println("\n");


        System.out.println(pizzaMargherita);
        System.out.println(pizzaPatateSalsiccia);
<<<<<<< HEAD
        System.out.println(pizzaWustelEPatate);
=======
        System.out.println(focaccia);
>>>>>>> a54dc5a9d2bd66177ed69221655675b7f4866365
    }
}