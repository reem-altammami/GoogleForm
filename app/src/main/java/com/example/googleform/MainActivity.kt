package com.example.googleform

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.googleform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideKeybord()
        binding.currntEmail.setOnClickListener {
             val toast = Toast.makeText(this, "click current email", Toast.LENGTH_SHORT)
             toast.show()
        }
        binding.signINInstead.setOnClickListener {
            val toast = Toast.makeText(this, "click sing in", Toast.LENGTH_SHORT)
            toast.show()
        }
        binding.next.setOnClickListener {
            val toast = Toast.makeText(this, "click neext", Toast.LENGTH_SHORT)
            toast.show()
        }



    }

    fun hideKeybord(){
        binding.firstName.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode)}
        binding.lastName.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode)}
        binding.username.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode)}
        binding.password.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode)}
        binding.confirm.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode)}
    }
    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}