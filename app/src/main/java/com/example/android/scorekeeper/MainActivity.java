package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamOneScores = 0;
    int teamTwoScores = 0;
    int teamOneFaults = 0;
    int teamTwoFaults = 0;

    /** Displays the given score for Team One **/

    public void displayGoalsForTeamOne(int score){
        TextView teamOneGoalsView = (TextView) findViewById(R.id.teamOneScore);
        teamOneGoalsView.setText(String.valueOf(teamOneScores));
    }

    /** Displays the number of faults for Team One **/

    public void displayFaultsForTeamOne(int score){
        TextView teamOneFaultsView = (TextView) findViewById(R.id.teamOneFaults);
        teamOneFaultsView.setText(String.valueOf(teamOneFaults));
    }

    /** Adds one goal to Team One score **/

    public void addingGoalTeamOne(View v) {
        teamOneScores = teamOneScores + 1;
        displayGoalsForTeamOne(teamOneScores);

    }

    /** Adds one fault to Team One number of faults **/

    public void addingFaultTeamOne(View v) {
        teamOneFaults = teamOneFaults + 1;
        displayFaultsForTeamOne(teamOneScores);

    }

    /** Displays the given score for Team Two **/

    public void displayGoalsForTeamTwo(int score){
        TextView teamTwoGoalsView = (TextView) findViewById(R.id.teamTwoScore);
        teamTwoGoalsView.setText(String.valueOf(teamTwoScores));
    }

    /** Displays the number of faults for Team One **/

    public void displayFaultsForTeamTwo(int score){
        TextView teamOneFaultsView = (TextView) findViewById(R.id.teamTwoFaults);
        teamOneFaultsView.setText(String.valueOf(teamTwoFaults));
    }

    /** Adds one goal to Team One score **/

    public void addingGoalTeamTwo(View v) {
        teamTwoScores = teamTwoScores + 1;
        displayGoalsForTeamTwo(teamTwoScores);

    }

    /** Adds one fault to Team One number of faults **/

    public void addingFaultTeamTwo(View v) {
        teamTwoFaults = teamTwoFaults + 1;
        displayFaultsForTeamTwo(teamTwoFaults);

    }

    public void endingGame(View v) {
        Toast.makeText(this,"Your final score is " + teamOneScores + " for Team 1 and " + teamTwoScores + " for Team 2!",Toast.LENGTH_LONG).show();
        teamOneScores = 0;
        teamTwoScores = 0;
        teamOneFaults = 0;
        teamTwoFaults = 0;

        displayGoalsForTeamOne(teamOneScores);
        displayFaultsForTeamOne(teamOneScores);
        displayGoalsForTeamTwo(teamTwoScores);
        displayFaultsForTeamTwo(teamTwoFaults);
    }


}
