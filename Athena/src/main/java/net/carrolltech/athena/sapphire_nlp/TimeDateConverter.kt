package net.carrolltech.athena.sapphire_nlp

import android.util.Log
import edu.stanford.nlp.time.SUTime

class TimeDateConverter{

    fun testing(string: String){
        var test = "the time is now seven forty six"
        var temp = SUTime.parseDateTime(test)
        Log.d("timedate",temp.timexValue)
    }
    // just use SUTime
}