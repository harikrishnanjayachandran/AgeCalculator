package com.example.user.agecalculator;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
private String Age;
private int month;
private int days;
private int Minutes;
private int age;
private int hours;
private TextView showtext;
private ConstraintLayout constraintLayout;
    private Rainbow rainbow=new Rainbow();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        Age=intent.getStringExtra(getString(R.string.age));
        age=Integer.parseInt(Age);
        showtext=(TextView)findViewById(R.id.showtext);
        constraintLayout=(ConstraintLayout)findViewById(R.id.constraintlayout1);
        changecolor();
        Convertage();
    }
    private void Convertage()
    {
     month=age*12;
     days=age*365;
     hours=days*24;
     Minutes= hours*60;
     String s=   "You lived"+age+"years," +
                ""+month+"months,"+days+"days,"
                +hours+"hours,and"+Minutes+
                "minutes";
        showtext.setText(s);
    }
    private void changecolor()
    {
        showtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color=rainbow.getcolour();
                constraintLayout.setBackgroundColor(color);
            }
        });

    }


}
