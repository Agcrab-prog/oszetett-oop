package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private static final double ALAPKAMAT = 1.1;
    private double kamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = ALAPKAMAT;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (osszeg > 0 && getEgyenleg() >= osszeg) {
            befizet(-osszeg); // Kivonás az egyenlegből
            return true;
        }
        return false;
    }

    public void kamatJovairas() {
        befizet((int) (getEgyenleg() * kamat - getEgyenleg()));
    }
}

