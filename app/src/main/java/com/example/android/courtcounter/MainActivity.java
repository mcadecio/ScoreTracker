package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int scoreA=0;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ;
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointA(View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void twoPointA(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);

    }

    public void onePointA(View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);

    }
    public void threePointB(View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void twoPointB(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void onePointB(View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
