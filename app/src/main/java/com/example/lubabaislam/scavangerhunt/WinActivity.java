package com.example.lubabaislam.scavangerhunt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.lubabaislam.scavangerhunt.DataObjects.Clue;

public class WinActivity extends AppCompatActivity {

    public static int CLUE=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
    }

    public void resetPage(View view)
    {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        CLUE = 0;
        SharedPreferences.Editor reset = sharedPreferences.edit();
        reset.putInt(Clue.KEY, CLUE);
        reset.commit();

        Intent intent = new Intent(this, StartDescriptionActivity.class);
        startActivity(intent);
    }



}
