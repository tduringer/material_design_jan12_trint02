package com.example.material_design_jan12_trint02

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.material_design_jan12_trint02.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            secondNextBtn.setOnClickListener{
                startThirdActivity()
            }
        }
    }

    private fun startThirdActivity() {
        val firstName = binding.firstNameEt.text.toString()
        val lastName = binding.lastNameEt.text.toString()

        val intent = Intent(this, ThirdActivity::class.java).also{
            it.putExtra(FIRST_NAME_EXTRA, firstName)
            it.putExtra(LAST_NAME_EXTRA, lastName)

        }
        startActivity(intent)
    }
}