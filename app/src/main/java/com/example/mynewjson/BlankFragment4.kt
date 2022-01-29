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
 * Use the [BlankFragment4.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment4 : Fragment() {
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

        val recyclerView:RecyclerView=view.findViewById(R.id.fragmentRecyclerview4)
        var adapter:adapter4
        val i:Int=0
        val list:ArrayList<Datamodel2> = ArrayList<Datamodel2>()
        val url:String="https://jsonplaceholder.typicode.com/todos"

        val request:StringRequest= StringRequest(Request.Method.GET,url,{
            Log.e("shirin",it)
            val jsonArray:JSONArray= JSONArray(it)
            for (i in 0 until jsonArray.length()){
                val j: JSONObject =jsonArray.getJSONObject(i)
                val userId:String=j.getString("userId")
                val title:String=j.getString("title")
                val id:String=j.getString("id")
                val completed:String=j.getString("completed")

                val datamodel2=Datamodel2()
                datamodel2.id=id
               datamodel2.userId=userId
                datamodel2.title=title
                datamodel2.completed=completed
                list.add(datamodel2)
            }

            adapter=adapter4(context!!,list)
            val layoutManager= LinearLayoutManager(context)
            recyclerView.layoutManager=layoutManager
            recyclerView.adapter=adapter


        },Response.ErrorListener {
          Log.e("khan", it.toString())
        })
        val queue=Volley.newRequestQueue(context)
        queue.add(request)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank4, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment4.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment4().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}


