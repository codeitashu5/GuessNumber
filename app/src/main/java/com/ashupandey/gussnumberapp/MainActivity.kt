package com.ashupandey.gussnumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var number: Int = 5
    var upperBound: Int = 10
    var lowerBound: Int = 1
    lateinit var questionTextView: TextView
    lateinit var answerTextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.question_text_view)
        answerTextView=findViewById(R.id.answer_text_view)
        //as the number changes the place holder changes as well
        questionTextView.text = String.format(resources.getString(R.string.the_queston_string), number)


    }

    fun downWardIsClicked(view: View) {

            upperBound = number-1
            number = (upperBound + lowerBound) / 2
            questionTextView.text = String.format(resources.getString(R.string.the_queston_string), number)


    }

    fun checkIsClicked(view: View) {
        answerTextView.text= String.format(resources.getString(R.string.the_answer_string),number)
        answerTextView.visibility=View.VISIBLE
        questionTextView.visibility=View.INVISIBLE
    }

    fun upWardIsClicked(view: View) {
        lowerBound=number+1
        number= ((upperBound + lowerBound) / 2)
        questionTextView.text = String.format(resources.getString(R.string.the_queston_string), number)
    }

    fun resetIsClicked(view: View) {
        number=5
        questionTextView.text = String.format(resources.getString(R.string.the_queston_string), number)
        upperBound=10
        lowerBound=1

        answerTextView.visibility=View.INVISIBLE
        questionTextView.visibility=View.VISIBLE


    }
}