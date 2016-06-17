package com.example.lubabaislam.scavangerhunt;

import android.app.Application;

import com.example.lubabaislam.scavangerhunt.DataObjects.Clue;

/**
 * Created by lubaba.islam on 6/11/2016.
 */
public class MyApplication extends Application {

    private Clue[] clues1;

    public void mCreate(){
        super.onCreate();
        String[] clues = getResources().getStringArray(R.array.clues);
        clues1 = new Clue[clues.length];
        for (int i=0; i<clues.length; i++)
        {
            Clue c = new Clue (clues[i], i);
            clues1[i]= c;

        }}

        public Clue[] getClues(){
            return clues1;
    }
}



