package com.sultan.scheduler.auth.register.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.sultan.scheduler.R
import com.sultan.scheduler.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    private val binding by viewBinding<FragmentRegistrationBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}