/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.org.apache.regexp.internal.RETest.test;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author psomers
 */
public class HelloWorldUnit {
    
    @Test
    public void testNumbers() {
        
        int first = 5;
        int second = 5;
        
        assertEquals(first, second);
        //assertEquals(first, third);
    }
    @Test
    public void testOtherNumbers() {
        int first = 5;
        assertEquals (first, 6);
    }
}
