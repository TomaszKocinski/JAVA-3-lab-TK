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
public class Bankomat extends AutomatZKlawiatura {

    private int Pieniadze;
    public String PIN;
    public Boolean czyDobryPIN, czyOKdoPIN;
    Bankomat() {
        super();
        Pieniadze = 1000;
        PIN = "1234";
        czyDobryPIN=false;
        czyOKdoPIN=false;
    }

    public int getPieniadze() {
        rozpocznijWyplate();
        return Pieniadze;
    }

    public void rozpocznijWyplate() {
       
        if(!czyOKdoPIN) return;
        
        String tempStr = str;
        if (tempStr == null) {
            return;
        }
        int tempPINLength = PIN.length();

        if (PIN.equals(tempStr.substring(0, tempPINLength-1)))  {
            return;
        }
        //wyp
        int kasa = Integer.valueOf(tempStr.substring(tempPINLength));
        if (kasa > Pieniadze) {
            return;
        }
        Pieniadze -= kasa;
        
       czyOKdoPIN=false;
    }
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
                czyOKdoPIN=true;
                break;
            case ANULUJ:
                str=str.substring(0, lastOK);
                break;
        }

    }
}
