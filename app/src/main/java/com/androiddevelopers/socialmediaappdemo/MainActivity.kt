package com.androiddevelopers.socialmediaappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.androiddevelopers.socialmediaappdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager
                .findFragmentById(binding.fragmentContainerView.id) as NavHostFragment?
        val navControl = navHostFragment?.navController

        navControl?.let {
            NavigationUI.setupWithNavController(binding.bottomNavigationBar, navControl)
        }
    }
}