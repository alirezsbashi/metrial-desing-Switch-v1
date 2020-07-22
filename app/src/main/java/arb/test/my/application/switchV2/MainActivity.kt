package arb.test.my.application.switchV2

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.ghyeok.stickyswitch.widget.StickySwitch
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sticky_switch.setOnClickListener(object : StickySwitch.OnSelectedChangeListener, View.OnClickListener {
            override fun onSelectedChange(direction: StickySwitch.Direction, text: String) {}

            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity,"${sticky_switch.getText()}",Toast.LENGTH_SHORT).show()
            }

        })

    }
}
