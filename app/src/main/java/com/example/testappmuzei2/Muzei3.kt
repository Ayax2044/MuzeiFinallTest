package com.example.testappmuzei2

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Muzei3 : BaseActivity() {
    private var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_muzei3)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //1
        val b1 = findViewById<Button>(R.id.button1)
        val radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)
        val t1: TextView = findViewById(R.id.textView1)
        val im1: ImageView = findViewById(R.id.imageView1)
        //2
        val b2: Button = findViewById(R.id.button2)
        val t2: TextView = findViewById(R.id.textView2)
        val radioGroup2: RadioGroup = findViewById(R.id.radioGroup2)
        val im2: ImageView = findViewById(R.id.imageView2)
        //3
        val b3: Button = findViewById(R.id.button3)
        val t3: TextView = findViewById(R.id.textView3)
        val radioGroup3: RadioGroup = findViewById(R.id.radioGroup3)

        //4
        val b4: Button = findViewById(R.id.button4)
        val t4: TextView = findViewById(R.id.textView4)
        val radioGroup4: RadioGroup = findViewById(R.id.radioGroup4)

        //5
        val b5: Button = findViewById(R.id.button5)
        val t5: TextView = findViewById(R.id.textView5)
        val radioGroup5: RadioGroup = findViewById(R.id.radioGroup5)
        val t7: TextView = findViewById(R.id.textView7)
        val b6: Button = findViewById(R.id.button6)



        //1

        b1.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup1.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio1)
            {
                score += 1

                radioGroup1.visibility = View.GONE
                t1.visibility = View.GONE
                im1.visibility = View.GONE
                b1.visibility = View.GONE

                b2.visibility = View.VISIBLE
                t2.visibility = View.VISIBLE
                radioGroup2.visibility = View.VISIBLE
                im2.visibility = View.VISIBLE
            }
            else if(selectedOptionId == R.id.radio2 || selectedOptionId == R.id.radio3)
            {
                radioGroup1.visibility = View.GONE
                t1.visibility = View.GONE
                im1.visibility = View.GONE
                b1.visibility = View.GONE

                b2.visibility = View.VISIBLE
                t2.visibility = View.VISIBLE
                radioGroup2.visibility = View.VISIBLE
                im2.visibility = View.VISIBLE
            }
        }

        //2

        b2.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup2.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio6)
            {
                score += 1

                radioGroup2.visibility = View.GONE
                t2.visibility = View.GONE
                im2.visibility = View.GONE
                b2.visibility = View.GONE

                b3.visibility = View.VISIBLE
                t3.visibility = View.VISIBLE
                radioGroup3.visibility = View.VISIBLE
            }
            else if(selectedOptionId == R.id.radio4 || selectedOptionId == R.id.radio5)
            {
                radioGroup2.visibility = View.GONE
                t2.visibility = View.GONE
                im2.visibility = View.GONE
                b2.visibility = View.GONE

                b3.visibility = View.VISIBLE
                t3.visibility = View.VISIBLE
                radioGroup3.visibility = View.VISIBLE
            }
        }

        //3

        b3.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup3.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio9)
            {
                score += 1

                radioGroup3.visibility = View.GONE
                t3.visibility = View.GONE
                b3.visibility = View.GONE

                b4.visibility = View.VISIBLE
                t4.visibility = View.VISIBLE
                radioGroup4.visibility = View.VISIBLE

            }
            else if (selectedOptionId == R.id.radio8 || selectedOptionId == R.id.radio7)
            {
                radioGroup3.visibility = View.GONE
                t3.visibility = View.GONE
                b3.visibility = View.GONE

                b4.visibility = View.VISIBLE
                t4.visibility = View.VISIBLE
                radioGroup4.visibility = View.VISIBLE
            }
        }

        //4

        b4.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup4.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio11)
            {
                score += 1

                radioGroup4.visibility = View.GONE
                t4.visibility = View.GONE
                b4.visibility = View.GONE

                b5.visibility = View.VISIBLE
                t5.visibility = View.VISIBLE
                radioGroup5.visibility = View.VISIBLE

            }
            else if(selectedOptionId == R.id.radio12 || selectedOptionId == R.id.radio10)
            {
                radioGroup4.visibility = View.GONE
                t4.visibility = View.GONE
                b4.visibility = View.GONE

                b5.visibility = View.VISIBLE
                t5.visibility = View.VISIBLE
                radioGroup5.visibility = View.VISIBLE
            }
        }

        //5

        b5.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup5.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio13)
            {
                score += 1

                radioGroup5.visibility = View.GONE
                t5.visibility = View.GONE
                b5.visibility = View.GONE

                b6.visibility = View.VISIBLE
                t7.visibility = View.VISIBLE
                t7.text = "Вы получили $score баллов"
            }
            else if (selectedOptionId == R.id.radio14 || selectedOptionId == R.id.radio15)
            {
                radioGroup5.visibility = View.GONE
                t5.visibility = View.GONE
                b5.visibility = View.GONE

                b6.visibility = View.VISIBLE
                t7.visibility = View.VISIBLE
                t7.text = "Вы получили $score баллов"
            }
        }

        b6.setOnClickListener{
            val intent: Intent = Intent(this, TestSelect::class.java)
            startActivity(intent)
            finish()
        }
    }
}