package com.tshego.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()
            if (age != null && age in 20..100) {
                val historicalfigureName= when (age){
                    21 -> "Juice World - this is a young rapper from chicago known for his unique style of genre called emo rap "
                    25 -> "2pac - this is a rapper who is considered one of the most influential rappers of all time as he spoke abut democracy and equality in his music "
                    34 -> "Ricky Rick - a south african musician who was very versatile in his genre and is influential in the sens of indulging with the youth "
                    39 -> "MArtin Luther Jr - an american christian minister ,activist and philosopher who was a prominent leader in the civil right movement"
                    40 -> "Jonah Lomu - an all blacks rugby player considered to be one of the greatest players of all time "
                    41 -> "Shaka Zulu - the zulu - the king of the zulu empire in south africa who was famous for his combat tactics and leadership skills "
                    74 -> "Mohammed Ali - an american heavyweight boxer and activist who was the most influential boxers of all time and stood for equality in america  "
                    87 -> "Niel Armstrong - an american astronaut who was the first person to walk on the moon"
                    91 -> "Pablo Picasso - a spanish painter and sculptor who was known for creating and funding the cubist movement"
                    95 -> "Nelson Mandela - a south african anti apartheid activist who went on to become the first black president of south africa "
                    else -> null
                }
                val message = if (historicalfigureName != null) "The employees name is $historicalfigureName"
                else "No historicalfigureName found with the entered age try a different age."
                resultTextView.text = message

            } else {
                resultTextView.text = "Invalid Input .Please enter a valid age between 20 and 100."
            }
        }

        clearButton.setOnClickListener{
            ageInput.text.clear()
            resultTextView.text=""
        }

    }


}
