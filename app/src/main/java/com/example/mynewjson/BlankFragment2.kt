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
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {
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
        val recyclerView:RecyclerView=view.findViewById(R.id.fragmentRecyclerview2)
        var adapter:adapter2
        val i:Int=0
        val list:ArrayList<Datamodel2> = ArrayList<Datamodel2>()
        val url:String="https://jsonplaceholder.typicode.com/posts"

        val request:StringRequest= StringRequest(Request.Method.GET,url,{
            Log.e("sss",it)
            val jsonArray:JSONArray= JSONArray(it)
            for (i in 0 until jsonArray.length()){
                val jsonObject:JSONObject=jsonArray.getJSONObject(i)

               val userId:String=jsonObject.getString("userId")
                val id :String=jsonObject.getString("id")
                val title:String=jsonObject.getString("title")
                val body:String=jsonObject.getString("body")

                var datamodel2=Datamodel2()
               datamodel2.userId=userId
                datamodel2.id=id
                datamodel2.title=title
                datamodel2.body=body
                list.add(datamodel2)
            }
            adapter= adapter2(context!!,list)
            val layoutManager= LinearLayoutManager(context)
            recyclerView.layoutManager=layoutManager
            recyclerView.adapter=adapter


        },Response.ErrorListener {
         Log.e("kkkk", it.toString())
        })
        val queue=Volley.newRequestQueue(context)
        queue.add(request)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}