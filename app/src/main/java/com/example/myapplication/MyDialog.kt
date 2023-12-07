package com.example.myapplication

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class MyDialog : DialogFragment() {
    // onCreateView
    /*override fun onCreateDialog(savedInstanceState: Bundle?) =
        AlertDialog.Builder(context)
            .setMessage("Какое-то сообщение!")
            .setPositiveButton("Ok"){ _,_ -> }
            .setNegativeButton("Cancel"){ _,_ -> }
            .create()


     */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.mydialog,container,false)
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            // логика
        }
        return view
    }

    companion object {
        const val TAG = "MyDialog"
    }
}