package kz.education.stepclasswork5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var button : Button? = null;
    var buttonTest : Button? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonTest = findViewById(R.id.activity_main_button_test);

        buttonTest?.setOnClickListener(View.OnClickListener {
            button!!.setText("test");
        })

    }
}