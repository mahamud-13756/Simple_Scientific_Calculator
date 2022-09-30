package com.example.simple_scientific_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView tr,ts;
MaterialButton b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9;
MaterialButton b_multiply, b_divide,b_plus,b_minus,b_equal,b_dot;
MaterialButton b_ac, b_del, b_exp, b_start_parenthesis, b_end_parenthesis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide action bar
        getSupportActionBar().hide();

        // Button connect id
        tr = findViewById(R.id.tv_result);
        ts = findViewById(R.id.tv_solution);


/*
        b_0 = findViewById(R.id.btn_0);
        b_1 = findViewById(R.id.btn_1);
        b_2 = findViewById(R.id.btn_2);
        b_3 = findViewById(R.id.btn_3);
        b_4 = findViewById(R.id.btn_4);
        b_5 = findViewById(R.id.btn_5);
        b_6 = findViewById(R.id.btn_6);
        b_7 = findViewById(R.id.btn_7);
        b_8 = findViewById(R.id.btn_8);
        b_9 = findViewById(R.id.btn_9);



        b_divide = findViewById(R.id.btn_divide);
        b_multiply = findViewById(R.id.btn_multiply);
        b_equal = findViewById(R.id.btn_equal);
        b_minus = findViewById(R.id.btn_minus);
        b_plus = findViewById(R.id.btn_plus);
        b_dot = findViewById(R.id.btn_dot);


        b_ac = findViewById(R.id.btn_all_clear);
        b_start_parenthesis = findViewById(R.id.btn_start_parenthesis);
        b_end_parenthesis = findViewById(R.id.btn_end_parenthesis);
*/
        assignId(b_0,R.id.btn_0);
        assignId(b_1,R.id.btn_1);
        assignId(b_2,R.id.btn_2);
        assignId(b_3,R.id.btn_3);
        assignId(b_4,R.id.btn_4);
        assignId(b_5,R.id.btn_5);
        assignId(b_6,R.id.btn_6);
        assignId(b_7,R.id.btn_7);
        assignId(b_8,R.id.btn_8);
        assignId(b_9,R.id.btn_9);
        assignId(b_dot,R.id.btn_dot);

        assignId(b_divide,R.id.btn_divide);
        assignId(b_multiply,R.id.btn_multiply);
        assignId(b_plus,R.id.btn_plus);
        assignId(b_minus,R.id.btn_minus);
        assignId(b_equal,R.id.btn_equal);
        assignId(b_ac,R.id.btn_all_clear);
        assignId(b_del,R.id.btn_delete);
        assignId(b_start_parenthesis,R.id.btn_start_parenthesis);
        assignId(b_end_parenthesis,R.id.btn_end_parenthesis);
        assignId(b_exp,R.id.btn_EXP);





    }


    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }
}