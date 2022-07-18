import java.util.HashSet;

public class Pizza {
    private Impasto impasto;
    private Formaggio formaggio;
    private HashSet<Condimento> condimenti;
    private boolean isRossa;
    private boolean isFritta;

    public Pizza() {
    }

    public Impasto getImpasto() {
        return impasto;
    }

    public void setImpasto(Impasto impasto) {
        this.impasto = impasto;
    }

    public Formaggio getFormaggio() {
        return formaggio;
    }

    public void setFormaggio(Formaggio formaggio) {
        this.formaggio = formaggio;
    }

    public HashSet<Condimento> getCondimenti() {
        return condimenti;
    }

    public void setCondimenti(HashSet<Condimento> condimenti) {
        this.condimenti = condimenti;
    }

    public boolean isRossa() {
        return isRossa;
    }

    public void setRossa(boolean rossa) {
        isRossa = rossa;
    }

    public boolean isFritta() {
        return isFritta;
    }

    public void setFritta(boolean fritta) {
        isFritta = fritta;
    }
}
