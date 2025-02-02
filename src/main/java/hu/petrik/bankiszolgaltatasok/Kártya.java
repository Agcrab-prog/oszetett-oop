package hu.petrik.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas {
    private final Szamla mogottesSzamla;
    private final String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla mogottesSzamla, String kartyaSzam) {
        super(tulajdonos);
        this.mogottesSzamla = mogottesSzamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg) {
        return mogottesSzamla.kivesz(osszeg);
    }
}
