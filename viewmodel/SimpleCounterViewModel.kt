package com.br.giardini.livedataviewmodeltraining.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SimpleCounterViewModel:ViewModel(){

    var counter = MutableLiveData<Int>(0)
    var error = MutableLiveData<String>()


    var increment = {
        counter.value = counter.value?.plus(1)
        error.value = null
    }

    var decrement = {
        if (counter.value ==0){
                error.value="It is forbidden to go below 0 >:("

        }else{
            counter.value = counter.value?.minus(1)
        }

    }



}