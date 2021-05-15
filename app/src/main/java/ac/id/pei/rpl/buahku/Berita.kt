package ac.id.pei.rpl.buahku

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class Berita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.berita)

        val webv :WebView = findViewById(R.id.webView)

        webv.settings.javaScriptCanOpenWindowsAutomatically = true
        webv.loadUrl("https://www.freshfruitportal.com")
    }
}