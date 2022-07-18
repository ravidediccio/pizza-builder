public class PizzaDirector {

    void makePizzaMargherita(PizzaMargheritaBuilder builder) {
        builder.addImpasto();
        builder.addFormaggio();
        builder.addCondimento();
        builder.isRossa();
        builder.getPizza();
    }
}
