package my.edu.tarc.recycleviewdemorsd.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.recycleviewdemorsd.R


class ProductAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.myViewHolder>(){

    class myViewHolder (itemView:View): RecyclerView.ViewHolder(itemView){
        val tvName :TextView = itemView.findViewById(R.id.tvName)
        val tvPrice : TextView = itemView.findViewById(R.id.tvPrice)
        val img : ImageView = itemView.findViewById(R.id.imageProduct)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(
           R.layout.product_item, parent, false)
        return myViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: myViewHolder, position: Int){
        val currentProduct = productList[position]
        holder.tvName.text = currentProduct.name
        holder.tvPrice.text = currentProduct.price.toString()
        holder.img.setImageResource(currentProduct.img)
    }
    override fun getItemCount(): Int{
      return productList.size
    }
}