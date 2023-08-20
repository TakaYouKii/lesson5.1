package com.example.counter

import android.graphics.Color
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
        if(model.number == -15 || model.number == 15){
            counterView.changeCountColor(Color.GREEN)
        }else{
            counterView.changeCountColor(Color.WHITE)
        }

    }

    fun decrement(){
        model.decrement()
        counterView.showCount(model.number)
        if(model.number == -10){
            counterView.showTost()
        }
        if(model.number == -15 || model.number == 15){
            counterView.changeCountColor(Color.GREEN)
        }else{
            counterView.changeCountColor(Color.WHITE)
        }
    }


}