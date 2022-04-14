package calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static double DELTA=1e-15;
    Calculator calculator=new Calculator();

    @Test
    public void addingTruePositive(){
        assertEquals("Adding two integers for true positive",8,calculator.add(3,5),DELTA);
        assertEquals("Adding two doubles for true positive",30.23,calculator.add(30.1,0.13),DELTA);
    }

    @Test
    public void addingFalsePositive(){
        assertNotEquals("Adding two integers for false positive",10,calculator.add(2,6),DELTA);
        assertNotEquals("Adding two doubles for false positive",3.6,calculator.add(0.1,0.8),DELTA);
    }

    @Test
    public void subtractingTruePositive(){
        assertEquals("Subtracting two integers for true positive",35,calculator.subtract(45,10),DELTA);
        assertEquals("Subtracting two doubles for true positive",50.50,calculator.subtract(51.0,0.5),DELTA);
    }

    @Test
    public void subtractingFalsePositive(){
        assertNotEquals("Subtracting two integers for false positive",19,calculator.subtract(3,11),DELTA);
        assertNotEquals("Subtracting two doubles for false positive",10,calculator.subtract(100.3,2.6),DELTA);
    }

    @Test
    public void multiplyingTruePositive(){
        assertEquals("Multiplying two integers for true positive",40,calculator.multiply(5,8),DELTA);
        assertEquals("Multiplying two doubles for true positive",6.6,calculator.multiply(3.3,2.0),DELTA);
    }

    @Test
    public void multiplyingFalsePositive(){
        assertNotEquals("Multiplying two integers for false positive",500,calculator.multiply(2,8),DELTA);
        assertNotEquals("Multiplying two doubles for false positive",1000.5,calculator.multiply(10.3,5.6),DELTA);
    }

    @Test
    public void dividingTruePositive(){
        assertEquals("Dividing two integers for true positive",2,calculator.divide(8,4),DELTA);
        assertEquals("Dividing two doubles for true positive",10.1,calculator.divide(50.5,5),DELTA);
    }

    @Test
    public void dividingFalsePositive(){
        assertNotEquals("Dividing two integers for false positive",20,calculator.multiply(34,7),DELTA);
        assertNotEquals("Dividing two doubles for false positive",250.1,calculator.multiply(2,5.65),DELTA);
    }
}
