import java.util.HashSet;

public class PizzaMargheritaBuilder implements PizzaBuilder {

    private Pizza pizzaMargherita = new Pizza();

    @Override
    public void addImpasto() {
        pizzaMargherita.setImpasto(Impasto.FARINAZERO);
        System.out.println("Abbiamo preparato l'impasto...");
    }

    @Override
    public void addFormaggio() {
        pizzaMargherita.setFormaggio(Formaggio.MOZZARELLA);
        System.out.println("Abbiamo messo la mozzarella...");
    }

    @Override
    public void addCondimento() {
        HashSet<Condimento> condimentiMargherita = new HashSet<>();
        condimentiMargherita.add(Condimento.OLIOEVO);
        condimentiMargherita.add(Condimento.BASILICO);
        pizzaMargherita.setCondimenti(condimentiMargherita);
        System.out.println("Abbiamo aggiunto i condimenti...");
    }

    @Override
    public boolean isRossa() {
        System.out.println("Abbiamo messo il pomodoro...");
        return pizzaMargherita.isRossa();
    }

    @Override
    public boolean isFritta() {
        return false;
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Ecco a te la pizza margherita che avevi chiesto!");
        return pizzaMargherita;
    }
}
