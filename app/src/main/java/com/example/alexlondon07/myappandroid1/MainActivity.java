package com.example.alexlondon07.myappandroid1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Instancias de objetos a usar
    Button sum, sub, mult, div;
    private EditText num1, num2;
    private TextView resultado_op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        num1 = (EditText) findViewById(R.id.edit_text_num1);
        num2 = (EditText) findViewById(R.id.edit_text_num2);

        sum = (Button) findViewById(R.id.btn_sum);
        sub = (Button) findViewById(R.id.btn_sub);
        mult = (Button) findViewById(R.id.btn_mult);
        div = (Button) findViewById(R.id.btn_div);
        resultado_op = (TextView) findViewById(R.id.result);

        //Asociamos el event click para cada boton
        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        mult.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello my name is Alexander Londoño" , Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int int1 = Integer.parseInt(n1);
        int int2 = Integer.parseInt(n2);
        int res = 0;

        switch(view.getId()){
            case R.id.btn_sum:
                res = int1+int2;
                break;
            case R.id.btn_sub:
                res = int1-int2;
                break;
            case R.id.btn_mult:
                res = int1*int2;
                break;
            case R.id.btn_div:
                if(int2 == 0){
                    res = 0;
                }else{
                    res = int1/int2;
                }
                break;
        }

        ((TextView) resultado_op).setText(""+res);
    }
}
