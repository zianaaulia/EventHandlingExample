package zianaaulia.polbeng.ac.id.eventhandlingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Menampilkan pesan setelah di klik
        btnDisplayMessage.setOnClickListener {
            Toast.makeText(
                applicationContext, "Hello World",
                Toast.LENGTH_LONG
            ).show()
        }
        //Fungsi untuk menangani event onLongClickListener
        btnDisplayMessage.setOnLongClickListener {
            Snackbar.make(root_layout, "Long click",
                Snackbar.LENGTH_LONG).show()
            true
        }
    }
}