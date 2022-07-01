package com.example.rnintegration

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactRootView


class ReactFragment : Fragment() {

    private lateinit var reactRootView: ReactRootView
    private lateinit var reactInstanceManager: ReactInstanceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        reactRootView = ReactRootView(activity)
        reactInstanceManager =
            (activity?.application as MyReactApplication).reactNativeHost.reactInstanceManager
        return reactRootView


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("fragment created..................")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        reactRootView = ReactRootView(context)
        reactInstanceManager =
            (activity?.application as MyReactApplication).reactNativeHost.reactInstanceManager

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val initialProperties =  arguments as Bundle
        Toast.makeText(context, initialProperties.toString(), Toast.LENGTH_SHORT).show()
        reactRootView.startReactApplication(
            reactInstanceManager,
            "MyReactNativeFragment",
            initialProperties
        )

    }


}