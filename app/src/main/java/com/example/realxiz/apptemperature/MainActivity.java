package com.example.realxiz.apptemperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt1;
    private TextView tv3;
    private String scal1,scal2;
    private double cal1,cal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        edt1 = findViewById (R.id.edt1);
        tv3 = findViewById (R.id.tv3);

    }

    public void C2F(View view) {

        EditText edt1 = (EditText)findViewById (R.id.edt1);
        TextView tv3=(TextView)findViewById(R.id.tv3);
        String sedt1 = edt1.getText ().toString ();
        if (TextUtils.isEmpty (sedt1)) {
            edt1.setError ("Please Enter Number");
        } else {
            double cal1=Double.parseDouble(String.valueOf(edt1.getText()));
           //double cal1 = Double.parseDouble (edt1.getText ().toString ());
            cal1 = (cal1 * (9.0 / 5.0)) + 32;

            tv3.setText (cal1 + " Fahrenheit");
        }
    }

    public void F2C(View view) {
        EditText edt1 = (EditText)findViewById (R.id.edt1);
        TextView tv3=(TextView)findViewById(R.id.tv3);
        String sedt1 = edt1.getText ().toString ();
        if (TextUtils.isEmpty (sedt1)) {
            edt1.setError ("Please Enter Number");
        } else {
            double cal2=Double.parseDouble(String.valueOf(edt1.getText()));
            //double cal2= Double.parseDouble (edt1.getText ().toString ());
            cal2 = (cal2-32)*(5.0/9.0);

            tv3.setText (cal2 + " Celsius");
        }
    }



}