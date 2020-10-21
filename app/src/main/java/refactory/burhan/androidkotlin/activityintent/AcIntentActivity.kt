package refactory.burhan.androidkotlin.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import refactory.burhan.androidkotlin.R
import refactory.burhan.androidkotlin.hellorefactory.HelloRefactoryActivity

class AcIntentActivity : AppCompatActivity() {

    val TAG ="AcIntenActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_intent)
        Log.d(TAG, "onCreate")

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var i = Intent(this, HelloRefactoryActivity::class.java)
            startActivity(i)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}