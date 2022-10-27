package ru.perelyginva.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ru.perelyginva.navigation.databinding.FragmentHomeBinding


class Home : Fragment() {
    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding?.home?.setOnClickListener(View.OnClickListener {
            view?.findNavController()?.navigate(R.id.action_home2_to_catalog)
        })

        return binding?.root
    }


}