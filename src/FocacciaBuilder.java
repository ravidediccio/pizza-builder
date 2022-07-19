import java.util.HashSet;

public class FocacciaBuilder implements PizzaBuilder{

    private Pizza focaccia = new Pizza();
    @Override
    public void addImpasto() {
        focaccia.setImpasto(Impasto.FARINAZERO);
        System.out.println("abbiamo preparato l'impasto...");
    }

    @Override
    public void addFormaggio() {
    }

    @Override
    public void addCondimento() {
        HashSet<Condimento> condimentiFocaccia = new HashSet<>();
        condimentiFocaccia.add(Condimento.ROSMARINO);
        condimentiFocaccia.add(Condimento.OLIOEVO);
          focaccia.setCondimenti(condimentiFocaccia);
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
        System.out.println("Ecco a te la focaccia!");
        return focaccia;
    }
}
