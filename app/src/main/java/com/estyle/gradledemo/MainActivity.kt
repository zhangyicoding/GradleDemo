package com.estyle.gradledemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.pm.PackageManager
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appInfo = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
        val umengChannel = appInfo.metaData.getString("UMENG_CHANNEL")
        Toast.makeText(this, umengChannel, Toast.LENGTH_LONG).show()
    }
}
