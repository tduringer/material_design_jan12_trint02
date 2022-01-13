package com.example.material_design_jan12_trint02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.material_design_jan12_trint02.databinding.ActivityFifthBinding

class FifthActivity:AppCompatActivity() {

    private lateinit var binding : ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            firstNameOutputTv.text = intent.getStringExtra(FIRST_NAME_EXTRA)
            lastNameOutputTv.text = intent.getStringExtra(LAST_NAME_EXTRA)
            emailOutputTv.text = intent.getStringExtra(EMAIL_EXTRA)
            passworOutputTv.text = intent.getStringExtra(PASSWORD_EXTRA)
        }
    }
}