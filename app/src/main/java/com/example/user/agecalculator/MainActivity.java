package com.example.user.agecalculator;

import android.content.Intent;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText showAge;
private Button Calcage;
private String age;
private ConstraintLayout constraintLayout;
private Rainbow rainbow=new Rainbow();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout=(ConstraintLayout)findViewById(R.id.constraint1);
        showAge=(EditText)findViewById(R.id.showAge);
        Calcage=(Button)findViewById(R.id.Calcage);


        changecolor();
        sendIntent();
    }
    public void changecolor() {
        showAge.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int color = rainbow.getcolour();
                constraintLayout.setBackgroundColor(color);

                return true;
            }
        });

    }


    public void sendIntent()
    {
        Calcage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age=showAge.getText().toString();
                if (age.isEmpty()||age==null)
                {
                    Toast.makeText(MainActivity.this,"Please enter age",Toast.LENGTH_SHORT).show();
                }
                else
                {
                   Toast.makeText(MainActivity.this,age+"",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    Resources resources=getResources();
                    String Age=resources.getString(R.string.age);
                    intent.putExtra(Age,age);
                    startActivity(intent);


                }
             }
        });
    }

}
