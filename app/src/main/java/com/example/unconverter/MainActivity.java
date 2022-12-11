package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private Button button;
    private TextView textview;
    private EditText  editText;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview=findViewById(R.id.textView3);
        editText=findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
////                Toast.makeText(MainActivity.this, "Hi clickListener worked", Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
//
//                String s= editText.getText().toString();
//                double kg=Double. parseDouble(s);
//                double pound=2.205*kg;
//                textview.setText("The corresponding value in pounds is"+pound);
//
//
//            }
//        });
    }

    public void calculate(View view){

        String s= editText.getText().toString();
        double kg=Double. parseDouble(s);
        double pound=2.205*kg;
        textview.setText("The corresponding value in pounds is"+pound);



    }
}