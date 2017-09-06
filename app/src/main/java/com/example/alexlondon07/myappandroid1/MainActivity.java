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

import com.example.alexlondon07.myappandroid1.model.Alumno;

import java.text.NumberFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    // Instancias de objetos a usar
    private double valor_1, valor_2;
    private EditText edit_text_num1, edit_text_num2;
    //private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Alumno alumno  = new Alumno();
        alumno.setNombre("Alexander Londoño");
        alumno.setFechaNacimiento(new Date());
        alumno.setNumero_cuenta(12234);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello my name is " + alumno.getNombre(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        loadViews();
        //listener();
    }

    private void loadViews() {
        edit_text_num1 = (EditText) findViewById(R.id.edit_text_num1);
        edit_text_num2 = (EditText) findViewById(R.id.edit_text_num2);
    }

    /*private void listener() {

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }*/


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
}
