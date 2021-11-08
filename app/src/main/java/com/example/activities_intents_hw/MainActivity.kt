package com.example.activities_intents_hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    // To show the menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_menu, menu)
        return true }

   // Operation on menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.setting){
            val intent = Intent (this,settingActivity::class.java)
            startActivity(intent)
            return true
        } else

       if (item.itemId == R.id.share){
           val intent = Intent (this,shareActivity::class.java)
           startActivity(intent)
           return true
       } else

       if (item.itemId == R.id.phone){
           val intent = Intent (this,phoneActivity::class.java)
           startActivity(intent)
           return true
       } else

       if (item.itemId == R.id.massage) {
           val intent = Intent(this, massageActivity::class.java)
           startActivity(intent)
           return true
       } else
           // Here will set New item
         if ( item.title == "LogIn" ) {
             item.title = "Log out"
             return true
         } else
           return super.onOptionsItemSelected(item)

    }


}