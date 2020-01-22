package com.example.lenovo.emptypro.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lenovo.emptypro.R
import android.webkit.WebSettings.PluginState
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_web_url.*
import java.lang.Exception


class WebUrlActivity : AppCompatActivity() {
    var recievedFrom = ""
    var strWebUrl = ""
    var simpleTxt = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_url)
        try {
            recievedFrom = intent.extras.getString("from")
            webVw_url.visibility=View.VISIBLE
            tv_aboutUs.visibility=View.GONE
            if (recievedFrom.equals("terms")) {
                strWebUrl = "http://www.vlovepets.com/terms/"
                webVw_url.settings.javaScriptEnabled = true
                webVw_url.settings.pluginState = PluginState.ON
                setContentView(webVw_url)
                webVw_url.loadUrl(strWebUrl)
            } else if (recievedFrom.equals("privacy")) {
                strWebUrl = "http://www.vlovepets.com/privacy/"
                webVw_url.settings.javaScriptEnabled = true
                webVw_url.settings.pluginState = PluginState.ON
                setContentView(webVw_url)
                webVw_url.loadUrl(strWebUrl)
            } else if (recievedFrom.equals("about")) {
                webVw_url.visibility=View.GONE
                tv_aboutUs.visibility=View.VISIBLE
            }


        } catch (exp: Exception) {

        }


    }
}
