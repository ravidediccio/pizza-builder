import java.util.HashSet;

public class PizzaWustelEPatateBuilder implements PizzaBuilder{

    private Pizza pizzaWustelEPatate = new Pizza();
    @Override
    public void addImpasto() {
         pizzaWustelEPatate.setImpasto(Impasto.FARINAZERO);
        System.out.println("impastato con roba top quality");
    }

    @Override
    public void addFormaggio() {
      pizzaWustelEPatate.setFormaggio(Formaggio.MOZZARELLA);
        System.out.println("ricorperto di mozzarellona filante");
    }

    @Override
    public void addCondimento() {
        HashSet<Condimento> condimentoWustelEPatate = new HashSet<>();
        condimentoWustelEPatate.add(Condimento.PATATE);
        condimentoWustelEPatate.add(Condimento.WUSTEL);
        pizzaWustelEPatate.setCondimenti(condimentoWustelEPatate);
        System.out.println("abbiamo aggiunto delle soffici patate con dei grandi wustel");
    }

    @Override
    public boolean isRossa() {
        return pizzaWustelEPatate.isRossa();
    }

    @Override
    public boolean isFritta() {
        return false;
    }

    @Override
    public Pizza getPizza() {
        System.out.println("eccote la pizza del diablo");
        return pizzaWustelEPatate;
    }
}
