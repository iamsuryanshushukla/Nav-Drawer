package com.example.bottomnavigation.Fragments

import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.SearchView.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.demoproject.R
import kotlinx.android.synthetic.main.fragment_chats.*

class ChatsFragment : Fragment() {
    private lateinit var adapter1:ArrayAdapter<*>


//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).supportActionBar?.title="First"
        val view = inflater.inflate(R.layout.fragment_chats, container, false)
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter1 = ArrayAdapter((activity as AppCompatActivity),android.R.layout.simple_list_item_1,resources.getStringArray(R.array.countries))
        list_view.adapter = adapter1

    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        here we are inflating the searchbar
//        inflater.inflate(R.menu.searchbar_menu,menu)
        searchmenu.setOnQueryTextListener(object : OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                adapter1.filter.filter(p0)
                return false
            }
        })
//        val search = menu?.findItem(R.id.nav_search)
//        val searchView = search?.actionView as SearchView
//        searchView.queryHint="Search something"
//        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                adapter1.filter.filter(newText)
//                return false
//            }

//        })
        super.onCreateOptionsMenu(menu, inflater)
    }
}