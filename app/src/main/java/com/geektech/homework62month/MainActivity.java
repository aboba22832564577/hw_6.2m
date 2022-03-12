package com.geektech.homework62month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView text;
private Button button;
private EditText editText1;
private EditText editText2;
private TextView text1;
private TextView text2;
private TextView text3;
private TextView text4;
private Color orange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        button = findViewById(R.id.bottom1);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals("Admin")  && editText2.getText().toString().equals("Admin")) {
                    button.setVisibility(View.GONE);
                    text.setVisibility(View.GONE);
                    editText1.setVisibility(View.GONE);
                    editText2.setVisibility(View.GONE);
                    text1.setVisibility(View.GONE);
                    text2.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильный логин или пароль!", Toast.LENGTH_LONG).show();
                }
            }
        });

        editText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.length() > 0 || editText2.length() > 0){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.seriy));
                }
            }
        });
    }
}