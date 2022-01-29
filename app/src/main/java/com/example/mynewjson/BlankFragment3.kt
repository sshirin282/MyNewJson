package com.example.mynewjson

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment3.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment3 : Fragment() {
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView:RecyclerView=view.findViewById(R.id.fragmentRecyclerview3)
        var adapter:adapter3
        val i:Int=0
        val list:ArrayList<DataModel3> = ArrayList<DataModel3>()
        val url:String="https://rickandmortyapi.com/api/character/"

        val request:StringRequest= StringRequest(Request.Method.GET,url,{
            Log.e("shirin",it)
            val js:JSONObject= JSONObject(it)
            val jb:JSONArray=js.getJSONArray("results")

            for (i in 0 until jb.length()){
                val j:JSONObject=jb.getJSONObject(i)
                val id:String=j.getString("id")
                val name:String=j.getString("name")
                val status:String=j.getString("status")
                val species:String=j.getString("species")
                val type:String=j.getString("type")
                val gender:String=j.getString("gender")
                val image:String=j.getString("image")

                val dataModel3=DataModel3()
                dataModel3.id=id
                dataModel3.name=name
                dataModel3.status=status
                dataModel3.species=species
                dataModel3.type=type
                dataModel3.gender=gender
                dataModel3.image=image
                list.add(dataModel3)
            }

            adapter=adapter3(context!!,list)
            val layoutManager= LinearLayoutManager(context)
            recyclerView.layoutManager=layoutManager
            recyclerView.adapter=adapter


        },Response.ErrorListener {

        })
        val queue=Volley.newRequestQueue(context)
        queue.add(request)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank3, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment3.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment3().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}