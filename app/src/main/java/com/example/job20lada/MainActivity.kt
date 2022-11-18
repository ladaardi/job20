package com.example.job20lada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Siswa>()
    val listnama = arrayOf(
        "HAMDAN AINUN NAI'M",
        "HENI WIJAYANTI",
        "IBNU RIF'AN",
        "JIHAN SALWA FITRIANI",
        "KHOTIMATUS SA'ADAH",
        "LADA' ARDI SACHIO LAWIDYARTHDANA",
        "LATIFA IRSYADIAH",
        "MAULIDA INTAN NUR AINI",
        "MIFTAHUL JANNAH",
        "MUH ASA SUSILO FARIKH SAKTI",
        "MUHAMMAD HAIKAL"
    )

    val listnis = arrayOf(
        "2993",
        "2995",
        "2997",
        "3000",
        "3002",
        "3003",
        "3005",
        "3008",
        "3010",
        "3011",
        "3013",
    )
    lateinit var SiswaView: RecyclerView
    lateinit var siswaAdapter: siswaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SiswaView = findViewById(R.id.SiswaView)
        SiswaView.layoutManager = LinearLayoutManager(this)

        for (i in listnama.indices) {
            list.add(Siswa(listnama[i], listnis[i]))
        }

        siswaAdapter = siswaAdapter(list)
        siswaAdapter.notifyDataSetChanged()
        SiswaView.adapter = siswaAdapter
    }
}