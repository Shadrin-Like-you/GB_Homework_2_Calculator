package com.shadrin_like_you.gb_homework_2_calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_one;
    private Button button_two;
    private Button button_three;
    private Button button_four;
    private Button button_five;
    private Button button_six;
    private Button button_seven;
    private Button button_eight;
    private Button button_nine;
    private Button btn_1; //,
    private Button btn_0; //0
    private Button button6; //"/"
    private Button button3; //*
    private Button button4; //+
    private Button button5; //=
    private Button btn_minus; //-
    private Button btn_clear;
    private TextView operation, number1, number2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);
        //Получаем значение по вводу

        //TextView resultView = findViewById(R.id.resultView);

        //прописываем кнопки

        Button button_one = findViewById(R.id.key_one);
        Button button_two = findViewById(R.id.key_two);
        Button button_three = findViewById(R.id.key_three);
        Button button_four = findViewById(R.id.key_four);
        Button button_five = findViewById(R.id.key_five);
        Button button_six = findViewById(R.id.key_six);
        Button button_seven = findViewById(R.id.key_seven);
        Button button_eight = findViewById(R.id.key_eight);
        Button button_nine = findViewById(R.id.key_nine);
       /* Button btn_1 = findViewById(R.id.btn_1);
        Button btn_0 = findViewById(R.id.btn_0);
        Button button6 = findViewById(R.id.button6);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button btn_minus = findViewById(R.id.btn_minus);
        Button btn_clear = findViewById(R.id.btn_clear);
*/
        //прописываем нажатие по кнопкам (можно объединить с верхней записью,
        // расписал чисто для себя)

        button_one.setOnClickListener(this);
        button_two.setOnClickListener(this);
        button_three.setOnClickListener(this);
        button_four.setOnClickListener(this);
        button_five.setOnClickListener(this);
        button_six.setOnClickListener(this);
        button_seven.setOnClickListener(this);
        button_eight.setOnClickListener(this);
        button_nine.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        button6.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view) {
        float num1=0;
        float num2=0;
        float res=0;

        //Для перевода данных в строки


        num1=Float.parseFloat(number1.getText().toString());
        num2=Float.parseFloat(number2.getText().toString());

       /* switch (view.getId()) {

            case R.id.button4:
                operation.setText("+");
                res=num1+num2;
                break;

            case R.id.btn_minus:
                operation.setText("-");
                res=num1-num2;
                break;

            case R.id.button6:
                operation.setText("/");
                res=num1/num2;
                break;

            case R.id.button3:
                operation.setText("*");
                res=num1*num2;
                break;

            case R.id.btn_clear:
                number1.setText("");
                operation.setText("");
                number2.setText("");
                result.setText("");
                break;
            default:
                break;
        }
            result.setText(res+"");*/
    }
}

