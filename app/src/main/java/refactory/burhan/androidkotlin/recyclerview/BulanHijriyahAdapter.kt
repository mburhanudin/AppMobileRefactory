package refactory.burhan.androidkotlin.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.bulan_hijriyah_list_item.view.*
import refactory.burhan.androidkotlin.R

class BulanHijriyahAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvNamaBulanHijriyah?.text = items.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.bulan_hijriyah_list_item, parent, false))

    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val tvNamaBulanHijriyah = view.tv_nama_blnhijriah
}