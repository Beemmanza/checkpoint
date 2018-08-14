package com.example.a10305_1.beem24_1;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private RadioGroup radioGroup;
    private String Beem, strTem = "Celsius", strAnswer;
    private MyAlertDialog myAlertDialog;
    private double douAnswer;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Beem = editText.getText().toString().trim();
                    if (Beem.equals("")) {
                        Log.d("Thanakrit", "Have space in blank ");
                        myAlertDialog = new MyAlertDialog();
                        myAlertDialog.HavespaceDialog(MainActivity.this);

                    } else {
                        if (strTem=="Celsius") {
                            calculateAnswer();
                            Log.d("Thanakrit1", "No space =" + Beem);
                            Log.d("Thanakrit2", "Unit = " + strTem);
                            Log.d("Thanakrit3", "Answer = " + strAnswer);

                            myAlertDialog = new MyAlertDialog();
                            myAlertDialog.ShowAnwer(MainActivity.this,Beem,strTem,strAnswer);

                            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                            intent.putExtra("Temperature",Beem);
                            intent.putExtra("Unit", strTem);
                            intent.putExtra("Answer", strAnswer);
                            startActivity(intent);
                        }
                        else if (strTem=="Fahrenheit") {
                            calculateAnswer1();
                            Log.d("Thanakrit1", "No space =" + Beem);
                            Log.d("Thanakrit2", "Unit = " + strTem);
                            Log.d("Thanakrit3", "Answer = " + strAnswer);

                            myAlertDialog = new MyAlertDialog();
                            myAlertDialog.Showfar(MainActivity.this,Beem,strTem,strAnswer);

                            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                            intent.putExtra("Temperature", Beem);
                            intent.putExtra("Unit", strTem);
                            intent.putExtra("Answer", strAnswer);
                            startActivity(intent);
                        }
                        else if (strTem=="Kelvin") {
                            calculateAnswer2();
                            Log.d("Thanakrit1", "No space =" + Beem);
                            Log.d("Thanakrit2", "Unit = " + strTem);
                            Log.d("Thanakrit3", "Answer = " + strAnswer);

                            myAlertDialog = new MyAlertDialog();
                            myAlertDialog.Showka(MainActivity.this,Beem,strTem,strAnswer);

                            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                            intent.putExtra("Temperature", Beem);
                            intent.putExtra("Unit", strTem);
                            intent.putExtra("Answer", strAnswer);
                            startActivity(intent);
                        }
                    }

                } catch (Exception e) {}
                //ทำการลิ้งไปอีกเพจ Intent to ResultActivity
                //   Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                //   startActivity(intent);

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radioButton4:
                        strTem = "Celsius";
                        break;
                    case R.id.radioButton5:
                        strTem = "Fahrenheit";
                        break;
                    case R.id.radioButton6:
                        strTem = "Kelvin";
                        break;

                }
            }
            });
    }

        private void calculateAnswer() {
            douAnswer = Double.parseDouble(Beem);
            strAnswer = Double.toString(douAnswer);
        }//end of calculateAnswer

        private void calculateAnswer1() {
            douAnswer = Double.parseDouble(Beem)*1.8+32;
            strAnswer = Double.toString(douAnswer);
        }//end of calculateAnswer
        private void calculateAnswer2() {
            douAnswer = Double.parseDouble(Beem)+273.15;
            strAnswer = Double.toString(douAnswer);
        }//end of calculateAnswer
}


