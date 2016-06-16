package com.example.lubabaislam.scavangerhunt;

import android.app.Application;
import android.widget.TextView;

import com.example.lubabaislam.scavangerhunt.DataObjects.Clue;

/**
 * Created by lubaba.islam on 6/11/2016.
 */
public class MyApplication extends Application {

    TextView mClueTextView;
    Clue[] clues;

    public void mCreate(){
        super.onCreate();
        String[] clueStrings = getResources().getStringArray(R.array.clues);
        clues = new Clue[clueStrings.length];
        for (int i=0; i<clues.length; i++)
        {
            String clueStrings1= clueStrings[i];
            Clue c = new Clue(clueStrings1, i);
            clues[i] = c;

        }}

        public Clue[] getClues(){
            return clues;
    }
}



