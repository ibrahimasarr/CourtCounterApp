package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Tracks Team A score
     */
    int scoreTeamA = 0;
    /**
     * Tracks Team B score
     */
    int scoreTeamB = 0;
    /**
     * Tracks Team A shots
     */
    int shotsTeamA = 0;
    /**
     * Tracks Team B shots
     */
    int shotsTeamB = 0;
    /**
     * Tracks Team A shots on target
     */
    int shotsOnTargetTeamA = 0;
    /**
     * Tracks Team B shots on target
     */
    int shotsOnTargetTeamB = 0;
    /**
     * Tracks Team A fouls
     */
    int foulsTeamA = 0;
    /**
     * Tracks Team B fouls
     */
    int foulsTeamB = 0;
    /**
     * Tracks Team A corners
     */
    int cornersTeamA = 0;
    /**
     * Tracks Team B corners
     */
    int cornersTeamB = 0;
    /**
     * Tracks Team A off-sides
     */
    int offSidesTeamA = 0;
    /**
     * Tracks Team B off-sides
     */
    int offSidesTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamA(0);
        displayScoreTeamB(0);
        displayShotsTeamA(0);
        displayShotsTeamB(0);
        displayOnTargetTeamA(0);
        displayOnTargetTeamB(0);
        displayFoulsTeamA(0);
        displayFoulsTeamB(0);
        displayCornersTeamA(0);
        displayCornersTeamB(0);
        displayOffSidesTeamA(0);
        displayOffSidesTeamB(0);
    }

    /**
     *
     * Increases Team A score by 1 point.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     *
     * Increases Team B score by 1 point.
     */

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     *
     * Increases Team A shots by 1 point.
     */

    public void addShotForTeamA(View view) {
        shotsTeamA = shotsTeamA + 1;
        displayShotsTeamA(shotsTeamA);
    }

    /**
     * Increases Team B shots by 1 point.
     */
    public void addShotForTeamB(View view) {
        shotsTeamB = shotsTeamB + 1;
        displayShotsTeamB(shotsTeamB);
    }

    /**
     *
     * Increases Team A shots on target by 1 point.
     */

    public void addOnTargetForTeamA(View view) {
        shotsOnTargetTeamA = shotsOnTargetTeamA + 1;
        displayOnTargetTeamA(shotsOnTargetTeamA);
    }

    /**
     * Increases Team B shots on target by 1 point.
     */

    public void addOnTargetForTeamB(View view) {
        shotsOnTargetTeamB = shotsOnTargetTeamB + 1;
        displayOnTargetTeamB(shotsOnTargetTeamB);
    }

    /**
     * Increases Team A fouls by 1 point.
     */
    public void addFoulForTeamA(View view) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
    }

    /**
     * Increases Team B fouls by 1 point.
     */
    public void addFoulForTeamB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamB);
    }

    /**
     * Increases Team A corners by 1 point.
     */
    public void addCornerForTeamA(View view) {
        cornersTeamA = cornersTeamA + 1;
        displayCornersTeamA(cornersTeamA);
    }

    /**
     * Increases Team B corners by 1 point.
     */
    public void addCornerForTeamB(View view) {
        cornersTeamB = cornersTeamB + 1;
        displayCornersTeamB(cornersTeamB);
    }

    /**
     * Increases Team A off-sides by 1 point.
     */
    public void addOffSideForTeamA(View view) {
        offSidesTeamA = offSidesTeamA + 1;
        displayOffSidesTeamA(offSidesTeamA);
    }

    /**
     * Increases Team B off-sides by 1 point.
     */
    public void addOffSideForTeamB(View view) {
        offSidesTeamB = offSidesTeamB + 1;
        displayOffSidesTeamB(offSidesTeamB);
    }

    /**
     * Resets score to zero.
     */

    public void resetToZero(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotsTeamA = 0;
        shotsTeamB = 0;
        shotsOnTargetTeamA = 0;
        shotsOnTargetTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        cornersTeamA = 0;
        cornersTeamB = 0;
        offSidesTeamA = 0;
        offSidesTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayShotsTeamA(shotsTeamA);
        displayShotsTeamB(shotsTeamB);
        displayOnTargetTeamA(shotsOnTargetTeamA);
        displayOnTargetTeamB(shotsOnTargetTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
        displayCornersTeamA(cornersTeamA);
        displayCornersTeamB(cornersTeamB);
        displayOffSidesTeamA(offSidesTeamA);
        displayOffSidesTeamB(offSidesTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays shots for Team A.
     */
    public void displayShotsTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_shots);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays shots for Team B.
     */
    public void displayShotsTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_shots);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays shots on target for Team A.
     */
    public void displayOnTargetTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_target);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays shots on target for Team A.
     */
    public void displayOnTargetTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_target);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays fouls for Team A.
     */
    public void displayFoulsTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays fouls for Team B.
     */
    public void displayFoulsTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays corners for Team A.
     */
    public void displayCornersTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_corners);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays corners for Team B.
     */
    public void displayCornersTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_corners);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays off-sides for Team A.
     */
    public void displayOffSidesTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_offsides);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays off-sides for Team A.
     */
    public void displayOffSidesTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_offsides);
        scoreView.setText(String.valueOf(score));
    }

}
