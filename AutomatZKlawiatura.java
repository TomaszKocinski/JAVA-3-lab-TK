package pl.edu.uksw.wmp.prja.laboratorium3;
//@author Kot

public class AutomatZKlawiatura implements Klawiatura {

    public String str;
    public Boolean czyMoznaDzialac;

    public AutomatZKlawiatura() {
        str = new String();
        czyMoznaDzialac = false;
    }

    public void nacisnijKlawisz(Klawisz arg) {

        if (arg != Klawisz.ANULUJ && arg != Klawisz.OK) {
            if (czyMoznaDzialac) {
                nacisnijKlawisz(Klawisz.ANULUJ);
                czyMoznaDzialac = false;
            }
            str += arg.getWartosc();
        }
        if (arg == Klawisz.OK) {
            czyMoznaDzialac = true;
        }
        if (arg == Klawisz.ANULUJ) {
            str = "";
        }
    }

    public String podajWpisanaWartosc() {
        if (czyMoznaDzialac) {
            String temp = str;
            str = "";
            czyMoznaDzialac = false;
            return temp;
        } else {
            return null;
        }
    }
}
