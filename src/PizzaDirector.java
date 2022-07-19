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

<<<<<<< HEAD
    public  void makePizzaWustelEPatate(PizzaBuilder builder){
        builder.addImpasto();
        builder.addFormaggio();
        builder.addCondimento();
        builder.isRossa();
=======
    public void makeFocaccia(PizzaBuilder builder){
        builder.addImpasto();
        builder.addCondimento();
>>>>>>> a54dc5a9d2bd66177ed69221655675b7f4866365
    }

}
