package com.blovvme.testing;

import android.Manifest;

/**
 * Created by Blovvme on 8/29/17.
 */

public class Calculation  {
    int val1,val2;


    Addition addition;
    Subtraction subtraction;
    Multiplication multiplication;
    Division division;

    public Calculation(Addition addition,Subtraction subtraction, Multiplication multiplication,Division division){
        this.addition =addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }

//    public Calculation(int val1, int val2){
//        this.val1 = val1;
//        this.val2 = val2;
//    }

    public void setVal1(int val1){
       this.val1 = val1;
    }

    public void setVal2(int val2){
        this.val2 = val2;
    }


    public int addition(){
        return  addition.add(val1,val2) + 5;
    }

    public int subtraction(){
        return  subtraction.subtraction(val1,val2) +10;
    }
    public int multiplication(){
        return multiplication.multiplication(val1,val2) +20;
    }
    public int division(){
        return division.divide(val1,val2) + 30;
    }

    public void clear(){
        val1 = 0;
        val2 = 0;
    }
}
