package com.blovvme.testing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    public static final String KEY_RESULT = "KEY_FOR_RESULT";
    @BindView(R.id.etNumber1)
    EditText etNumber1;
    @BindView(R.id.etNumber2)
    EditText etNumber2;
    @BindView(R.id.btnAddition)
    Button btnAddition;
    @BindView(R.id.btnSubtraction)
    Button btnSubtraction;
    @BindView(R.id.btnMultiplication)
    Button btnMultiplication;
    @BindView(R.id.btnDivide)
    Button btnDivide;
    @BindView(R.id.tvResult)
    TextView tvResult;
    @BindView(R.id.etResult)
    EditText etResult;

    Addition addition;
    Subtraction subtraction;
    Multiplication multiplication;
    Division division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnAddition, R.id.btnSubtraction, R.id.btnMultiplication, R.id.btnDivide})
    public void doCalculations(View view) {

        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();

        int number1  = Integer.parseInt(etNumber1.getText().toString());
        int number2 = Integer.parseInt(etNumber2.getText().toString());
        int result = 0;
        Calculation calculation = new Calculation(addition,subtraction,multiplication,division);
        calculation.setVal1(number1);
        calculation.setVal2(number2);

        switch (view.getId()) {
            case R.id.btnAddition:
                result = calculation.addition();
                tvResult.setText(String.valueOf(result));
                break;
            case R.id.btnSubtraction:
                result = calculation.subtraction();
                tvResult.setText(String.valueOf(result));
                break;
            case R.id.btnMultiplication:
                result = calculation.multiplication();
                tvResult.setText(String.valueOf(result));
                break;
            case R.id.btnDivide:
                result = calculation.division();
                tvResult.setText(String.valueOf(result));
                break;
        }
    }


    public void gotoSecond(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        getIntent().putExtra(KEY_RESULT,tvResult.getText().toString());
        startActivity(intent);

    }
}
