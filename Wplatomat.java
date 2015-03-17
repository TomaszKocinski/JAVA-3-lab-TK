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
public class Wplatomat extends Bankomat{
    Wplatomat(){
        super();
    }

    public void rozpocznijWplate() {

    }
    public void polozPieniadze(int arg) {
        Pieniadze+=arg;

    }     
    public int getPieniadze() {
        return Pieniadze;
    }
   
    
}
