package com.example.demoproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.bottomnavigation.Fragments.CallFragment
import com.example.bottomnavigation.Fragments.ChatsFragment
import com.example.bottomnavigation.Fragments.StatusFragment

class ViewpagetAdapter(supportFragmentManager: FragmentManager):FragmentPagerAdapter(supportFragmentManager){
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                ChatsFragment()
            }
            1 ->{
                CallFragment()
            }
            2 -> {
                StatusFragment()
            }
            else->{
                ChatsFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when(position){
            0->{
                "Chats"
            }
            1->{
                "Calls"
            }
            2->{
                "Status"
            }
            else->{
                "Chats"
            }
        }
    }



}