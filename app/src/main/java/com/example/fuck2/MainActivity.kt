package com.example.fuck2

//import android.databinding.tool.Binding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.fuck2.databinding.ActivityMainBinding

//import com.example.fuck2.databinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    lateinit var mDetector: GestureDetectorCompat

//    lateinit var sharedViewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.fragment)

        setupActionBarWithNavController(navController)

        mDetector = GestureDetectorCompat(this, MyGestureDetector())

//        this.sharedViewModel.saveSwipeDir("started")

//        sharedViewModel.saveSwipeDir("started")


    }

    override fun onSupportNavigateUp(): Boolean {

        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        mDetector.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
}