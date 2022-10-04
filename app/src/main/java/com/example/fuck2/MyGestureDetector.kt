package com.example.fuck2

//import android.databinding.tool.Context
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import androidx.core.view.get
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.fuck2.databinding.ActivityMainBinding
import com.example.fuck2.databinding.FragmentCurrBinding
import kotlinx.coroutines.withContext

class MyGestureDetector: GestureDetector.SimpleOnGestureListener() {

    /* Minimal x and y axis swipe distance. */
    private val sharedViewModel: SharedViewModel? = null

    private val MIN_SWIPE_DISTANCE_X = 100
    private val MIN_SWIPE_DISTANCE_Y = 100

    // Maximal x and y axis swipe distance.
    private val MAX_SWIPE_DISTANCE_X = 1000
    private val MAX_SWIPE_DISTANCE_Y = 1000
//    val fragment : FragmentCurrBinding? = null



    /* This method is invoked when a swipe gesture happened. */
    override fun onFling(
        e1: MotionEvent,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
//        lateinit var sharedViewModel: SharedViewModel


        // Get swipe delta value in x axis.
        val deltaX = e1.x - e2.x

        // Get swipe delta value in y axis.
        val deltaY = e1.y - e2.y

        // Get absolute value.
        val deltaXAbs = Math.abs(deltaX)
        val deltaYAbs = Math.abs(deltaY)



        // Only when swipe distance between minimal and maximal distance value then we treat it as effective swipe
        if (deltaXAbs >= MIN_SWIPE_DISTANCE_X && deltaXAbs <= MAX_SWIPE_DISTANCE_X) {
            if (deltaX > 0) {
                Log.d("swiper","Swipe to left")
//                swipeDir = "left"
                sharedViewModel?.saveSwipeDir("left")



            } else {
//                    activity.displayMessage("Swipe to right")
                Log.d("swiper","Swipe to right")
//                swipeDir = "right"
//                sharedViewModel
//                sharedViewModel.saveSwipeDir("right")
            }
        }
        if (deltaYAbs >= MIN_SWIPE_DISTANCE_Y && deltaYAbs <= MAX_SWIPE_DISTANCE_Y) {
            if (deltaY > 0) {
//                    activity.displayMessage("Swipe to up")
                Log.d("swiper","Swipe to up")
//                swipeDir = "up"
//                sharedViewModel.saveSwipeDir("up")
            } else {
//                    activity.displayMessage("Swipe to down")
                Log.d("swiper","Swipe to down")
//                sharedViewModel.saveSwipeDir("down")
//                swipeDir = "down"
            }
        }
        return true
    }

//    // Invoked when single tap screen.
//    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
////            activity.displayMessage("Single tap occurred.")
//        return true
//    }
//
//    // Invoked when double tap screen.
//    override fun onDoubleTap(e: MotionEvent?): Boolean {
////            activity.displayMessage("Double tap occurred.")
//        return true
//    }
}