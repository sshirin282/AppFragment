package com.example.myappfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CursorAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var imageView1:ImageView=view.findViewById(R.id.image1)
        var imageView2:ImageView=view.findViewById(R.id.image2)
        var imageView3:ImageView=view.findViewById(R.id.image3)
        var imageView4:ImageView=view.findViewById(R.id.image4)
        var textView1:TextView=view.findViewById(R.id.text1)
        var textView2:TextView=view.findViewById(R.id.text2)
        var textView3:TextView=view.findViewById(R.id.text3)
        var textView4:TextView=view.findViewById(R.id.text4)
        var gridView:GridView=view.findViewById(R.id.grid)
        val name= arrayOf<String>("Electronic Item", "Mobile Accessories", "Air Ticket Booking"," Train Ticket Booking",
        "Money Tranfer","Account Opening")
        val image1= arrayOf<Int>(R.drawable.ic_baseline_electrical_services_24,R.drawable.ic_baseline_mobile_friendly_24,
        R.drawable.ic_baseline_local_airport_24,R.drawable.ic_baseline_train_24,
        R.drawable.ic_baseline_attach_money_24,R.drawable.ic_baseline_account_box_24)

        val adapter:customAdapter
        adapter= customAdapter(context,name,image1)

        gridView.adapter=adapter

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}