package com.br.giardini.livedataviewmodeltraining.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.br.giardini.livedataviewmodeltraining.viewmodel.StepTrackerViewModel

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<StepTrackerViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
               StepCounter(viewModel)
        }
    }
}


