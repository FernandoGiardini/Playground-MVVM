package com.br.giardini.livedataviewmodeltraining.view

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.giardini.livedataviewmodeltraining.viewmodel.StepTrackerViewModel

@Composable
fun StepCounter(viewModel:StepTrackerViewModel){

    viewModel?.tracker?.observeAsState()?.value

    viewModel?.error?.observeAsState()?.value?.let {

        Toast.makeText(LocalContext.current, it, Toast.LENGTH_SHORT).show()

    }


    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        )
    {
        Box(contentAlignment = Alignment.Center,modifier = Modifier
            .fillMaxWidth()
        ){
            Text(text = "Steps taken: ${viewModel.tracker.value}", fontSize = 30.sp)
        }
        Spacer(Modifier.size(12.dp))
        Box(contentAlignment = Alignment.Center,modifier = Modifier
            .fillMaxWidth()
        ){
            Row {
                Button(onClick = { viewModel.increment.invoke() }) {
                    Text(text = "Increment")
                }
                Spacer(modifier = Modifier.size(12.dp))
                Button(onClick = { viewModel.decrement.invoke() }) {
                    Text(text = "Decrement")
                }
            }

        }

    }

}
