package com.example.masteringandroid1_layouting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailBiodata extends AppCompatActivity {

    TextView tpnama;
    TextView tptanggal;
    TextView tpkelas;
    TextView tpjurusan;
    TextView tpumur;
    int umur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_biodata);

        tpnama =(TextView) findViewById(R.id.nama);
        tptanggal =(TextView) findViewById(R.id.tanggal);
        tpkelas =(TextView) findViewById(R.id.kelas);
        tpjurusan =(TextView) findViewById(R.id.jurusan);
        tpumur =(TextView)findViewById(R.id.umur);

        Bundle getBiodata = getIntent().getExtras();
        tpnama.setText(getBiodata.getString("NAMA_LENGKAP"));
        tptanggal.setText(getBiodata.getString("TANGGAL"));
        tpkelas.setText(getBiodata.getString("KELAS"));
        tpjurusan.setText(getBiodata.getString("JURUSAN"));
        tpumur.setText(String.valueOf(umur));
        umur = getBiodata.getInt("UMUR");


    }
}
