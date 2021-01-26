package com.example.iamzeus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setPages()
    }

    private fun setPages() {

        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        val fragments = mutableListOf<Fragment>()
        fragments.add(DataFragment())
        fragments.add(CreateFragment())

        val adapter = ViewPagerAdapter(supportFragmentManager, fragments)
        viewPager.adapter = adapter

    }

}