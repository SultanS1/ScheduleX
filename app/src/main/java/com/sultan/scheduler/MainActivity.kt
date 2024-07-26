package com.sultan.scheduler

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.sultan.scheduler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBinding<ActivityMainBinding>(R.id.main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        binding.bottomNavigation.setupWithNavController(navHostFragment.navController)
        // React to destination changes
        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.loginFragment -> {
                    binding.bottomNavigation.visibility = View.GONE
                    binding.createTaskBtn.visibility = View.GONE
                }
                R.id.registrationFragment -> {
                    binding.bottomNavigation.visibility = View.GONE
                    binding.createTaskBtn.visibility = View.GONE
                }
                R.id.tasksFragment -> {
                    binding.bottomNavigation.visibility = View.VISIBLE
                    binding.createTaskBtn.visibility = View.VISIBLE
                }
                else -> {
                    binding.bottomNavigation.visibility = View.VISIBLE
                    binding.createTaskBtn.visibility = View.GONE
                }
            }
        }
    }
}