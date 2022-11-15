package com.info.android100example

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class FragmentSecond : Fragment() {

    lateinit var btncall:Button
    lateinit var btnsend:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment



        return inflater.inflate(R.layout.fragment_second, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btnsend = view.findViewById(R.id.btnsend)
        btncall = view.findViewById(R.id.btncall)

        btnsend.setOnClickListener {
            Toast.makeText(requireContext(), "Sorgunuz qebul olundu", Toast.LENGTH_SHORT).show()
        }

        btncall.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+994558444908"))
            startActivity(i)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}