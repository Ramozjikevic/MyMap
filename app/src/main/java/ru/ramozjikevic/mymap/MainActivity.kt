package ru.ramozjikevic.mymap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

import androidx.lifecycle.ViewModelProvider
import dagger.android.AndroidInjection
import ru.ramozjikevic.mymap.presentation.viewmodels.TestViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    internal lateinit var viewModelFactory: ViewModelProvider.Factory

    val testViewModel: TestViewModel by viewModels{
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testViewModel.loadMoreTestData()
    }

}