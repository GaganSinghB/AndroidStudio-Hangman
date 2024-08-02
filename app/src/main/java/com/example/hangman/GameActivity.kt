package com.example.hangman

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val hintBox: TextView = findViewById(R.id.hint)
        val a: TextView = findViewById(R.id.aButton)
        val b: TextView = findViewById(R.id.bButton)
        val c: TextView = findViewById(R.id.cButton)
        val d: TextView = findViewById(R.id.dButton)
        val e: TextView = findViewById(R.id.eButton)
        val f: TextView = findViewById(R.id.fButton)
        val g: TextView = findViewById(R.id.gButton)
        val h: TextView = findViewById(R.id.hButton)
        val i: TextView = findViewById(R.id.iButton)
        val j: TextView = findViewById(R.id.jButton)
        val k: TextView = findViewById(R.id.kButton)
        val l: TextView = findViewById(R.id.lButton)
        val m: TextView = findViewById(R.id.mButton)
        val n: TextView = findViewById(R.id.nButton)
        val o: TextView = findViewById(R.id.oButton)
        val p: TextView = findViewById(R.id.pButton)
        val q: TextView = findViewById(R.id.qButton)
        val r: TextView = findViewById(R.id.rButton)
        val s: TextView = findViewById(R.id.sButton)
        val t: TextView = findViewById(R.id.tButton)
        val u: TextView = findViewById(R.id.uButton)
        val v: TextView = findViewById(R.id.vButton)
        val w: TextView = findViewById(R.id.wButton)
        val x: TextView = findViewById(R.id.xButton)
        val y: TextView = findViewById(R.id.yButton)
        val z: TextView = findViewById(R.id.zButton)
        val playerOneScore: TextView = findViewById(R.id.p1Score)
        val playerTwoScore: TextView = findViewById(R.id.p2Score)
        val playAgain: Button = findViewById(R.id.playAgainButton)
        val quit: Button = findViewById(R.id.quitButton)

        val intent = intent
        val p1 = intent.getStringExtra("P1")
        val p2 = intent.getStringExtra("P2")
        var p1Game = intent.getIntExtra("p1Game", 0)
        var p2Game = intent.getIntExtra("p2Game", 0)
        var p1Score = intent.getIntExtra("p1Score", 0)
        var p2Score = intent.getIntExtra("p2Score", 0)
        val selectedMovie = intent.getStringExtra("Movie")
        var chance = intent.getIntExtra("Chance", 0)

        if (chance == 1) {
            p2Game++
        }
        if (chance == -1) {
            p1Game++
        }

        val movie: String = selectedMovie.toString().uppercase()
        var letters: String = ""
