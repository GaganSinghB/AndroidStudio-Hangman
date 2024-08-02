package com.example.hangman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PlayerSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_select)

        val player_01: EditText = findViewById(R.id.player_01)
        val player_02: EditText = findViewById(R.id.player_02)
        val okButton: Button = findViewById(R.id.okButton)

        var p1Game: Int = 0 // Number of games played by P1
        var p2Game: Int = 0 // Number of games played by P2
        var p1Score: Int = 0  // Number of games P1 won
        var p2Score: Int = 0  // Number of games P2 won
        var chance: Int = 1

        okButton.setOnClickListener {
            var p1: String = "Player 01"
            var p2: String = "Player 02"
            if(player_01.text.toString() != "") {
                p1 = player_01.text.toString()
            }
            if(player_02.text.toString() != "") {
                p2 = player_02.text.toString()
            }
            val intent = Intent(this, MovieSelect::class.java)
            intent.putExtra("P1", p1)
            intent.putExtra("P2", p2)
            intent.putExtra("p1Game", p1Game)
            intent.putExtra("p2Game", p2Game)
            intent.putExtra("p1Score", p1Score)
            intent.putExtra("p2Score", p2Score)
            intent.putExtra("Chance", chance)
            startActivity(intent)
        }
    }

    override fun onBackPressed(){}
}