package com.example.iamzeus

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(
    fm: androidx.fragment.app.FragmentManager,
    private val fragments: MutableList<Fragment>
) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int) = fragments[position]

    override fun getCount() = fragments.size
}