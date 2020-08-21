package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btdot,btequal,bt0;
    TextView tv1,tv2,tvdel,tvdiv,tvmul,tvadd,tvsub;
    final char add='+';
    final char sub='-';
    final char mul='*';
    final char div='/';
    final char eqe='0';
    double val1=Double.NaN;
    double val2;
    private char action;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0=findViewById(R.id.bt0);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        btdot=findViewById(R.id.btdot);
        btequal=findViewById(R.id.btequal);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tvdel=findViewById(R.id.tvdel);
        tvdiv=findViewById(R.id.tvdiv);
        tvmul=findViewById(R.id.tvmul);
        tvadd=findViewById(R.id.tvadd);
        tvsub=findViewById(R.id.tvsub);



        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "0");
            }
        });


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "9");
            }
        });

       tvadd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               compute();
               action=add;
               tv2.setText(String.valueOf(val1) + "+");
               tv1.setText("");

           }
       });

        tvsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=sub;
                tv2.setText(String.valueOf(val1) + "-");
                tv1.setText("");

            }
        });

        tvmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=mul;
                tv2.setText(String.valueOf(val1) + "*");
                tv1.setText("");

            }
        });

        tvdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=div;
                tv2.setText(String.valueOf(val1) + "/");
                tv1.setText("");

            }
        });

        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=eqe;
                tv2.setText(tv2.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                //5+4=9
                if(tv1.getText().toString()=="="||tv2.getText().toString()=="+")
                {
                    Toast.makeText(MainActivity.this,"Something Wrong",Toast.LENGTH_LONG).show();
                }
                tv1.setText("");

            }
        });

        tvdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().length()>0)
                {
                    CharSequence name = tv1.getText().toString();
                    tv1.setText(name.subSequence(0,name.length()-1));

                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    tv1.setText("");
                    tv2.setText("");
                }
            }
        });

    }
    public void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(tv1.getText().toString());

            switch (action)
            {
                case add:
                    val1=val1+val2;
                    break;
                case sub:
                    val1=val1-val2;
                    break;
                case mul:
                    val1=val1*val2;
                    break;
                case div:
                    val1=val1/val2;
                    break;
                case eqe:

                    break;


            }
        }
        else
        {
            val1=Double.parseDouble(tv1.getText().toString());
        }
    }


}
