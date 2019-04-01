import java.util.HashSet;

public class Dziennik {
    private HashSet<Wydarzenie> wydarzenia;

    public Dziennik() {
        wydarzenia = new HashSet<Wydarzenie>();
    }

    public void dodajWydarzenie(Wydarzenie w) {
        wydarzenia.add(w);
    }

    public void usunWydarzenie(Wydarzenie w) {
        wydarzenia.remove(w);
    }
}
