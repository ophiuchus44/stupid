package com.example.fuck2

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.core.view.GestureDetectorCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fuck2.databinding.FragmentCurrBinding


class CurrFragment : Fragment() {

    private var _binding: FragmentCurrBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: SharedViewModel by activityViewModels()
//    private val mDetector: MyGestureDetector? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        mDetector = GestureDetectorCompat(Context, MyGestureDetector())
        // Inflate the layout for this fragment

        _binding = FragmentCurrBinding.inflate(inflater, container, false)



        sharedViewModel.swipeDir.observe(viewLifecycleOwner) { swipeDir ->
            binding.textView.text = swipeDir
        }

        updateSharedView("kadf")
        return binding.root

    }

    fun updateSharedView(dir: String){
        sharedViewModel.saveSwipeDir(dir)
    }

}
