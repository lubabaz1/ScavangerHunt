package com.example.lubabaislam.scavangerhunt;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.lubabaislam.scavangerhunt.DataObjects.Clue;

public class CurrentClueActivity extends AppCompatActivity {
    TextView mClueTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_clue);

        Clue[] clues=((MyApplication)getApplication()).getClues();
        Clue clue1= clues[0];

        mClueTextView.setText(clue1.getmClue());

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        int myVariable= sharedPrefs.getInt("userCurrentClue",2);
        int indexOfClueIWantt








    }
}
