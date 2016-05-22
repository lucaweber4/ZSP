package com.example.luc.zaehlerstandprotokoll3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class zweiteActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zweite);
    }

    public void blub(View view)
    {
        Toast.makeText(this, "Du hasch an  klonaen Pimml", Toast.LENGTH_SHORT).show();
    }
}
