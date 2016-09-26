/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evgshifts;

import java.time.Period;

/**
 *
 * @author AndreyUtk
 */
public class EmployeeShift {
    public final Employee employee;
    public final Shift shift;
    public final NightShift nightShift;
    
    EmployeeShift(Employee employee, Shift shift, NightShift nightShift) {
        this.employee = employee;
        this.shift = shift;
        this.nightShift = nightShift;
    }
    

    public Period dayHours() {
      return Period.ZERO;
    }
    
    public Period nightHours() {
      return Period.ZERO;
    }
    
    public Period totalHours() {
      return Period.ZERO;
    }
    
}
