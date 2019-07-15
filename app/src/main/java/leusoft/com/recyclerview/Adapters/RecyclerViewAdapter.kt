package leusoft.com.recyclerview.Adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import leusoft.com.recyclerview.R
import leusoft.com.recyclerview.Models.Entry

class RecyclerViewViewHolder(view: View):RecyclerView.ViewHolder(view){
    var video:VideoView = view.findViewById(R.id.videoView2)
    var title:TextView = view.findViewById(R.id.titleField)
}
class RecyclerViewAdapter(private var listEntry:ArrayList<Entry>) : RecyclerView.Adapter<RecyclerViewViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return RecyclerViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return if(listEntry.isNotEmpty()) listEntry.size else 0
    }
    fun loadNewData(newEntries:ArrayList<Entry>){
        listEntry=newEntries
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        val videoItem = listEntry[position].videoURL
        holder.video.setVideoPath(videoItem)
        holder.video.start()
        holder.title.setText(listEntry[position].exerciseTitle)
    }
}