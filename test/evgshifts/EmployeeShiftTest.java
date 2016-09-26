/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evgshifts;

import java.time.LocalDate;
import java.time.Period;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evgeny.goroshko
 */
public class EmployeeShiftTest {
  
  public static EmployeeShift instance;
//  public static
  
  
  public EmployeeShiftTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
   Employee employee = new Employee("John");
   Shift shift = new Shift(LocalDate.now(), 14, 0, 23, 0);
   NightShift nightShift = new NightShift(22, 0, 8, 0);
    
    
   instance = new EmployeeShift(employee, shift, nightShift);
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of dayHours method, of class EmployeeShift.
   */
  @Test
  public void testDayHours() {
    System.out.println("dayHours");
     
    Period expResult = null;
    Period result = instance.dayHours();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
  }

  /**
   * Test of nightHours method, of class EmployeeShift.
   */
  @Test
  public void testNightHours() {
    System.out.println("nightHours");
    EmployeeShift instance = null;
    Period expResult = null;
    Period result = instance.nightHours();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of totalHours method, of class EmployeeShift.
   */
  @Test
  public void testTotalHours() {
    System.out.println("totalHours");
    Period expResult = null;
    Period result = instance.totalHours();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }


}
