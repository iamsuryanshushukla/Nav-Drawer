package com.example.demoproject.ui.home

import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigation.Fragments.CallFragment
import com.example.bottomnavigation.Fragments.ChatsFragment
import com.example.bottomnavigation.Fragments.StatusFragment
import com.example.demoproject.R
import com.example.demoproject.ViewpagetAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
    private lateinit var adapter1: ArrayAdapter<*>

//    private var _binding: FragmentHomeBinding? = null
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.fragment_home,container,false)

//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//        val root: View = binding.root
        view.viewpager.adapter = ViewpagetAdapter(childFragmentManager)
        (activity as AppCompatActivity).supportActionBar?.show()
//        he we are calling toolbar from main activity

        return view


    }




}