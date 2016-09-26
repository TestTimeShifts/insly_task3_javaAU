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
public class NightShift {
    public final LocalDateTime todayStartTime;
    public final LocalDateTime todayEndTime;
    public final LocalDateTime tomorrowStartTime;
    public final LocalDateTime tomorrowEndTime;    
    
    
    NightShift(int startHour, int startMinute, int endHour, int endMinute) {
        this.todayStartTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(startHour, startMinute));
        this.todayEndTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(endHour, endMinute));
        this.tomorrowStartTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(startHour, startMinute)).plusDays(1);
        this.tomorrowEndTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(endHour, endMinute)).plusDays(1);
    }
    
    public void getAll () {
        System.out.println(this.todayStartTime);
        System.out.println(this.todayEndTime);
        System.out.println(this.tomorrowStartTime);
        System.out.println(this.tomorrowEndTime);
    }
}
