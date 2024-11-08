package hu.petrik.bankiszolgaltatasok;

public class Main {
    public static void main(String[] args) {
        Tulajdonos tulajdonos1 = new Tulajdonos("Kiss Péter");
        Tulajdonos tulajdonos2 = new Tulajdonos("Nagy Anna");

        Bank bank = new Bank();

        Szamla szamla1 = bank.szamlaNyitas(tulajdonos1, 50000);
        Szamla szamla2 = bank.szamlaNyitas(tulajdonos2, 0);

        szamla1.befizet(100000);
        szamla1.kivesz(30000);

        szamla2.befizet(50000);
        ((MegtakaritasiSzamla) szamla2).kamatJovairas();

        Kartya kartya1 = szamla1.ujKartya("1234-5678-8765-4321");
        boolean sikeresVasarlas = kartya1.vasarlas(25000);

        int osszEgyenleg = bank.getOsszEgyenleg(tulajdonos1);
        Szamla legnagyobbEgyenleguSzamla = bank.getLegnagyobbEgyenleguSzamla(tulajdonos1);
        int osszHitelkeret = bank.getOsszHitelkeret();

        System.out.println("Tulajdonos1 összegyenlege: " + osszEgyenleg);
        System.out.println("Tulajdonos1 legnagyobb egyenlegű számlája: " + (legnagyobbEgyenleguSzamla != null ? legnagyobbEgyenleguSzamla.getEgyenleg() : "Nincs számla"));
        System.out.println("Összes hitelkeret: " + osszHitelkeret);
        System.out.println("Sikeres vásárlás: " + sikeresVasarlas);
    }
}

