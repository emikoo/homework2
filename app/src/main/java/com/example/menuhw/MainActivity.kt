package com.example.menuhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tvAboutApp: TextView? = null
    var tvWelcome: TextView? = null

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAboutApp = findViewById(R.id.tvAboutApp)
        tvWelcome = findViewById(R.id.tvWelcome)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intentProducts = Intent(this, ProductsActivity::class.java)
        val intentService = Intent( this, ServiceActivity::class.java)

        when(item.itemId) {
            R.id.products -> startActivity(intentProducts)
            R.id.service -> startActivity(intentService)
            R.id.aboutApp -> tvAboutApp?.text = getString(R.string.tv_about_app)
        }
        return super.onOptionsItemSelected(item)
    }
}