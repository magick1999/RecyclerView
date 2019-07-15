package leusoft.com.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import leusoft.com.recyclerview.Adapters.RecyclerViewAdapter
import leusoft.com.recyclerview.Models.Entry
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val entry= Entry("https://videos.bodybuilding.com/video/mp4/94000/94182m.mp4","BIG BICEPS")
        val entry1= Entry("https://ev.rdtcdn.com/media/videos/201904/20/15940251/480P_600K_15940251.mp4?validfrom=1563212157&validto=1563219357&rate=107k&burst=1800k&hash=bqVF%2BMkuV8sEFFW8nQ2B16mt2Ho%3D","TE AM MEMAT")
        val entriesList:ArrayList<Entry> = ArrayList(10)
        entriesList.add(entry)
        entriesList.add(entry1)
        val recyclerViewAdapter = RecyclerViewAdapter(entriesList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = recyclerViewAdapter
    }
}
