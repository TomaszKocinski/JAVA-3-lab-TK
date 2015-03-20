package pl.edu.uksw.wmp.prja.laboratorium3;
//@author Kot

enum flaga {

    NIC, GOTOWY, POB_PIN;
}

public class Bankomat extends AutomatZKlawiatura {

    protected int Pieniadze;
    protected String PIN;
    protected flaga flag;

    Bankomat() {
        super();
        Pieniadze = 1000;
        PIN = new String("1234");
        flag = flaga.NIC;
    }

    public int getPieniadze() {
        return Pieniadze;
    }

    public void rozpocznijWyplate() {
        flag = flaga.GOTOWY;
    }

    public void nacisnijKlawisz(Klawisz arg) {
        if (flag != flaga.NIC) {
            if (arg != Klawisz.ANULUJ && arg != Klawisz.OK) {
                super.nacisnijKlawisz(arg);
            }
            if (arg == Klawisz.OK) {
                wcisnietyOK();
            }
            if (arg == Klawisz.ANULUJ) {
                flag = flaga.NIC;
                str = "";
                czyMoznaDzialac = false;
            }
        }
    }

    public void wcisnietyOK() {
        if (flag == flaga.GOTOWY) {
            czyMoznaDzialac = true;
            if (PIN.equals(podajWpisanaWartosc())) {
                flag = flaga.POB_PIN;
            } else {
                flag = flaga.NIC;
            }
        } else if (flag == flaga.POB_PIN) {
            czyMoznaDzialac = true;
            int kasa = Integer.valueOf(podajWpisanaWartosc());
            if (kasa <= Pieniadze) {
                Pieniadze -= kasa;
            }
        }
    }
}
