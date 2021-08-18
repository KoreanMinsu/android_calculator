package com.javaex.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //field
    private EditText edtText;
    private Button btn[] = new Button[16];
    private int i = 0;
    /*
    private Button btn_add;
    private Button btn_sub;
    private Button btn_mul;
    private Button btn_div;
    private Button btn_clear;
    private Button btn_result;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("study_calc", "클릭이벤트 작동");

                //메소드 생성 보기 쉽게 구분
                init();
                initListener();

                /*
                switch(view.getId()) {
                    case R.id.btn1:
                        Log.d("calc", "1");
                        edtText.setText(edtText.getText().toString() + 1);
                        break;
                    case R.id.btn2:
                        Log.d("calc", "2");
                        edtText.setText(edtText.getText().toString() + 2);
                        break;
                    case R.id.btn3:
                        Log.d("calc", "3");
                        edtText.setText(edtText.getText().toString() + 3);
                        break;
                    case R.id.btn4:
                        Log.d("calc", "4");
                        edtText.setText(edtText.getText().toString() + 4);
                        break;
                    case R.id.btn5:
                        Log.d("calc", "5");
                        edtText.setText(edtText.getText().toString() + 5);
                        break;
                    case R.id.btn6:
                        Log.d("calc", "6");
                        edtText.setText(edtText.getText().toString() + 6);
                        break;
                    case R.id.btn7:
                        Log.d("calc", "7");
                        edtText.setText(edtText.getText().toString() + 7);
                        break;
                    case R.id.btn8:
                        Log.d("calc", "8");
                        edtText.setText(edtText.getText().toString() + 8);
                        break;
                    case R.id.btn9:
                        Log.d("calc", "9");
                        edtText.setText(edtText.getText().toString() + 9);
                        break;
                    case R.id.btn0:
                        Log.d("calc", "0");
                        edtText.setText(edtText.getText().toString() + 0);
                        break;
                    case R.id.btn_add:
                        Log.d("calc", "+");
                        edtText.setText(edtText.getText().toString() + " + ");
                        break;
                    case R.id.btn_sub:
                        Log.d("calc", "-");
                        edtText.setText(edtText.getText().toString() + " - ");
                        break;
                    case R.id.btn_div:
                        Log.d("calc", "/");
                        edtText.setText(edtText.getText().toString() + " / ");
                        break;
                    case R.id.btn_mul:
                        Log.d("calc", " *: ");
                        edtText.setText(edtText.getText().toString() + " * ");
                        break;
                    case R.id.btn_clear:r:
                        Log.d("calc", "CE: ");
                        edtText.setText("");
                        break;
                    case R.id.btn_result:
                        Log.d("calc", "=: ");

                        String result = edtText.getText().toString();

                        String[] resultArr = result.split(" ");
                        Log.d("calc", "" + resultArr[1]);
                        String sign = resultArr[1];
                        int no1 = Integer.parseInt(resultArr[0]);
                        int no2 = Integer.parseInt(resultArr[2]);
                        if (sign.equals("+")) {
                            edtText.setText(Integer.toString(no1+no2));
                        }else if (sign.equals("-")) {
                            edtText.setText(Integer.toString(no1-no2));
                        }else if (sign.equals("/")) {
                            edtText.setText(Double.toString(no1/no2));
                        }else if (sign.equals("*")){
                            edtText.setText(Integer.toString(no1*no2));
                        }
                        break;
                }
                */
            }
        };



    }
    public void init() {
        btn[0] = (Button) findViewById(R.id.btn0);
        btn[1] = (Button) findViewById(R.id.btn1);
        btn[2] = (Button) findViewById(R.id.btn2);
        btn[3] = (Button) findViewById(R.id.btn3);
        btn[4] = (Button) findViewById(R.id.btn4);
        btn[5] = (Button) findViewById(R.id.btn5);
        btn[6] = (Button) findViewById(R.id.btn6);
        btn[7] = (Button) findViewById(R.id.btn7);
        btn[8] = (Button) findViewById(R.id.btn8);
        btn[9] = (Button) findViewById(R.id.btn9);
        btn[10] = (Button) findViewById(R.id.btn_add);
        btn[11] = (Button) findViewById(R.id.btn_sub);
        btn[12] = (Button) findViewById(R.id.btn_mul);
        btn[13] = (Button) findViewById(R.id.btn_div);
        btn[14] = (Button) findViewById(R.id.btn_clear);
        btn[15] = (Button) findViewById(R.id.btn_result);
        edtText = (EditText)findViewById(R.id.et_result);
    }
    public void initListener(){
        for (int i= 0; i< 14; i++) {
            btn[i].setOnClickListener((View view)-> {
                Button btn = (Button) view;
                edtText.append(btn.getText().toString());
            });
        }
        btn[14].setOnClickListener((View view)-> {
            edtText.setText("");
        });
        btn[15].setOnClickListener((View view)-> {
            String result=edtText.getText().toString();
            edtText.setText(Eval.cal(result));
        });


    }
}