/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.util;

import java.util.Calendar;

/**
 *
 * @author Matheus
 */
public class DatasUtil {
    
    // Calcula o número de dias (long diffOfDays) que se passaram da data (String a) até (String b), ex: diferencaDeDias("21/05/1992", "25/05/1992") == 4 
    public static long diferencaDeDias(String a, String b) {

        Calendar ca1 = Calendar.getInstance();
        Calendar ca2 = Calendar.getInstance();
        
        ca1.set(Integer.parseInt(a.substring(6,10)), Integer.parseInt(a.substring(3,5)), Integer.parseInt(a.substring(0,2)));
        ca2.set(Integer.parseInt(b.substring(6,10)), Integer.parseInt(b.substring(3,5)), Integer.parseInt(b.substring(0,2)));

        long milisecond1 = ca1.getTimeInMillis();
        long milisecond2 = ca2.getTimeInMillis();

        long diffInMSec = milisecond2 - milisecond1;

        long diffOfDays = diffInMSec / (24 * 60 * 60 * 1000);

        return diffOfDays;

    }
}