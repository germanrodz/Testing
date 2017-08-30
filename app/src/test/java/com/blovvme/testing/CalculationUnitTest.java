package com.blovvme.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.when;

/**
 * Created by Blovvme on 8/29/17.
 */

public class CalculationUnitTest {

    Calculation calculation;;
    Addition addition;
    Subtraction subtraction;
    Multiplication multiplication;
    Division division;

    @Before
    public void Setup(){

        addition = mock(Addition.class);
        subtraction= mock(Subtraction.class);
        multiplication = mock(Multiplication.class);
        division = mock(Division.class);
        calculation = new Calculation(addition,subtraction,multiplication,division);
        calculation.setVal1(9);
        calculation.setVal2(9);
    }

    @Test
    public void testing_addition_should_add_two_numbers(){
        //assertEquals(calculation.addition(),18);
        when(addition.add(9,9)).thenReturn(20);
        assertEquals(calculation.addition(),20);
    }
    @Test
    public void testing_subtraction_two_numbers(){
        when(subtraction.subtraction(9,9)).thenReturn(5);
        assertEquals(calculation.subtraction(),15);
    }
    @Test
    public void testing_multiplication_two_numbers(){
        assertEquals(calculation.multiplication(),18);
    }
    @Test
    public void testing_division_two_numbers(){
        assertEquals(calculation.division(),18);
    }

    @After
    public void tearDown(){
        calculation.clear();
    }



}
