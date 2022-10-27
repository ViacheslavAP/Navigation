package ru.perelyginva.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ru.perelyginva.navigation.databinding.FragmentAccauntBinding


class Account : Fragment() {

    private var binding: FragmentAccauntBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAccauntBinding.inflate(inflater, container, false)

        binding?.account?.setOnClickListener(View.OnClickListener {

            view?.findNavController()?.navigate(R.id.action_accaunt_to_home2)
        })

        return binding?.root
    }


}