package com.example.news_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),MyAdapter.MyonItemClickListener {
    lateinit var rv:RecyclerView
    val NewsObject= mutableListOf<dataClass>()
    lateinit var news:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          rv=findViewById(R.id.rv)

        NewsObject.add(dataClass(R.drawable.news1,"Prioritise regional languages in court activities, says Law Minister Rijiju"))
        NewsObject.add(dataClass(R.drawable.news2,"Amarinder Singh, Sunil Jakhar made BJP national executive members"))
        NewsObject.add(dataClass(R.drawable.news3,"Doha-bound carrier suffers technical snag"))
        NewsObject.add(dataClass(R.drawable.news4,"Kerala High Court upholds anticipatory bail granted to Congress MLA Eldhose Kunnappilly in rape case"))
        NewsObject.add(dataClass(R.drawable.news5,"SC sets aside Kerala HC order granting pre-arrest bail to 4 in ISRO espionage case"))
        NewsObject.add(dataClass(R.drawable.news6,"We don’t need to be told what to do on democracy: India’s Permanent Representative to the UN Amb Kamboj"))
        NewsObject.add(dataClass(R.drawable.news7,"Srinagar to Dholavira to Puri: G20 logo illuminates 100 monuments"))
        NewsObject.add(dataClass(R.drawable.news8,"G20 presidency begins: India says it will be the voice of Global South"))
        NewsObject.add(dataClass(R.drawable.news9,"Bombay HC stays Shinde govt’s orders suspending works initiated by MVA regime in rural areas"))
        NewsObject.add(dataClass(R.drawable.news10,"Art Street: 19th-century Wellington fountain in Mumbai’s Colaba was erected in memory of the Duke’s visit"))
        NewsObject.add(dataClass(R.drawable.news11,"Poor campaigning in Gujarat exposes Congress’s political bankruptcy: Prakash Ambedkar"))
        NewsObject.add(dataClass(R.drawable.news12,"Mumbai News Live Updates: Amid border row with Karnataka, NCP slams Maharashtra govt, BJP and Centre for ‘eerie silence’\n"))
        NewsObject.add(dataClass(R.drawable.news13,"This winter, roll these ginger and jaggery bites to keep cold and cough at bay"))
        NewsObject.add(dataClass(R.drawable.news14,"Apple highlights accessibility features for users with disabilities in powerful new ad campaign"))
        NewsObject.add(dataClass(R.drawable.news15,"Chhavi Mittal gives a 'big shoutout' to people trying to stay fit this festive season"))

        news= arrayOf(getString(R.string.desc1) ,
                      getString(R.string.desc2) ,
                      getString(R.string.desc3))


        rv.adapter=MyAdapter(NewsObject,this@MainActivity)
        rv.layoutManager=LinearLayoutManager(this)
        rv.setHasFixedSize(true)

    }

    override fun onClick(position: Int) {
        //Toast.makeText(this,"${NewsObject[position]}",Toast.LENGTH_SHORT).show()
        val intent=Intent(this,MainActivity2::class.java)
        intent.putExtra("heading",NewsObject[position].heading)
        intent.putExtra("image",NewsObject[position].image)
        intent.putExtra("desc",news[position])
        startActivity(intent)
    }
}