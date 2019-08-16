package com.witheredflowers.dicoding.bmaap_submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "About Activity"
        }
    }
}
