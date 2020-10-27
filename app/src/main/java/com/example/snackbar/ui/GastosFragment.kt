package com.example.snackbar.ui

import android.content.Context
import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snackbar.R
import kotlinx.android.synthetic.main.fragment_gasto.*
import kotlinx.android.synthetic.main.fragment_gasto.view.*
import java.time.LocalDateTime

class GastosFragment : Fragment() {

    private lateinit var ctx: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainActivity) ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_gasto, container, false)

        root.btnTest.setOnClickListener {
            ctx.cadastrarGasto(
                root.txtDescription.text.toString(),
                root.txtCategory.text.toString(),
                root.txtDateTime.text.toString(),
                root.txtPrice.text.toString().toDouble()
            )
        }

        return root
    }

    companion object {
        fun newInstance() = GastosFragment()
    }
}