package com.csuf.livedemo_rest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

class RenderedMemeFragment: Fragment() {

    private lateinit var memerViewModel: MemerViewModel
    private lateinit var captionInput : TextView
    private lateinit var captionButton : Button
    private lateinit var captionedMemeImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.memerViewModel = ViewModelProviders.of(this).get(MemerViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.renderered_meme_layout,container,false)
        this.captionInput  = view.findViewById(R.id.caption_text)
        this.captionButton = view.findViewById(R.id.caption_btn)
        this.captionedMemeImage = view.findViewById(R.id.rendered_img)

        return view
    }
}