package com.ctt.minhastarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.ctt.minhastarefas.adapters.PageAdapter
import com.ctt.minhastarefas.bottomSheet.NovaTarefa
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    private lateinit var botaoAdicionar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        viewPager.adapter = PageAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)

        botaoAdicionar = findViewById(R.id.fabAdd)
        botaoAdicionar.setOnClickListener {
           val bottonSheet = NovaTarefa()
            bottonSheet.show(supportFragmentManager, bottonSheet.tag)
        }

    }

}