package com.example.speedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculate_button = findViewById(R.id.calculate);
        Button clear_button = findViewById(R.id.clear);
        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_error1 = getString(R.string.error1);
                String str_error2 = getString(R.string.error2);
                EditText distance_text= findViewById(R.id.enter_distance);
                EditText time_text= findViewById(R.id.enter_time);
                String time = time_text.getText().toString();
                String distance = distance_text.getText().toString();

                String msg = "";
                if(distance.isEmpty()||time.isEmpty()){
                    msg = str_error1;
                    Toast t = Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG);
                    t.show();
                }else if(distance.length()!=0&&time.equals("0")){
                    msg = str_error2;
                    Toast t = Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG);
                    t.show();
                }else if(distance.length()!=0&&time.length()!=0){

                }
            }
        });
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}