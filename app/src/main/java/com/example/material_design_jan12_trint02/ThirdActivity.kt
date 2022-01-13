package com.example.material_design_jan12_trint02

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.material_design_jan12_trint02.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            thirdNextBtn.setOnClickListener{
                startFourthActivity()
            }
        }
    }

    private fun startFourthActivity() {
        val email = binding.emailEt.text.toString()

        val intent = Intent(this, FourthActivity::class.java).also {
            it.putExtra(FIRST_NAME_EXTRA, intent.getStringExtra(FIRST_NAME_EXTRA))
            it.putExtra(LAST_NAME_EXTRA, intent.getStringExtra(LAST_NAME_EXTRA))
            it.putExtra(EMAIL_EXTRA, email)
        }
        startActivity(intent)
    }
}