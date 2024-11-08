package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla {
    private final int hitelkeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelkeret) {
        super(tulajdonos);
        this.hitelkeret = hitelkeret;
    }

    public int getHitelkeret() {
        return hitelkeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (osszeg > 0 && (getEgyenleg() - osszeg) >= -hitelkeret) {
            befizet(-osszeg); // Kivonás az egyenlegből
            return true;
        }
        return false;
    }
}
