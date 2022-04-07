package zianaaulia.polbeng.ac.id.eventhandlingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Menampilkan pesan setelah di klik
        btnDisplayMessage.setOnClickListener {
            Toast.makeText(
                applicationContext, "Ziana Aulia",
                Toast.LENGTH_LONG
            ).show()
        }
        //Fungsi untuk menangani event onLongClickListener
        btnDisplayMessage.setOnLongClickListener(object: View.OnLongClickListener
        {
            override fun onLongClick(v: View?): Boolean {
                return true
            }
        })
    }
}