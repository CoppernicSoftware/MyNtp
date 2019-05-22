package fr.coppernic.app.myntp.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.coppernic.app.myntp.App
import fr.coppernic.app.myntp.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.appComponents.inject(this)
    }
}
