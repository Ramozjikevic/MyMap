package ru.ramozjikevic.mymap.ui.component.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import dagger.android.AndroidInjection
import ru.ramozjikevic.mymap.R

abstract class BaseActivity: AppCompatActivity() {
    protected abstract val layout: Int
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(layout)
        navController = findNavController(R.id.nav_host_fragment)
    }
}