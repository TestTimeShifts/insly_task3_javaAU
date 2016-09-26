/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evgshifts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author AndreyUtk
 */
public class Shift {
    public final LocalDateTime startTime;
    public final LocalDateTime endTime;
    
    Shift(LocalDate startDate, int startHour, int startMinute, int endHour, int endMinute) {
        LocalTime startTime = LocalTime.of(startHour, startMinute);
        this.startTime = LocalDateTime.of(startDate, startTime);
        LocalTime endTime = LocalTime.of(endHour, endMinute);
        LocalDate endDate = (startHour > endHour) ? startDate : startDate.plusDays(1);
        this.endTime = LocalDateTime.of(endDate, endTime);
    }
    
//    Shift(LocalDate startDate, String startTime, String endTime) {
//        
//    }
}
