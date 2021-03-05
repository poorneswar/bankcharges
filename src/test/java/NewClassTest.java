/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prudvi
 */
public class NewClassTest {
    
    public NewClassTest() {
    }

   

    @Test
    public void testOutputfee() {
        System.out.println("outputfee");
        int check = 19;
        double expResult = 11.9;
        double result = NewClass.outputfee(check);
        assertEquals(expResult, result, 0.0);
    }
    
}
