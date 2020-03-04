package com.example.macaldo_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.macaldo_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // reference to the binding object
    private lateinit var binding: ActivityMainBinding

    // reference the data class
    private val myValues: MyValues = MyValues()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // for the access for the xml
        binding.myValues = myValues

        // add a listener to the done button
        binding.doneButton.setOnClickListener {
            displayInput(it)
        }
    }

    // function to display only the inputs of the user
    private fun displayInput(view: View) {
        // apply using the binding
        binding. apply {
            // assign the text inputted by the user to the variables for the display
            myValues?.name = name.text.toString()
            myValues?.nickname = nickname.text.toString()
            myValues?.age= age.text.toString()
            myValues?.birthday = birthday.text.toString()
            myValues?.phoneNumber = phone.text.toString()
            myValues?.email = email.text.toString()
            myValues?.course = course.text.toString()
            myValues?.dream= dream.text.toString()
            myValues?.crush = crush.text.toString()
            myValues?.message = message.text.toString()
            invalidateAll()
            // change visibilities of the views
            greeting.visibility = View.GONE
            nickname.visibility = View.GONE
            name.visibility = View.GONE
            age.visibility = View.GONE
            birthday.visibility = View.GONE
            phone.visibility = View.GONE
            email.visibility = View.GONE
            course.visibility = View.GONE
            dream.visibility = View.GONE
            crush.visibility = View.GONE
            message.visibility = View.GONE
            nicknameQ.visibility = View.GONE
            nameQ.visibility = View.GONE
            ageQ.visibility = View.GONE
            birthdayQ.visibility = View.GONE
            phoneQ.visibility = View.GONE
            emailQ.visibility = View.GONE
            courseQ.visibility = View.GONE
            dreamQ.visibility = View.GONE
            crushQ.visibility = View.GONE
            messageQ.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameDisplay.visibility = View.VISIBLE
            nameDisplay.visibility = View.VISIBLE
            ageDisplay.visibility = View.VISIBLE
            birthdayDisplay.visibility = View.VISIBLE
            phoneDisplay.visibility = View.VISIBLE
            emailDisplay.visibility = View.VISIBLE
            courseDisplay.visibility = View.VISIBLE
            dreamDisplay.visibility = View.VISIBLE
            crushDisplay.visibility = View.VISIBLE
            messageDisplay.visibility = View.VISIBLE
            thankuDisplay.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
