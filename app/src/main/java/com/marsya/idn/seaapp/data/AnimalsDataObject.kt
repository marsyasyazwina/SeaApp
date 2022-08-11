package com.marsya.idn.seaapp.data

import com.marsya.idn.seaapp.R

object AnimalsDataObject {
    private val AnimalsName = arrayOf(
        "Anjing laut",
        "Bintang laut",
        "Gurita",
        "Hiu",
        "Kerang",
        "Kuda laut",
        "Lobster",
        "Lumba lumba",
        "Paus",
        "Udang"

    )

    private val AnimalsFood = arrayOf(
        "Makanannya adalah Ikan",
        "Makanannya adalah Kerang kerangan kecil",
        "Makanannya adalah Udang",
        "Makanannya adalah Ikan",
        "Makanannya adalah Udang kecil",
        "Makanannya adalah Ikan rucah",
        "Makanannya adalah Plankton",
        "Makanannya adalah Cumi cumi",
        "Makanannya adalah Ikan",
        "Makanannya adalah Plankton"
    )

    private val AnimalsDescription = arrayOf(
        "Anjing laut adalah mamalia besar dari ordo karnivora yang hidup di daerah sejuk. Pada awalnya, anjing laut termasuk ke dalam subordo Pinnipedia, tetapi sekarang kategori subordo ini telah bergeser menjadi kategori superfamilia",
        "Bintang laut, walaupun dalam bahasa Inggris ia dikenal dengan sebutan starfish, hewan ini sangat jauh hubungannya dengan ikan. Bintang laut merupakan hewan invertebrata yang termasuk dalam filum Echinodermata, dan kelas Asteroidea.",
        "Gurita adalah hewan moluska dari kelas Cephalopoda, ordo Octopoda dengan terumbu karang di samudra sebagai habitat utama. Gurita terdiri dari 289 spesies yang mencakup sepertiga dari total spesies kelas Cephalopoda. Gurita dalam bahasa Inggris disebut Octopus yang sering hanya mengacu pada hewan dari genus Octopus",
        "Hiu adalah kelompok ikan elasmobranch yang ditandai dengan kerangka tulang rawan, lima hingga tujuh celah insang di sisi kepala, dan sirip dada yang tidak menyatu di kepala. Hiu modern diklasifikasikan dalam clade Selachimorpha dan merupakan kelompok saudara dari pari",
        "Kerang adalah hewan air yang termasuk hewan bertubuh lunak. Pengertian kerang bersifat umum dan tidak memiliki arti secara biologi namun penggunaannya luas dan dipakai dalam kegiatan ekonomi. Dalam pengertian paling luas, kerang berarti semua moluska dengan sepasang cangkang.",
        "Kuda laut adalah jenis ikan yang hidup di laut dari genus Hippocampus dan famili Syngnathidae. Hewan dengan ukuran yang bervariasi antara 16 mm sampai 35 cm ini dapat ditemukan di perairan tropis dan menengah di seluruh dunia. Kuda laut merupakan satu-satunya spesies yang jantannya dapat hamil.",
        "Lobster adalah keluarga krustasea laut besar. Lobster memiliki tubuh yang panjang dengan ekor yang berotot, dan hidup di celah-celah atau liang di dasar laut. Tiga dari lima pasang kaki mereka memiliki cakar, termasuk pasangan pertama, yang biasanya jauh lebih besar daripada yang lain.",
        "Lumba-lumba adalah mamalia laut yang sangat cerdas, selain itu sistem alamiah yang melengkapi tubuhnya sangat kompleks. Sehingga banyak teknologi yang terinspirasi dari lumba-lumba.",
        "Paus atau lodan adalah kelompok mamalia yang hidup di lautan. Paus bukan tergolong dalam keluarga ikan. Paus mempunyai ciri-ciri sebagai berikut: bernapas menggunakan paru-paru mempunyai rambut berdarah panas mempunyai kelenjar susu mempunyai jantung dengan empat ruang",
        "Udang adalah binatang yang hidup di perairan, khususnya sungai, laut, atau danau. Udang dapat ditemukan di hampir semua \"genangan\" air yang berukuran besar baik air tawar, air payau, maupun air asin pada kedalaman bervariasi, dari dekat permukaan hingga beberapa ribu meter di bawah permukaan. "

    )

    private val AnimalsPhoto = intArrayOf(
        R.drawable.anjing_laut,
        R.drawable.bintang_laut,
        R.drawable.gurita,
        R.drawable.hiu,
        R.drawable.kerang,
        R.drawable.kuda_lautt,
        R.drawable.lobster,
        R.drawable.lumba_lumba,
        R.drawable.pauss,
        R.drawable.udang
    )

    val listData: ArrayList<AnimalsData>
    get() {
        val list = arrayListOf<AnimalsData>()
        for (position in AnimalsName.indices){
           val Animals = AnimalsData()
            Animals.Name = AnimalsName[position]
            Animals.Food = AnimalsFood [position]
            Animals.Description = AnimalsDescription [position]
            Animals.photo = AnimalsPhoto[position]
            list.add(Animals)
        }

        return list
    }
}