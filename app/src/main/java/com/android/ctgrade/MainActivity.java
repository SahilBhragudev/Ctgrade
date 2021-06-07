package com.android.ctgrade;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private TextView tv2;
    private EditText maths1;
    private EditText physics2;
    private EditText electrical2;
    private EditText ai2;
    private EditText softskills2;
    private EditText pps2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        tv2=findViewById(R.id.tv2);
        maths1=findViewById(R.id.maths1);
        physics2=findViewById(R.id.physics2);
        electrical2=findViewById(R.id.electrical2);
        ai2=findViewById(R.id.ai2);
        softskills2=findViewById(R.id.softskills2);
        pps2=findViewById(R.id.pps2);
        button1.setOnClickListener(new View.OnClickListener()  {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int m1,m2,m3,m4,m5,m6;
                float percentage;
                m1=Integer.parseInt(maths1.getText().toString());
                m2=Integer.parseInt(physics2.getText().toString());
                m3=Integer.parseInt(electrical2.getText().toString());
                m4=Integer.parseInt(ai2.getText().toString());
                m5=Integer.parseInt(softskills2.getText().toString());
                m6=Integer.parseInt(pps2.getText().toString());

                percentage=(float) (m1+m2+m3+m4+m5+m6)/6;
                tv2.setText("The obtained percentage in CT1 is "+percentage);

            }
        });
    }

}