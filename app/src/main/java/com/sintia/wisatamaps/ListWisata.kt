package com.sintia.wisatamaps

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sintia.wisatamaps.adapter.WisataAdapter
import com.sintia.wisatamaps.model.WisataModel

class ListWisata : AppCompatActivity() {

    private var rv_wisata: RecyclerView? = null
    private var WisataAdapter: WisataAdapter? = null

    //array data doctor
    private var wisataList = mutableListOf<WisataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_wisata)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rv_wisata = findViewById(R.id.rv_wisata)
        wisataList = ArrayList()
        WisataAdapter= WisataAdapter(this,wisataList);
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this,1)
        rv_wisata!!.layoutManager = layoutManager
        rv_wisata!!.adapter = WisataAdapter

        //create dummy data
        prepareDataWisata()

    }

    private fun prepareDataWisata() {
        var itemWisata = WisataModel(
            R.drawable.danausingkarak,
            "danau singkarak",
            "Danau Singkarak adalah sebuah danau yang membentang di dua kabupaten yang terdapat di provinsi Sumatera Barat, " +
                    "Indonesia, yaitu kabupaten Solok dan kabupaten Tanah Datar. Danau ini memiliki luas 107,8 km² dan merupakan danau " +
                    "terluas kedua di pulau Sumatra setelah Danau Toba di Sumatera Utara",
            "Tanah Datar",-0.6049363473916979, 100.54115665611077
        )
        wisataList.add(itemWisat


                \a)
        itemWisata = WisataModel(
            R.drawable.hehaocean,
            "Hahe Ocean",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry Lorem " +
                    "Ipsum has been the industry's standard dummy text ever since the 1500s,when an unknown printer " +
                    "took a galley of type and scrambled it to make a type specimen book."
            ,"Yogyakarta",-8.03469922580403, 110.45648402585519

        )
        wisataList.add(itemWisata)
        itemWisata = WisataModel(
            R.drawable.ngaraisianok,
            "Ngarai Sianok",
            "Sianok Anam Suku merupakan salah satu nagari yang terdapat dalam kecamatan " +
                    "IV Koto, Kabupaten Agam, Provinsi Sumatera Barat, Indonesia"
            ,"Agam",-0.3074342644896601, 100.34277911510007

        )
        wisataList.add(itemWisata)
        itemWisata = WisataModel(
            R.drawable.padarisland,
            "Padar Island",
            "Pulau Padar adalah pulau ketiga terbesar di kawasan Taman Nasional " +
                    "Komodo, setelah Pulau Komodo dan Pulau Rinca. Pulau ini relatif lebih " +
                    "dekat ke Pulau Rinca dari pada ke Pulau Komodo, yang dipisahkan oleh " +
                    "Selat Lintah. Di sekitar pulau ini terdapat pula tiga atau empat pulau kecil."
            ,"NTT",-8.652737081924567, 119.5583956862502

        )
        wisataList.add(itemWisata)
        itemWisata = WisataModel(
            R.drawable.pantaisulamandaha,
            "Pantai Sumaladaha",
            "Sulamadaha adalah pantai yang paling terkenal di Ternate. Tidak hanya " +
                    "di Indonesia, namun pantai ini juga sudah diketahui oleh warga mancanegara."
            ,"Maluku",0.8627113457979881, 127.3362146317739
        )

        wisataList.add(itemWisata)
        itemWisata = WisataModel(
            R.drawable.prambanan,
            "Prambanan",
            "Candi Prambanan adalah bangunan candi bercorak agama Hindu terbesar di " +
                    "Indonesia yang dibangun pada abad ke-9 Masehi. "
            ,"Yogyakarta",-7.748020662867082, 110.49146532784513

        )
        wisataList.add(itemWisata)
        WisataAdapter!!.notifyDataSetChanged()
    }
}