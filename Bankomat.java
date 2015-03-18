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
    protected int Pieniadze;
    public String PIN;

    Bankomat() {
        super();
        Pieniadze = 1000;
        PIN = new String("1234");
    }
    public int getPieniadze() {
        rozpocznijWyplate();
        return Pieniadze;
    }
    public void rozpocznijWyplate() {
        String tempStr = str;
        int tempPINLength = PIN.length(); 
        if (czyMoznaDzialac ) {
            if (PIN.equals(tempStr.substring(0, tempPINLength))) {
                int kasa = Integer.valueOf(tempStr.substring(tempPINLength));
                if (kasa <= Pieniadze) {
                    Pieniadze -= kasa;
                }
            }
             podajWpisanaWartosc();
        }
    }

}
