package ru.perelyginva.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ru.perelyginva.navigation.databinding.FragmentCatalogBinding


class Catalog : Fragment() {

    private var binding: FragmentCatalogBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
      binding = FragmentCatalogBinding.inflate(inflater, container, false)

       binding?.catalog?.setOnClickListener(View.OnClickListener {
           view?.findNavController()?.navigate(R.id.action_catalog_to_accaunt)
       })

        return binding?.root
    }


}