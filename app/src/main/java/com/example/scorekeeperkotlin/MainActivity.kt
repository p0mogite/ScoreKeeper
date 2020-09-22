package com.example.scorekeeperkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var scoreTeamA = 0
    var scoreTeamB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun displayForTeamA(score: Int) {
        team_a_score.text = score.toString()
    }

    fun addThreeForA(view: View) {
        scoreTeamA += 3
        displayForTeamA(scoreTeamA);
    }

    fun addTwoForA(view: View) {
        scoreTeamA += 2
        displayForTeamA(scoreTeamA)
    }

    fun addOneForA(view: View) {
        scoreTeamA++
        displayForTeamA(scoreTeamA);
    }

    fun displayForTeamB(score: Int) {
        team_b_score.text = score.toString()
    }

    fun addThreeForB(view: View) {
        scoreTeamB += 3
        displayForTeamB(scoreTeamB);
    }

    fun addTwoForB(view: View) {
        scoreTeamB += 2
        displayForTeamB(scoreTeamB)
    }

    fun addOneForB(view: View) {
        scoreTeamB++
        displayForTeamB(scoreTeamB);
    }

    fun reset(view: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB)
    }
}