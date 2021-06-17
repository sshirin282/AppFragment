package com.example.myappfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var recycleView: RecyclerView
        lateinit var adapter: RecyAdapter
        val name= arrayOf<String>("Apple", "Banana", "Guavas", "Kiwi", "Lemon", "Mango", "Orange", "Watermelon","Pomegranate","Muskmelon","Cherry")
        val des= arrayOf<String>("Apple trees are large if grown from seed. Generally, apple cultivars are propagated by grafting onto rootstocks, which control the size of the resulting tree.",
            "Bananas are among the most important food crops on the planet.","Guavas are tropical trees originating in Central America.",
            "Kiwifruit is native to central and eastern China.", "The tree's ellipsoidal yellow fruit is used for culinary and non-culinary purposes throughout the world, primarily for its juice,",
            " mango is an edible stone fruit produced by the tropical tree Mangifera indica which is believed to have originated from the region between northwestern Myanmar, Bangladesh, and northeastern India.",
            "The orange originated in a region encompassing Southern China, Northeast India, and Myanmar,","Watermelon (Citrullus lanatus) is a flowering plant species of the Cucurbitaceae family."
            ,"The pomegranate (Punica granatum) is a fruit-bearing deciduous shrub in the family Lythraceae, subfamily Punicoideae, that grows between 5 and 10 m ",
            "Cucumis melo, also known as melon,[2][3] is a species of Cucumis that has been developed into many cultivated varieties. The fruit is a pepo",
            "A cherry is the fruit of many plants of the genus Prunus, and is a fleshy drupe (stone fruit).")
        val image= arrayOf<Int>(R.drawable.apple,R.drawable.banana,R.drawable.gavava,R.drawable.kiwi,
            R.drawable.lemon,R.drawable.mango,R.drawable.orange,R.drawable.watermelon, R.drawable.pomo, R.drawable.melon,R.drawable.cherry)
        recycleView=view.findViewById(R.id.rec)
        adapter= RecyAdapter(context,name,des,image)
        val layoutManager= LinearLayoutManager(activity)
        recycleView.layoutManager=layoutManager
        recycleView.adapter=adapter

    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}