package com.diksha.databindingdemoexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.diksha.databindingdemoexample.databinding.ActivityMainBinding
import com.diksha.databindingdemoexample.model.Profile

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // Data binding library takes the name of the xml layout,
    // make first letter of each name capital, removes underscore and adds “Binding” to the end.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        ) // Construct the data binding instance and replace the default constructor
        binding.profileData = getProfileData()
    }

    // This binding class facilitates us to set values to and get values from each property in the layout.
    private fun getProfileData(): Profile? {
        return Profile(
            "DP13",
            "john doe",
            "jd@yahoo.com",
            "Android Developer",
            true
        )
    }
}