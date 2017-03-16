package com.ma.mj.hw2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1, b2;
    TextView t1,t2;
    Drawable d1,d2,d3,d4,d5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Switch s1;
        Chronometer c1;
        DatePicker date;
        TimePicker time;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parctice);
        init();
    }

    void init(){
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        e3 = (EditText)findViewById(R.id.editText3);
        b1 = (Button) findViewById(R.id.button9);
        b2 = (Button) findViewById(R.id.button10);
        t1 = (TextView) findViewById(R.id.textView6);
        t2 = (TextView) findViewById(R.id.textView8);
        d1 = (Drawable) findViewById(R.id.);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String korean = e1.getText().toString();
                String mathmatics = e2.getText().toString();
                String english = e3.getText().toString();

                if (korean.getBytes().length == 0){
                    e1.setText("0");
                    korean = e1.getText().toString();
                }
                if (mathmatics.getBytes().length == 0){
                    e2.setText("0");
                    mathmatics = e2.getText().toString();
                }
                if (english.getBytes().length == 0){
                    e3.setText("0");
                    english = e3.getText().toString();
                }

                int total = Integer.parseInt(korean) + Integer.parseInt(mathmatics) + Integer.parseInt(english);
                int average = total / 3;

                t1.setText(Integer.toString(total)+"점");
                t2.setText(Integer.toString(average)+"점");

                if (average >= 90){
                    d1.setVisible()
                }
                else {

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                e1.setText("");
                e2.setText("");
                e3.setText("");
                t1.setText("0점");
                t2.setText("0점");

                Toast.makeText(getApplicationContext(),"초기화 되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }

}