public interface PizzaBuilder {

    void addImpasto();
    void addFormaggio();
    void addCondimento();
    boolean isRossa();
    boolean isFritta();
    Pizza getPizza();
}
