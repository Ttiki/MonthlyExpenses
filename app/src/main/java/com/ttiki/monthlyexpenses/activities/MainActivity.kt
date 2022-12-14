package com.ttiki.monthlyexpenses.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ttiki.monthlyexpenses.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize the bottom navigation view
        //create bottom navigation view object
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigatin_view)
        //create nav controller object
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        //setup bottom navigation view with nav controller
        bottomNavigationView.setupWithNavController(navController)

        //Change the fragment when the bottom navigation view item is selected
        bottomNavigationView.OnNavigationItemSelected  { item ->
            when (item.itemId) {
                R.id.homeFragment -> {
                    navController.navigate(R.id.homeFragment)
                }
                R.id.bankFragment -> {
                    navController.navigate(R.id.bankFragment)
                }
                R.id.payFragment -> {
                    navController.navigate(R.id.payFragment)
                }
                R.id.historyFragment -> {
                    navController.navigate(R.id.historyFragment)
                }
            }
            true
        }




    }
}