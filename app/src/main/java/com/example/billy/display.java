package com.example.billy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class display extends AppCompatActivity {

    TextView countTV;
    TextView countTV1;
    TextView countTV2;
    TextView countTV3;
    TextView countTV4;
    int count = 0,count1 = 0,count2 = 0,count3 = 0,total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        countTV = findViewById(R.id.count1);
        countTV1 = findViewById(R.id.count2);
        countTV2 = findViewById(R.id.count3);
        countTV3 = findViewById(R.id.count4);
        countTV4 = findViewById(R.id.total1);

    }
    public void upBtnClicked(View view) {
        if (count < 5) {
            count++;
            countTV.setText("" + count);
        } else {
            Toast.makeText(this, "Max", Toast.LENGTH_SHORT).show();
        }
    }



    public void downBtnClicked(View view) {
        if (count > 0) {
            count--;
            countTV.setText("" + count);
        } else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }

    public void upBtnClicked1(View view) {
        if (count1 < 5) {
            count1++;
            countTV1.setText("" + count1);
        } else {
            Toast.makeText(this, "Max", Toast.LENGTH_SHORT).show();
        }
    }


    public void downBtnClicked1(View view) {
        if (count1 > 0) {
        count1--;
        countTV1.setText(""+count1);
    }
        else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }

    public void upBtnClicked2(View view) {
        if (count2 < 5) {
        count2++;
        countTV2.setText(""+count2);
    }
        else {
            Toast.makeText(this, "Max", Toast.LENGTH_SHORT).show();
        }
    }

    public void downBtnClicked2(View view) {
        if (count2 > 0) {
        count2--;
        countTV2.setText(""+count2);
    }
        else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }


    public void upBtnClicked3(View view) {
        if (count2 < 5) {
        count3++;
        countTV3.setText(""+count3);
    }
        else {
            Toast.makeText(this, "Max", Toast.LENGTH_SHORT).show();
        }
    }

    public void downBtnClicked3(View view) {
        if (count3 > 0) {
        count3--;
        countTV3.setText(""+count3);
    }
        else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }

    public void dislay(View view) {
        Intent i = new  Intent(display.this, MainActivity.class);
        startActivity(i);
    }
    public void totalBtnClicked4(View view) {
       total=((count*300)+(count1*1000)+(count2*800)+(count3*1200));
       countTV4.setText(""+total);
    }

}
