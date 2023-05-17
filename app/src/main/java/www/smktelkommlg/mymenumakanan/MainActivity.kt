package www.smktelkommlg.mymenumakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickListener();
    }
    public fun clickListener(){
        var imageNasgor = findViewById<ImageView>(R.id.ivNasgor);
        var imageSteak = findViewById<ImageView>(R.id.ivSteak);
        var imageBakso = findViewById<ImageView>(R.id.ivBakso);
        var imageRamen = findViewById<ImageView>(R.id.ivRamen);
        var imageSushi = findViewById<ImageView>(R.id.ivSushi);
        var imageTtopoki = findViewById<ImageView>(R.id.ivTtopoki);



        imageNasgor.setOnClickListener {
            openNasgorActivity()
        }
        imageSteak.setOnClickListener {
            openSteakActivity()
        }
        imageBakso.setOnClickListener {
            openBaksoActivity()
        }
        imageRamen.setOnClickListener {
            openRamenActivity()
        }
        imageSushi.setOnClickListener {
            openSushiActivity()
        }
        imageTtopoki.setOnClickListener {
            openTtopokiActivity()
        }

    }
    public fun openNasgorActivity(){
        startActivity(Intent(this@MainActivity, NasgorActivity::class.java))
    }
    public fun openSteakActivity(){
        startActivity(Intent(this@MainActivity, SteakActivity::class.java))
    }
    public fun openBaksoActivity(){
        startActivity(Intent(this@MainActivity, BaksoActivity::class.java)
        )
    }
    public fun openRamenActivity(){
        startActivity(Intent(this@MainActivity, RamenActivity::class.java))
    }
    public fun openSushiActivity(){
        startActivity(Intent(this@MainActivity, SushiActivity::class.java))
    }
    public fun openTtopokiActivity(){
        startActivity(Intent(this@MainActivity, TtopokiActivity::class.java))
    }
}
