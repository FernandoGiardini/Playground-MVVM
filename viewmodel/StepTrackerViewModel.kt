package com.br.giardini.livedataviewmodeltraining.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StepTrackerViewModel:ViewModel(){

    var tracker = MutableLiveData<Int>(0)
    var error = MutableLiveData<String>()


    var increment = {
        tracker.value = tracker.value?.plus(1)
        error.value = null
    }

    var decrement = {
        if (tracker.value ==0){
                error.value="It is forbidden to go below 0 >:("

        }else{
            tracker.value = tracker.value?.minus(1)
        }

    }



}