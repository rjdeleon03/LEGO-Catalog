package com.rjdeleon.legocatalog.legotheme.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider

import com.rjdeleon.legocatalog.R
import com.rjdeleon.legocatalog.di.Injectable
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class LegoThemeFragment : Fragment(), Injectable {

    @Inject lateinit var mViewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_themes, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }
}
