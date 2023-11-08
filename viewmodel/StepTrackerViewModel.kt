package com.br.giardini.livedataviewmodeltraining.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StepTrackerViewModel:ViewModel(){

    var tracker = MutableLiveData<Int>(0)

    var increment = {
        tracker.value = tracker.value?.plus(1)
    }

    var decrement = {
        tracker.value = tracker.value?.minus(1)
    }



}