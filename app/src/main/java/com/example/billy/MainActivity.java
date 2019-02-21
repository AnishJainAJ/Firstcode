package com.example.billy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  Button Submit;
    private EditText Name;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.textView);
        Password = findViewById(R.id.textView4);
        Submit = findViewById(R.id.button);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitbtn(Name.getText().toString(),Password.getText().toString());
            }
        });
    }

    public void submitbtn(String userName,String userPassword) {
        if((userName.equals("abc") && userPassword.equals("123"))) {
            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        }
        if((userName.equals("abcd") && userPassword.equals("1234"))) {
            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        }
        if((userName.equals("abcde") && userPassword.equals("12345"))) {
            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    } }
