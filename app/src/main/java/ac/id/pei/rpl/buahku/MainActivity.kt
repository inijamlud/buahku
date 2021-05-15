package ac.id.pei.rpl.buahku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val berita :LinearLayout = findViewById(R.id.berita)
        val menu1 :LinearLayout = findViewById(R.id.menu1)
        val menu2 :LinearLayout = findViewById(R.id.menu2)

        berita.setOnClickListener{
            startActivity(Intent(this, Berita::class.java))
        }

        menu1.setOnClickListener{
            startActivity(Intent(this, Jenis::class.java))
        }

        menu2.setOnClickListener{
            startActivity(Intent(this, Buah::class.java))
        }

    }
}