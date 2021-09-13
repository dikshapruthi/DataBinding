package com.diksha.databindingdemoexample.util

object MyStringUtils {

    @JvmStatic
    fun capitalize(string: String): String {

        var upperString: String = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase()
        return upperString
    }
}