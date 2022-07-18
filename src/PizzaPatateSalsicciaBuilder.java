import java.util.HashSet;

public class PizzaPatateSalsicciaBuilder implements PizzaBuilder {

    private Pizza pizzaPatateSalsiccia = new Pizza();
    @Override
    public void addImpasto() {
        pizzaPatateSalsiccia.setImpasto(Impasto.QUATTROCEREALI);
        System.out.println("Abbiamo preparato l'impasto...");
    }

    @Override
    public void addFormaggio() {
        pizzaPatateSalsiccia.setFormaggio(Formaggio.MOZZARELLA);
        System.out.println("Abbiamo messo la mozzarella...");
    }

    @Override
    public void addCondimento() {
        HashSet<Condimento> condimentiPatateSalsiccia = new HashSet<>();
        condimentiPatateSalsiccia.add(Condimento.PATATE);
        condimentiPatateSalsiccia.add(Condimento.SALSICCIA);
        condimentiPatateSalsiccia.add(Condimento.OLIOEVO);
        pizzaPatateSalsiccia.setCondimenti(condimentiPatateSalsiccia);
        System.out.println("Abbiamo aggiunto i condimenti...");
    }

    @Override
    public boolean isRossa() {
        return false;
    }

    @Override
    public boolean isFritta() {
        return false;
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Ecco a te la pizza patate e salsiccia che avevi chiesto!");
        return pizzaPatateSalsiccia;
    }
}
