package com.example.a10305_1.beem24_1;

import android.content.Intent;
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
    private String Beem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    Beem = editText.getText().toString().trim();

                    if (Beem.equals("")){
                        Log.d("Thanakrit", "Have space in blank");
                    } else {
                        Log.d("Thanankrit", "No spce = " +Beem);

                    }
                } catch (Exception e){

                }
            }
        });

    }
}
