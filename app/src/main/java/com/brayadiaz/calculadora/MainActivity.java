package com.brayadiaz.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button N1, N2, N3, N4, N5, N6, N7, N8, N9, N0, NSum, NRes, NMul, NDiv, NPun, NIgual;
    private TextView resultado, acomulado;
    private String ope = "", aux = "";
    private float acom = 0, ope1 = 0 , resul = 0 , ope2 = 0;
    private int flag = 0, flag1 = 0, flag2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        N1 = (Button) findViewById(R.id.b1);
        N2 = (Button) findViewById(R.id.b2);
        N3 = (Button) findViewById(R.id.b3);
        N4 = (Button) findViewById(R.id.b4);
        N5 = (Button) findViewById(R.id.b5);
        N6 = (Button) findViewById(R.id.b6);
        N7 = (Button) findViewById(R.id.b7);
        N8 = (Button) findViewById(R.id.b8);
        N9 = (Button) findViewById(R.id.b9);
        N0 = (Button) findViewById(R.id.b0);
        NSum = (Button) findViewById(R.id.bSum);
        NRes = (Button) findViewById(R.id.bRes);
        NMul = (Button) findViewById(R.id.bMul);
        NDiv = (Button) findViewById(R.id.bDiv);
        NPun = (Button) findViewById(R.id.bPun);
        NIgual = (Button) findViewById(R.id.bIgual);
        resultado = (TextView) findViewById(R.id.resul);
        acomulado = (TextView) findViewById(R.id.acomulado);

    }

    public void N1(View view) {
        ope += "1";
        aux += "1";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N2(View view) {
        ope += "2";
        aux += "2";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N3(View view) {
        ope += "3";
        aux += "3";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N4(View view) {
        ope += "4";
        aux += "4";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N5(View view) {
        ope += "5";
        aux += "5";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N6(View view) {
        ope += "6";
        aux += "6";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N7(View view) {
        ope += "7";
        aux += "7";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N8(View view) {
        ope += "8";
        aux += "8";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N9(View view) {
        ope += "9";
        aux += "9";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void N0(View view) {
        ope += "0";
        aux += "0";
        if(flag == 5){
            flag = 0;
        }
        resultado.setText(ope);
    }

    public void NSum(View view) {
        /*if (flag1 == 5) {
            flag = 1;
            flag1 = 1;
            NIgual.callOnClick();
        } else*/ if(flag == 5){
            ope1 = resul;
            ope = String.valueOf(resul);
            ope += " + ";
            resultado.setText(ope);
            flag = 1;
            flag1 = 5;
        } else {
            flag = 1;
            flag1 = 5;
            flag2 = 1;
            ope += " + ";
            ope1 = Float.parseFloat(aux);
            resultado.setText(ope);
            aux = "";
        }
    }

    public void NRes(View view) {
        /*if(flag1 == 5){
            flag1 = 2;
            flag = 2;
            NIgual.callOnClick();
        } else*/ if(flag == 5){
            ope1 = resul;
            ope = String.valueOf(resul);
            ope += " - ";
            resultado.setText(ope);
            flag = 2;
            flag1 = 5;
        } else{
            flag = 2;
            flag1 = 5;
            flag2 = 2;
            ope += " - ";
            ope1 = Float.parseFloat(aux);
            resultado.setText(ope);
            aux = "";
        }
    }

    public void NMul(View view) {
        /*if(flag1 == 1) {
            flag1 = 3;
            flag = 3;
            NIgual.callOnClick();
        } else*/ if(flag == 5){
            ope1 = resul;
            ope = String.valueOf(resul);
            ope += " * ";
            resultado.setText(ope);
            flag = 3;
            flag1 = 5;
        } else {
            flag = 3;
            flag1 = 5;
            flag2 = 3;
            ope += " * ";
            ope1 = Float.parseFloat(aux);
            resultado.setText(ope);
            aux = "";
            resultado.setText(ope);
        }
    }

    public void NDiv(View view) {
        /*if (flag1 == 1) {
            flag1 = 4;
            flag = 4;
            NIgual.callOnClick();
        } else*/ if (flag == 5) {
            ope1 = resul;
            ope = String.valueOf(resul);
            ope += " / ";
            resultado.setText(ope);
            flag = 4;
            flag1 = 5;
        } else {
            flag = 4;
            flag1 = 5;
            flag2 = 4;
            ope += " / ";
            ope1 = Float.parseFloat(aux);
            resultado.setText(ope);
            aux = "";
            resultado.setText(ope);
        }
    }

    public void NPun(View view) {
        ope += ".";
        aux += ".";
        resultado.setText(ope);
    }

    public void NIgual(View view) {

        switch (flag){
            case 1 :
                ope2 = Float.parseFloat(aux);
                resul = ope1 + ope2;
                acomulado.setText(String.valueOf(resul));
                ope = "";
                aux = "";
                flag = 5;

                /*if (flag2 == 1) {
                    NSum.callOnClick();

                }else if (flag2 == 2){
                    NRes.callOnClick();

                }else if (flag2 == 3){
                    NMul.callOnClick();

                }else if (flag2 == 4){
                    NDiv.callOnClick();

                }

                flag2 = 1;
                flag1 = 0;*/
                break;
            case 2 :
                ope2 = Float.parseFloat(aux);
                resul = ope1 - ope2;
                acomulado.setText(String.valueOf(resul));
                ope = "";
                aux = "";
                flag = 5;
                /*if (flag2 == 1) {
                    flag = 5;
                    flag1 = 0;
                    NSum.callOnClick();

                }else if (flag2 == 2){
                    flag = 5;
                    flag1 = 0;
                    NRes.callOnClick();
                }else if (flag2 == 3){
                    flag = 5;
                    flag1 = 0;
                    NMul.callOnClick();
                }else if (flag2 == 4){
                    flag = 5;
                    flag1 = 0;
                    NDiv.callOnClick();
                }*/
                break;
            case 3 :
                ope2 = Float.parseFloat(aux);
                resul = ope1 * ope2;
                acomulado.setText(String.valueOf(resul));
                ope = "";
                aux = "";
                flag = 5;
                /*if (flag2 == 1) {
                    flag = 5;
                    flag1 = 0;
                    NSum.callOnClick();

                }else if (flag2 == 2){
                    flag = 5;
                    flag1 = 0;
                    NRes.callOnClick();
                }else if (flag2 == 3){
                    flag = 5;
                    flag1 = 0;
                    NMul.callOnClick();
                }else if (flag2 == 4){
                    flag = 5;
                    flag1 = 0;
                    NDiv.callOnClick();
                }*/
                break;
            case 4 :
                ope2 = Float.parseFloat(aux);
                resul = ope1 / ope2;
                acomulado.setText(String.valueOf(resul));
                ope = "";
                aux = "";
                flag = 5;
                /*if (flag2 == 1) {
                    flag = 5;
                    flag1 = 0;
                    NSum.callOnClick();

                }else if (flag2 == 2){
                    flag = 5;
                    flag1 = 0;
                    NRes.callOnClick();
                }else if (flag2 == 3){
                    flag = 5;
                    flag1 = 0;
                    NMul.callOnClick();
                }else if (flag2 == 4){
                    flag = 5;
                    flag1 = 0;
                    NDiv.callOnClick();
                }*/
                break;

        }

        //resultado.setText(ope);
    }




}
