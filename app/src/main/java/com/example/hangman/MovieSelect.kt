package com.example.hangman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MovieSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_select)

        val title: TextView = findViewById(R.id.textView)
        val setMovie: EditText = findViewById(R.id.setMovie)
        val startButton: Button = findViewById(R.id.startButton)

        val intent = intent
        val p1 = intent.getStringExtra("P1")
        val p2 = intent.getStringExtra("P2")
        val p1Game = intent.getIntExtra("p1Game", 0)
        val p2Game = intent.getIntExtra("p2Game", 0)
        val p1Score = intent.getIntExtra("p1Score", 0)
        val p2Score = intent.getIntExtra("p2Score", 0)
        val chance = intent.getIntExtra("Chance", 1)

        if(chance == 1) {
            title.text = "$p1, Enter movie name you want $p2 to guess :-"
        }
        else {
            title.text = "$p2, Enter movie name you want $p1 to guess :-"
        }

        startButton.setOnClickListener {
            val movieName: String = setMovie.text.toString()
            val intent = Intent(this, GameActivity::class.java)
            intent.putExtra("P1", p1)
            intent.putExtra("P2", p2)
            intent.putExtra("p1Game", p1Game)
            intent.putExtra("p2Game", p2Game)
            intent.putExtra("p1Score", p1Score)
            intent.putExtra("p2Score", p2Score)
            intent.putExtra("Movie", movieName)
            intent.putExtra("Chance", chance)
            if(movieName != "") {
                startActivity(intent)
            }
            else {
                Toast.makeText(applicationContext,"Movie cannot be nothing",Toast.LENGTH_SHORT).show();
            }
        }
    }

    override fun onBackPressed(){}
}