package pl.edu.uksw.wmp.prja.laboratorium3;
//@author Kot

public class Wplatomat extends Bankomat {

    Wplatomat() {
        super();
    }

    public void rozpocznijWplate() {
        rozpocznijWyplate();
    }

    public void polozPieniadze(int arg) {
        Pieniadze += arg;
    }

    public void nacisnijKlawisz(Klawisz arg) {
        super.nacisnijKlawisz(arg);
    }

}
