package refactory.burhan.androidkotlin.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import refactory.burhan.androidkotlin.R

class FragmentActivity : AppCompatActivity() {
    var isFragmentOneLoaded = true
    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val Change = findViewById<Button>(R.id.btn_change)
        ShowFragmentOne()

        Change.setOnClickListener({if(isFragmentOneLoaded)
            ShowFragmentTwo()
        else
            ShowFragmentOne()})

    }
    fun ShowFragmentOne(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentOne()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = true
    }
    fun ShowFragmentTwo(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentTwo()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = false
    }
}