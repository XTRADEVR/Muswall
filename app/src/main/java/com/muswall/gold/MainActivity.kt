package com.muswall.gold
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        val tv = TextView(this).apply { text = "MUSWALL GOLD REAL\n\n1. Klik AKTIFKAN\n2. Centang Muswall Gold\n3. Putar Spotify & Kunci HP\n\nXiaomi: Info App > Baterai > Jangan Batasi"; textSize = 15f; setPadding(40,120,40,40) }
        val btn = Button(this).apply { text = "AKTIFKAN IZIN"; setOnClickListener { startActivity(Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)) } }
        val lay = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; addView(tv); addView(btn) }
        setContentView(lay)
    }
}
