
package com.example.lubabaislam.scavangerhunt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FoundClueActivity extends AppCompatActivity {
    String lastPath;
    TextView clue_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_clue);
        clue_1 = (TextView) findViewById(R.id.clue1_text_view);
        Intent intent = getIntent();
        Uri uri = intent.getData();                 // retrieve a Uri object instance or
        lastPath = uri.getLastPathSegment();

        if (lastPath.equals("0")) {
            clue_1.setText("0");
        }
        else if(lastPath.equals("1")){
            clue_1.setText("1");
        }
    }


    public void onContinue(View view) {
        if (lastPath.equals("0")) {
            Intent intent1 = new Intent(this, WinActivity.class);
            startActivity(intent1);
        }
        else if (lastPath.equals("1")){
            Intent intent2 = new Intent(this, CurrentClueActivity.class);
            startActivity(intent2);
        }


    }
}