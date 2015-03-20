package pl.edu.uksw.wmp.prja.laboratorium3;
//@author Kot

public enum Klawisz {

    NUM0(0), NUM1(1), NUM2(2), NUM3(3), NUM4(4), NUM5(5), NUM6(6), NUM7(7), NUM8(8), NUM9(9), OK(-1), ANULUJ(-2);

    private int wartosc;

    Klawisz(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }

}
