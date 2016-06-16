package com.example.lubabaislam.scavangerhunt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_description);



    }

   public void starting(View view){
       Intent intent = new Intent(this, CurrentClueActivity.class);
       startActivity(intent);

       SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
       SharedPreferences.Editor editor = sharedPrefs.edit();
       editor.putInt("UserCurrentClue",0);
       editor.commit();

   }

}
