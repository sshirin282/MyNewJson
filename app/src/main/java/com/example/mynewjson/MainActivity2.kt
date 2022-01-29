package com.example.mynewjson
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        bottomNavigationView=findViewById(R.id.bottomnavigation)


        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.first -> {
                    val fragment1 = BlankFragment1()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment1)
                        .commit()
                    true
                }
                R.id.second -> {
                    val fragment2 = BlankFragment2()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment2)
                        .commit()
                    true
                }
                R.id.third -> {
                    val fragment3 = BlankFragment3()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment3)
                        .commit()
                    true
                }
                R.id.fourth -> {
                    val fragment4 = BlankFragment4()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment4)
                        .commit()
                    true
                }
                R.id.fifth -> {
                    val fragment5 = BlankFragment5()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment5)
                        .commit()
                    true
                }
                else -> false

            }

//        bottomNavigationView.setOnNavigationItemReselectedListener {
//            when (it.itemId){
//                R.id.first ->{
//                    val fragment1= BlankFragment1()
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment1).commit()
//                }
//                R.id.second->{
//                    val fragment2=BlankFragment2()
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment2).commit()
//                }
//                R.id.third->{
//                    val fragment3=BlankFragment3()
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment3).commit()
//                }
//                R.id.fourth->{
//                    val fragment4=BlankFragment4()
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment4).commit()
//                }
//                R.id.fifth->{
//                    val fragment5= BlankFragment5()
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment5).commit()
//                }
//                else-> false
//
//            }
//        }

//        bottomNavigationView.setOnClickListener {
//            val fragment=BlankFragment1()
//            supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment).commit()
//
//        }
        }
        }
}