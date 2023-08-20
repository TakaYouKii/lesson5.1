package com.example.counter

import com.example.counter.model.CounterModel
import com.example.counter.view.CounterView

class Presenter(var counterView: CounterView) {

    val model = CounterModel()


    fun increment(){
        model.increment()
        counterView.showCount(model.number)
        if(model.number == 10){
            counterView.showTost()
        }
        counterView.changeCountColor(model.number)
    }

    fun decrement(){
        model.decrement()
        counterView.showCount(model.number)
        if(model.number == 10){
            counterView.showTost()
        }
        counterView.changeCountColor(model.number)
    }


}