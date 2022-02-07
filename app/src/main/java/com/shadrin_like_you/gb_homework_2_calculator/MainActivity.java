package com.shadrin_like_you.gb_homework_2_calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView txt;
    double number1 = 0;
    double number2 = 0;
    double result = 0;
    int op = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);
        //Получаем значение по вводу
        txt = (TextView) findViewById(R.id.textView);
        //C
        Button btn_clear = (Button) findViewById(R.id.btn_clear);

        //прописываем кнопки + прописываем нажатие по кнопкам

        Button buttonOne = (Button) findViewById(R.id.key_one);
        Button buttonTwo = (Button) findViewById(R.id.key_two);
        Button buttonThree = (Button) findViewById(R.id.key_three);
        Button buttonFour = (Button) findViewById(R.id.key_four);
        Button buttonFive = (Button) findViewById(R.id.key_five);
        Button buttonSix = (Button) findViewById(R.id.key_six);
        Button buttonSeven = (Button) findViewById(R.id.key_seven);
        Button buttonEight = (Button) findViewById(R.id.key_eight);
        Button buttonNine = (Button) findViewById(R.id.key_nine);
        //,
        Button btnDot = (Button) findViewById(R.id.key_dot);
        //*
        Button buttonMult = (Button) findViewById(R.id.key_mult);
        //+
        Button buttonAdd = (Button) findViewById(R.id.key_add);
        //"/"
        Button buttonDiv = (Button) findViewById(R.id.key_div);
        //-
        Button btnSub = (Button) findViewById(R.id.key_sub);
        //=
        Button buttonRes = (Button) findViewById(R.id.btn_res);
        //0
        Button btnZero = (Button) findViewById(R.id.key_zero);


        buttonOne.setOnClickListener(new calcClick());
        buttonTwo.setOnClickListener(new calcClick());
        buttonThree.setOnClickListener(new calcClick());
        buttonFour.setOnClickListener(new calcClick());
        buttonFive.setOnClickListener(new calcClick());
        buttonSix.setOnClickListener(new calcClick());
        buttonSeven.setOnClickListener(new calcClick());
        buttonEight.setOnClickListener(new calcClick());
        buttonNine.setOnClickListener(new calcClick());
        btnDot.setOnClickListener(new calcClick());
        buttonMult.setOnClickListener(new calcClick());
        buttonAdd.setOnClickListener(new calcClick());
        buttonDiv.setOnClickListener(new calcClick());
        btnSub.setOnClickListener(new calcClick());
        buttonRes.setOnClickListener(new calcClick());
        btnZero.setOnClickListener(new calcClick());
        btn_clear.setOnClickListener(new calcClick());

    }


    class calcClick implements View.OnClickListener {


        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_clear:
                    txt.setText(null);
                    break;

                //Получаем ввод с кнопок на keyboard (или экрана дизайна кнопок)
                case R.id.key_one:
                    String str1 = txt.getText().toString();
                    str1 += "1";
                    txt.setText(str1);
                    break;

                case R.id.key_two:
                    String str2 = txt.getText().toString();
                    str2 += "2";
                    txt.setText(str2);
                    break;

                case R.id.key_three:
                    String str3 = txt.getText().toString();
                    str3 += "3";
                    txt.setText(str3);
                    break;

                case R.id.key_four:
                    String str4 = txt.getText().toString();
                    str4 += "4";
                    txt.setText(str4);
                    break;

                case R.id.key_five:
                    String str5 = txt.getText().toString();
                    str5 += "5";
                    txt.setText(str5);
                    break;

                case R.id.key_six:
                    String str6 = txt.getText().toString();
                    str6 += "6";
                    txt.setText(str6);
                    break;

                case R.id.key_seven:
                    String str7 = txt.getText().toString();
                    str7 += "7";
                    txt.setText(str7);
                    break;

                case R.id.key_eight:
                    String str8 = txt.getText().toString();
                    str8 += "8";
                    txt.setText(str8);
                    break;

                case R.id.key_nine:
                    String str9 = txt.getText().toString();
                    str9 += "9";
                    txt.setText(str9);
                    break;

                case R.id.key_zero:
                    String str0 = txt.getText().toString();
                    str0 += "0";
                    txt.setText(str0);
                    break;

                case R.id.key_dot:
                    String strdot = txt.getText().toString();
                    strdot += ".";
                    txt.setText(strdot);
                    break;

                //Операторы

                case R.id.key_add:
                    String stradd = txt.getText().toString();
                    if (stradd.equals(null)) {
                        return;
                    }
                    number1 = Double.parseDouble(stradd);
                    txt.setText(null);
                    op = 1;
                    break;

                case R.id.key_sub:
                    String strsub = txt.getText().toString();
                    if (strsub.equals(null)) {
                        return;
                    }
                    number1 = Double.parseDouble(strsub);
                    txt.setText(null);
                    op = 2;
                    break;

                case R.id.key_mult:
                    String strmult = txt.getText().toString();
                    if (strmult.equals(null)) {
                        return;
                    }
                    number1 = Double.parseDouble(strmult);
                    txt.setText(null);
                    op = 3;
                    break;

                case R.id.key_div:
                    String strdiv = txt.getText().toString();
                    if (strdiv.equals(null)) {
                        return;
                    }
                    number1 = Double.parseDouble(strdiv);
                    txt.setText(null);
                    op = 4;
                    break;

                case R.id.btn_res:
                    String strres = txt.getText().toString();
                    number2 = Double.parseDouble(strres);
                    txt.setText(null);

                    switch (op) {
                        case 1:
                            result = number1 + number2;
                            txt.setText(new String(number1 + "+" + number2 + "=" + result));
                            break;

                        case 2:
                            result = number1 - number2;
                            txt.setText(new String(number1 + "-" + number2 + "=" + result));
                            break;

                        case 3:
                            result = number1 * number2;
                            txt.setText(new String(number1 + "*" + number2 + "=" + result));
                            break;

                        case 4:
                            if (number2 == 0) {
                                txt.setText("Товарищь! Ты делишь на 0!");
                            } else {
                                result = number1 / number2;
                                txt.setText(new String(number1 + "/" + number2 + "=" + result));
                            }
                            break;
                        default:
                            result = 0;
                            break;

                    }
            }

        }

    }
}

