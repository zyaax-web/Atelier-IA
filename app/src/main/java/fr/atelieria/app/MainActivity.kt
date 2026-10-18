package fr.atelieria.app

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.graphics.Color
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.view.Gravity
import android.os.Handler
import android.os.Looper

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.rgb(25, 15, 35)
        window.navigationBarColor = Color.rgb(16, 13, 23)
        window.decorView.systemUiVisibility = 0
        val root = FrameLayout(this)
        root.setBackgroundColor(Color.rgb(16, 13, 23))
        val splash = FrameLayout(this)
        splash.setBackgroundColor(Color.rgb(20, 14, 31))
        val title = TextView(this).apply {
            text = "✦  Atelier IA"
            textSize = 32f
            setTextColor(Color.rgb(246, 133, 190))
            gravity = Gravity.CENTER
        }
        val subtitle = TextView(this).apply {
            text = "Photos • Vidéos • Créations IA\nDonne vie à ton imagination"
            textSize = 16f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }
        splash.addView(title, FrameLayout.LayoutParams(-1, -2, Gravity.CENTER))
        val subParams = FrameLayout.LayoutParams(-1, -2, Gravity.CENTER)
        subParams.topMargin = 105
        splash.addView(subtitle, subParams)
        root.addView(splash)
        setContentView(root)
        Handler(Looper.getMainLooper()).postDelayed({
            val web = WebView(this)
            web.setBackgroundColor(Color.rgb(16, 13, 23))
            web.settings.javaScriptEnabled = true
            web.settings.domStorageEnabled = true
            web.settings.allowFileAccess = true
            web.webViewClient = WebViewClient()
            web.webChromeClient = WebChromeClient()
            web.loadUrl("file:///android_asset/index.html")
            root.removeAllViews()
            root.addView(web, FrameLayout.LayoutParams(-1, -1))
        }, 1200)
    }
}
