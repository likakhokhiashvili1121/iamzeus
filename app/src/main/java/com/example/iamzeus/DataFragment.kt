package com.example.iamzeus

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.iamzeus.databinding.FragmentDataBinding

class DataFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentDataBinding.bind(view).onViewBind()
    }

    private fun FragmentDataBinding.onViewBind() {
        val sharedPref = activity?.getSharedPreferences("user_data", Context.MODE_PRIVATE)

        val firstNamePref = sharedPref?.getString("user_name", "")
        val lastNamePref = sharedPref?.getString("user_last_name", "")
        val agePref = sharedPref?.getString("user_age", "")

        if (firstNamePref?.isEmpty() == true || lastNamePref?.isEmpty() == true || agePref?.isEmpty() == true) {
            Toast.makeText(context, "Information is not entered fully.", Toast.LENGTH_SHORT)
                    .show()
        }

        firstName.text = "Name: $firstNamePref"
        lastName.text = "Last name: $lastNamePref"
        age.text = "Age: $agePref"

    }

}}