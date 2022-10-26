package com.csuf.livedemo_rest

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class MemeTemplatesFragment: Fragment() {

    private lateinit var memerViewModel: MemerViewModel
    private lateinit var memeTemplateImage: ImageView
    private lateinit var prevButton:Button
    private lateinit var nextButton:Button
    private lateinit var memeTemplateIndexLabel:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.memerViewModel =   ViewModelProviders.of(this)
                                        .get(MemerViewModel::class.java)
    }
}