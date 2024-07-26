package com.sultan.scheduler.main.main.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.sultan.scheduler.R
import com.sultan.scheduler.databinding.FragmentMainPageBinding


class MainPageFragment : Fragment(R.layout.fragment_main_page) {

    private val binding by viewBinding<FragmentMainPageBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}