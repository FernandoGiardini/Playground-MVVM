package com.br.giardini.livedataviewmodeltraining.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.br.giardini.livedataviewmodeltraining.viewmodel.StepTrackerViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = StepTrackerViewModel()
        setContent {
               StepCounter(viewModel)
        }
    }
}


