/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evgshifts;

import java.time.LocalDate;
import java.util.HashMap;

/**
 *
 * @author AndreyUtk
 */
public class EvgShifts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap employees = new HashMap();
//        int count = 0;
//        for {
//            Emplouyee emp = new Emplouyee();
//            Shift sh = new Shift();
//            EmployeeShift es = new EmployeeShift(emp,sh);
//            employees.put(count,es);
//            count++;
//        }
        
        
//        employees.put(1, new EmployeeShift(new Employee("Peter"), new Shift(LocalDate.now(), Utils.getHourFromString("07:15"), Utils.getMinuteFromString("07:15"), 15, 30)));
//        employees.put(2, new EmployeeShift(new Employee("Ivan"), new Shift(LocalDate.now(), 23, 0, 7, 30)));
//        System.out.println(Utils.getHourFromString("7:15"));
        System.out.println(Utils.getMinuteFromString("7:15"));
        
        
        NightShift nightShift = new NightShift (22, 0, 8, 0);
        nightShift.getAll();
        
        
    }
    
}
