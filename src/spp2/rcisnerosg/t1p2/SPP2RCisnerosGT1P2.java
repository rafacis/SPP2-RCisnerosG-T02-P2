/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rcisnerosg.t1p2;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class SPP2RCisnerosGT1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valinf, valsup;
       double resu;
       Scanner T = new Scanner (System.in);
        System.out.println("Introduce el valor inferior");
        valinf = T.nextInt ();
        System.out.println("Introduce el valor superior");
        valsup = T.nextInt ();
    do {
        valinf ++;
        resu = valinf % 2;
        if (resu > 0 || resu > 0){
            System.out.println(valinf + " no es divisible entre 2");
        }
        else {
            System.out.println(valinf + " es divisible entre 2");
        }
        resu = valinf % 3;
        if (resu > 0 || resu > 0){
            System.out.println(valinf + " no es divisible entre 3");
        }
        else {
            System.out.println(valinf + " es divisible entre 3");
        }
        resu = valinf % 5;
        if (resu > 0 || resu > 0){
            System.out.println(valinf + " no es divisible entre 5");
        }
        else {
            System.out.println(valinf + " es divisible entre 5");
        }
    }
        while (valinf < (valsup - 1));
    
    }
    
}