//        val hint: String = printQuestion(movie, letters)
        var movieCompare: String = ""
        var check: Int = 0
        var wrong: Int = 0

        for(i in movie){
            movieCompare += "$i "
        }

        hintBox.text = printQuestion(movie, letters)

        a.setOnClickListener {
            letters += "A"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            a.isEnabled = false
        }
        b.setOnClickListener {
            letters += "B"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            b.isEnabled = false
        }
        c.setOnClickListener {
            letters += "C"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            c.isEnabled = false
        }
        d.setOnClickListener {
            letters += "D"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            d.isEnabled = false
        }
        e.setOnClickListener {
            letters += "E"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            e.isEnabled = false
        }
        f.setOnClickListener {
            letters += "F"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            f.isEnabled = false
        }
        g.setOnClickListener {
            letters += "G"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            g.isEnabled = false
        }
        h.setOnClickListener {
            letters += "H"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            h.isEnabled = false
        }
        i.setOnClickListener {
            letters += "I"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            i.isEnabled = false
        }
        j.setOnClickListener {
            letters += "J"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            j.isEnabled = false
        }
        k.setOnClickListener {
            letters += "K"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            k.isEnabled = false
        }
        l.setOnClickListener {
            letters += "L"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            l.isEnabled = false
        }
        m.setOnClickListener {
            letters += "M"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            m.isEnabled = false
        }
        n.setOnClickListener {
            letters += "N"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            n.isEnabled = false
        }
        o.setOnClickListener {
            letters += "O"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            o.isEnabled = false
        }
        p.setOnClickListener {
            letters += "P"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            p.isEnabled = false
        }
        q.setOnClickListener {
            letters += "Q"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            q.isEnabled = false
        }
        r.setOnClickListener {
            letters += "R"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            r.isEnabled = false
        }
        s.setOnClickListener {
            letters += "S"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            s.isEnabled = false
        }
        t.setOnClickListener {
            letters += "T"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            t.isEnabled = false
        }
        u.setOnClickListener {
            letters += "U"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            u.isEnabled = false
        }
        v.setOnClickListener {
            letters += "V"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            v.isEnabled = false
        }
        w.setOnClickListener {
            letters += "W"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            w.isEnabled = false
        }
        x.setOnClickListener {
            letters += "X"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            x.isEnabled = false
        }
        y.setOnClickListener{
            letters += "Y"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            y.isEnabled = false
        }
        z.setOnClickListener {
            letters += "Z"
            check = buttonPress(hintBox, movie, letters, movieCompare, chance)
            if(check == 0) {
                wrong++
                manageHangman(wrong)
            }
            if(check == 2) {
                if(chance == 1) {
                    p2Score++
                }
                else {
                    p1Score++
                }
            }
            playerOneScore.text = "$p1's Score: $p1Score / $p1Game"
            playerTwoScore.text = "$p2's Score: $p2Score / $p2Game"
            z.isEnabled = false
        }

        playAgain.setOnClickListener {
            chance = -chance
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

        quit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun buttonPress(hintBox: TextView, movie: String, letters: String, movieCompare: String, chance: Int): Int {
        var check: Int = 0
        val winMessage: TextView = findViewById(R.id.winMessage)
        val keyboard: TableLayout = findViewById(R.id.keyboard)
        val afterWin: ConstraintLayout = findViewById(R.id.afterWin)

        hintBox.text = printQuestion(movie, letters)

        check = 0
        for(i in movie) {
            if(i == letters.last()) {
                check = 1
            }
        }

        if (hintBox.text.toString() == movieCompare) {
            keyboard.visibility = View.GONE
            afterWin.visibility = View.VISIBLE
            winMessage.text = "YOU WIN"
            check = 2
        }

        return check
    }

    private fun manageHangman(wrong: Int) {
        val hangmanImage02: ImageView = findViewById(R.id.imageView1)
        val hangmanImage03: ImageView = findViewById(R.id.imageView2)
        val hangmanImage04: ImageView = findViewById(R.id.imageView3)
        val hangmanImage05: ImageView = findViewById(R.id.imageView4)
        val hangmanImage06: ImageView = findViewById(R.id.imageView5)
        val hangmanImage07: ImageView = findViewById(R.id.imageView6)
        val hint: TextView = findViewById(R.id.hint)
        val winMessage: TextView = findViewById(R.id.winMessage)
        val keyboard: TableLayout = findViewById(R.id.keyboard)
        val afterWin: ConstraintLayout = findViewById(R.id.afterWin)

        val intent = intent
        val selectedMovie = intent.getStringExtra("Movie").toString().uppercase()

        if(wrong == 1) {
//            hangmanImage.setImageDrawable(getDrawable(R.drawable.transparenthangman02))
            hangmanImage02.visibility = View.VISIBLE
            hangmanImage02.animate().apply {
                duration = 500
                alpha(.1f)
            }.withEndAction {
                hangmanImage02.animate().apply {
                    duration = 500
                    alpha(1f)
                }
            }
        }
        if(wrong == 2) {
//            hangmanImage.setImageDrawable(getDrawable(R.drawable.hangman03))
            hangmanImage03.visibility = View.VISIBLE
            hangmanImage03.animate().apply {
                duration = 500
                alpha(.1f)
            }.withEndAction {
                hangmanImage03.animate().apply {
                    duration = 500
                    alpha(1f)
                }
            }
        }
        if(wrong == 3) {
//            hangmanImage.setImageDrawable(getDrawable(R.drawable.hangman04))
            hangmanImage04.visibility = View.VISIBLE
            hangmanImage04.animate().apply {
                duration = 500
                alpha(.1f)
            }.withEndAction {
                hangmanImage04.animate().apply {
                    duration = 500
                    alpha(1f)
                }
            }
        }
        if(wrong == 4) {
//            hangmanImage.setImageDrawable(getDrawable(R.drawable.hangman05))
            hangmanImage05.visibility = View.VISIBLE
            hangmanImage05.animate().apply {
                duration = 500
                alpha(.1f)
            }.withEndAction {
                hangmanImage05.animate().apply {
                    duration = 500
                    alpha(1f)
                }
            }
        }
        if(wrong == 5) {
//            hangmanImage.setImageDrawable(getDrawable(R.drawable.hangman06))
            hangmanImage06.visibility = View.VISIBLE
            hangmanImage06.animate().apply {
                duration = 500
                alpha(.1f)
            }.withEndAction {
                hangmanImage06.animate().apply {
                    duration = 500
                    alpha(1f)
                }
            }
        }
        if(wrong == 6){
//            hangmanImage.setImageDrawable(getDrawable(R.drawable.hangman07))
            hangmanImage07.visibility = View.VISIBLE
            hangmanImage07.animate().apply {
                duration = 500
                alpha(.1f)
            }.withEndAction {
                hangmanImage07.animate().apply {
                    duration = 500
                    alpha(1f)
                }
            }
            hint.text = selectedMovie
            keyboard.visibility = View.GONE
            afterWin.visibility = View.VISIBLE
            winMessage.text = "YOU LOST"
            winMessage.setTextColor(Color.RED)
        }
    }

    private fun printQuestion(movie: String, letters: String): String {
        var hint: String = ""
        for (i in movie) {
            var x: Int = 0
            for(j in letters) {
                if(i == j) {
                    hint = "$hint$i "
                    x = 1
                }
            }

//            if(i == 'A' || i =='a' || i =='E' || i =='e' || i =='I' || i =='i' || i =='O' || i =='o' || i =='U' || i =='u'){
//            if(i == 'A' || i =='a'){
//                hint = "$hint$i "
//            }
            if(i == ' ') {
                hint = "$hint  "
            }
            else {
                if(x == 0){
                    hint += "_ "
                }
            }
        }
        return hint
    }

    override fun onBackPressed(){}
}