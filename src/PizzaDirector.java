public class PizzaDirector {

    public void makePizzaMargherita(PizzaBuilder builder) {
        builder.addImpasto();
        builder.isRossa();
        builder.addFormaggio();
        builder.addCondimento();
    }

    public void makePizzaPatateSalsiccia(PizzaBuilder builder) {
        builder.addImpasto();
        builder.isRossa();
        builder.addFormaggio();
        builder.addCondimento();
    }

    public void makeFocaccia(PizzaBuilder builder){
        builder.addImpasto();
        builder.addCondimento();
    }

}
