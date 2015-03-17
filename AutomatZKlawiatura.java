/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.wmp.prja.laboratorium3;

/**
 *
 * @author Kot
 */
public class AutomatZKlawiatura implements Klawiatura {

    public String str;
    public Boolean czyMoznaDzialac;
    public int lastOK;
    public AutomatZKlawiatura() {
        str = new String();
        czyMoznaDzialac = false;
        lastOK=0;
    }

    @Override
    public void nacisnijKlawisz(Klawisz arg) {
        switch (arg) {
            case NUM0:
                str += "0";
                break;
            case NUM1:
                str += "1";
                break;
            case NUM2:
                str += "2";
                break;
            case NUM3:
                str += "3";
                break;
            case NUM4:
                str += "4";
                break;
            case NUM5:
                str += "5";
                break;
            case NUM6:
                str += "6";
                break;
            case NUM7:
                str += "7";
                break;
            case NUM8:
                str += "8";
                break;
            case NUM9:
                str += "9";
                break;
            case OK:
                lastOK=str.length();
                czyMoznaDzialac = true;
                break;
            case ANULUJ:
                str=str.substring(0, lastOK);
                break;
        }

    }

    public String podajWpisanaWartosc() {
        if (czyMoznaDzialac) {
            String temp = str;
            str = "";
            lastOK=0;
            czyMoznaDzialac = false;
            return temp;
        } else {
            return null;
        }

    }
}
