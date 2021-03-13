package com.ctt.minhastarefas.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ctt.minhastarefas.fragments.AFazerFragments
import com.ctt.minhastarefas.model.Tarefas

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    // equivalente ao ItemConut da RV
    // Numero de FRAGMENTS  a serem colocadas
    override fun getCount(): Int {
        return 3
    }

    // relação entre ITEM/POSIÇÃO  a FRAGMENT a ser exibida
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> AFazerFragments()
            1 -> AFazerFragments()
            2 -> AFazerFragments()
            else -> AFazerFragments()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "A fazer"
            1 -> "Em progresso"
            2 -> "Feitas"
            else -> super.getPageTitle(position)
        }
    }
}

