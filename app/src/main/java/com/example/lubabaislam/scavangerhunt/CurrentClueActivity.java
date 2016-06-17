package com.example.lubabaislam.scavangerhunt;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.lubabaislam.scavangerhunt.DataObjects.Clue;

public class CurrentClueActivity extends AppCompatActivity {

    public static int CLUE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_clue);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        int myVariable = sharedPreferences.getInt(Clue.KEY, CLUE);


        Clue[] clues = ((MyApplication) getApplication()).getClues();

        Clue firstClue = clues[myVariable];

        TextView mClueTextView = (TextView) findViewById(R.id.clue_text_view);
        TextView mClueProgressNumber = (TextView) findViewById(R.id.progress_text_view);

        mClueTextView.setText(firstClue.getmClue());
        mClueProgressNumber.setText(firstClue.getmId() + "/3 Clues Completed!");

    }

}