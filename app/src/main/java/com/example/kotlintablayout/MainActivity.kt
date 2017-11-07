package com.example.kotlintablayout

import android.support.design.widget.TabLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * The [android.support.v4.view.PagerAdapter] that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * [android.support.v4.app.FragmentStatePagerAdapter].
     */
    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        container.adapter = mSectionsPagerAdapter

        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(container))

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Kotlin Testing..", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

    }

    /**
     * A [FragmentPagerAdapter] that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


        override fun getItem(position: Int): Fragment {
            when(position){
                0->{

                    /*val fm = fragmentManager
                    val ft = fm.beginTransaction()
                    val fragA = FragmentA()

                    ft.add(R.id.fragment_container, fragA)
                    ft.commit()*/

/*
                    var fm2 =supportFragmentManager
                    var ft = fm2.beginTransaction()
                    val linearFragment = KotlinFragmentLinear()
                    ft.replace(R.id.fragmentContainer,linearFragment)
                    ft.commit()


                    Log.e("SEONOH","pager position : "+position)*/
                    val linearFragment = KotlinFragmentLinear()
                    return linearFragment

                }
                1->{
                   /* var fm3 =supportFragmentManager
                    var ft1 = fm3.beginTransaction()
                    val gridFragment = KotlinFragmentGrid()
                    ft1.replace(R.id.fragmentContainer,gridFragment)
                    ft1.commit()
                    Log.e("SEONOH","pager position : "+position)*/
                    val gridFragment = KotlinFragmentGrid()
                    return gridFragment
                }
                2->{
                    /*var fm4 =supportFragmentManager
                    var ft2 = fm4.beginTransaction()
                    val staggeredGridFragment = KotlinFragmentStaggeredGrid()
                    ft2.replace(R.id.fragmentContainer,staggeredGridFragment)
                    ft2.commit()*/
                    Log.e("SEONOH","pager position : "+position)
                    val staggeredGridFragment = KotlinFragmentStaggeredGrid()
                    return staggeredGridFragment
                }
            }
            val fragment = KotlinFragmentLinear()
            return fragment
        }

        override fun getCount(): Int {
            return 3
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    class PlaceholderFragment : Fragment() {

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            val rootView = inflater.inflate(R.layout.fragment_kotlin, container, false)
//            rootView.section_label.text = getString(R.string.section_format, arguments.getInt(ARG_SECTION_NUMBER))
            return rootView
        }

        // 외부에서 static형태로 접근 가능
       /* companion object {
            *//**
             * The fragment argument representing the section number for this
             * fragment.
             *//*
            private val ARG_SECTION_NUMBER = "section_number"

            *//**
             * Returns a new instance of this fragment for the given section
             * number.
             *//*
            fun newInstance(sectionNumber: Int): PlaceholderFragment {
                val fragment = PlaceholderFragment()
                val args = Bundle()
                args.putInt(ARG_SECTION_NUMBER, sectionNumber)
                fragment.arguments = args
                return fragment
            }
        }*/
    }
}
