package my.edu.tarc.recycleviewdemorsd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.recycleviewdemorsd.data.Product
import my.edu.tarc.recycleviewdemorsd.data.ProductAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList : List<Product> = listOf(
            Product("Apple", 2.50, R.drawable.ic_baseline),
            Product("Orange", 3.50, R.drawable.ic_baseline_account),
            Product("Durrian", 50.50, R.drawable.ic_launcher_foreground)
            )
            val recycleView :RecyclerView = findViewById(R.id.myRecycleView)
            recycleView.adapter = ProductAdapter(productList)
            recycleView.setHasFixedSize(true)
        }
    }