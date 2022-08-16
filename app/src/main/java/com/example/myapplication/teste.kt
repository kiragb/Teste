package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import android.widget.ArrayAdapter
import android.widget.ListView

class teste {
    private var lvHomePage: ListView? = null
    private var items: Array<String>
    private val view: View? = null
    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)

        items = view!!.resources.getStringArray(R.array.test)

        lvHomePage = view.findViewById<View>(R.id.lvHomePage) as ListView

        lvHomePage!!.adapter = ArrayAdapter(
            view.context,
            android.R.layout.simple_list_item_1, items
        )
    }
}