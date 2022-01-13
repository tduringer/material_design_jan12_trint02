package com.example.material_design_jan12_trint02

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.material_design_jan12_trint02.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            fourthNextBtn.setOnClickListener{
                startFifthActivity()
            }
        }
    }

    private fun startFifthActivity() {
        val password = binding.passwordEt.text.toString()

        val intent = Intent(this, FifthActivity::class.java).also {
            it.putExtra(FIRST_NAME_EXTRA, intent.getStringExtra(FIRST_NAME_EXTRA))
            it.putExtra(LAST_NAME_EXTRA, intent.getStringExtra(LAST_NAME_EXTRA))
            it.putExtra(EMAIL_EXTRA, intent.getStringExtra(EMAIL_EXTRA))
            it.putExtra(PASSWORD_EXTRA, password)
        }
        startActivity(intent)
    }
}