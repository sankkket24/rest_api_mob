package com.csuf.livedemo_rest

import androidx.lifecycle.ViewModel

class MemerViewModel : ViewModel() {

    private var templateIdx: Int = 0

    fun setTemplateIdx(index:Int){
        this.templateIdx = index
    }

    fun getTemplateIndex():Int{
        return this.templateIdx
    }
}