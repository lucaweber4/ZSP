package com.example.luc.zaehlerstandprotokoll3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent myIntent = new Intent(MainActivity.this, zweiteActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }

    int speicher;
    //EditText editText = (EditText) findViewById(R.id.editText);

    public void buttonClicked(View view)
    {
        int eingegeben = Integer.parseInt(((EditText) findViewById(R.id.editText)).getText().toString());
        //int i = Integer.valueOf(editText.getText().toString());

        if(eingegeben >= speicher)
        {
            speicher = eingegeben;
        }
        else
        {
            Toast.makeText(this, "Unzulässiger Wert!", Toast.LENGTH_SHORT).show();
        }
    }

    public void anzeigen(View view)
    {
        Toast.makeText(this, speicher + " kWh", Toast.LENGTH_LONG).show();
    }

    public void reset(View view)
    {
        speicher = 0;
        Toast.makeText(this, "Speicher zurückgesetzt", Toast.LENGTH_SHORT).show();
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
}
