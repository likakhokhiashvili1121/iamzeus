package com.example.iamzeus

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.iamzeus.Databinding.FragmentCreateBinding


class CreateFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentCreateBinding.bind(view).onViewBind()
    }

    private fun FragmentCreateBinding.onViewBind() {
        val sharedPrefs = activity?.getSharedPreferences("user_data", Context.MODE_PRIVATE)

        save.setOnClickListener {
            val editor = sharedPrefs?.edit()
            editor?.putString("user_name", firstName.text.toString())
            editor?.putString("user_last_name", lastName.text.toString())
            editor?.putString("user_age", age.text.toString())
            editor?.commit()
        }
    }


}


