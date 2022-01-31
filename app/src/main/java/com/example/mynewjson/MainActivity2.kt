package com.example.mynewjson
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var navigation:NavigationView
//    lateinit var toggle: ActionBarDrawerToggle
//    lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        bottomNavigationView=findViewById(R.id.bottomnavigation)
//        navigation=findViewById(R.id.navigationview)
//        drawerLayout=findViewById(R.id.drawer)
//
//        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        toggle.isDrawerIndicatorEnabled = true


        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.first -> {
                    //navigation.setCheckedItem(R.id.first)
                    val fragment1 = BlankFragment1()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment1)
                        .commit()
                    true
                }
                R.id.second -> {
                   // navigation.setCheckedItem(R.id.second)
                    val fragment2 = BlankFragment2()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment2)
                        .commit()
                    true
                }
                R.id.third -> {
                    //navigation.setCheckedItem(R.id.third)
                    val fragment3 = BlankFragment3()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment3)
                        .commit()
                    true
                }
                R.id.fourth -> {
                  //  navigation.setCheckedItem(R.id.fourth)
                    val fragment4 = BlankFragment4()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment4)
                        .commit()
                    true
                }
                R.id.fifth -> {
                   // navigation.setCheckedItem(R.id.fifth)
                    val fragment5 = BlankFragment5()
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment5)
                        .commit()
                    true
                }
                else -> false

            }
        }
//        navigation.setNavigationItemSelectedListener { menuItem->
//            when(menuItem.itemId) {
//                R.id.first -> {
//                    val fragment1 = BlankFragment1()
//                    bottomNavigationView.setSelectedItemId(R.id.first)
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment1)
//                        .commit()
//                    true
//                }
//                R.id.second -> {
//                    val fragment2 = BlankFragment2()
//                    bottomNavigationView.setSelectedItemId(R.id.second)
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment2)
//                        .commit()
//                    true
//                }
//                R.id.third -> {
//                    val fragment3 = BlankFragment3()
//                    bottomNavigationView.setSelectedItemId(R.id.third)
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment3)
//                        .commit()
//                    true
//                }
//                R.id.fourth -> {
//                    val fragment4 = BlankFragment4()
//                    bottomNavigationView.setSelectedItemId(R.id.fourth)
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment4)
//                        .commit()
//                    true
//                }
//                R.id.fifth -> {
//                    val fragment5 = BlankFragment5()
//                    bottomNavigationView.setSelectedItemId(R.id.fifth)
//                    supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment5)
//                        .commit()
//                    true
//                }
//            }
//                    menuItem.isChecked = true
//                    drawerLayout.closeDrawers()
//                    true
//                }
           }
        }
