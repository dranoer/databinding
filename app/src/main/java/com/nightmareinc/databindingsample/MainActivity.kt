package com.nightmareinc.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

// ToDo 3.3 : import libraries
import androidx.databinding.DataBindingUtil
import com.nightmareinc.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ToDo 03.1 : add like activity_main >> Activity + Main + Binding
    private lateinit var binding : ActivityMainBinding

    // ToDo 06.1 : create an instance of the data class
    private val name : Name = Name()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        // ToDo 03.2 : replace that ContentView with an instruction to create the binding object
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // ToDo 06.2 : set the value of the name variable that is declared and used in a layout file
        binding.name = name

        // ToDo 03.4 : access the Button via binding
        binding.rollButton.setOnClickListener {
            addName(it)
        }
    }

    private fun addName(view: View) {
        // ToDo 03.4 : access the views via binding
        binding.apply {
            invalidateAll()
            // ToDO 06.3 : set the name
            name?.myName = "Nazanin"
            userName.visibility = View.VISIBLE
        }
    }
}