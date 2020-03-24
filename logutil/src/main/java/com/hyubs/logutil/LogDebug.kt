package com.hyubs.logutil

import android.util.Log;

class LogDebug {
    var tag :String = "SUPER_AWESOME_APP";

    fun d(message: String) {
        Log.d(tag, message);
    }
}