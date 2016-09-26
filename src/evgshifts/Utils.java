/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evgshifts;

/**
 *
 * @author AndreyUtk
 */
public class Utils {
    public static int getHourFromString(String hhmm) {
        return Integer.parseInt(hhmm.substring(0, (hhmm.indexOf(":"))));
//        return 12;
    }
    
    public static int getMinuteFromString(String hhmm) {
//        return Integer.parseInt(hhmm.substring((hhmm.indexOf(":")+1),hhmm.length()));
        String[] time = hhmm.split(":");
        return Integer.parseInt(time[1]);
    }
}
