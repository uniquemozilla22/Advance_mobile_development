package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private TextView ScoreTextView;
    private Button buttonScore3;
    private Button buttonScore2;
    private Button buttonFreeThrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreTextView = findViewById(R.id.score_tv);
        
        buttonScore3 = findViewById(R.id.btn_score3);
        buttonScore2 = findViewById(R.id.btn_score2);
        buttonFreeThrow = findViewById(R.id.buttonFreeThrow);


    }

    buttonScore3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Toast.makeText(context:MainActivity.this,text:"Button Clicked",Toast.LENGTH_LONG);
        }
    });
}