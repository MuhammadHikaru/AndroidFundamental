package com.example.masteringandroid1_layouting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {

    //Todo 1 : deklarasi view
    EditText etnama;
    EditText ettanggal;
    EditText etkls;
    EditText etjrsn;
    EditText umur ;

    String nama_lengkap,jurusan,kelas,tanggal;
    int umur_skrg;

    Intent kirimData;
    Bundle packageBiodata;

    AlertDialog.Builder builderAlert;
    Button btview,bthapus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        //Todo 2 : Insialisasi view
        etnama = (EditText)findViewById(R.id.edt_nama);
        ettanggal = (EditText)findViewById(R.id.edt_Tanggal);
        etkls = (EditText)findViewById(R.id.edt_kelas);
        etjrsn = (EditText)findViewById(R.id.edt_jurusan);



        btview = (Button) findViewById(R.id.btn_lihat);
        bthapus = (Button)findViewById(R.id.btn_hapus);

        //Todo 3 : implementasi view
        btview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              builderAlert = new AlertDialog.Builder(BiodataActivity.this);
                nama_lengkap = etnama.getText().toString();
                jurusan = etjrsn.getText().toString();
                kelas = etkls.getText().toString();
                tanggal = ettanggal.getText().toString();
                umur_skrg = Integer.parseInt(umur.getText().toString());

                Log.d("Log ", "nama lengkap : " + nama_lengkap + "jurusan : "+jurusan+", kelas : "+kelas+
                        ", tanggal lahir : "+tanggal+", umur : "+umur);

                builderAlert
                      .setTitle("informasi")
                      .setMessage("Data yang diinputkan adalah nama lengkap "+nama_lengkap+", "+"Tanggal lahir "
                      + tanggal + ", kelas "+ kelas + "dan jurusan adalah "+ jurusan)
                      .setPositiveButton("Kirim ", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int i) {
                            packageBiodata = new Bundle();
                            packageBiodata.putString("NAMA_LENGKAP", nama_lengkap);
                             packageBiodata.putString("TANGGAL", tanggal);
                             packageBiodata.putString("KELAS", kelas);
                             packageBiodata.putString("JURUSAN",jurusan );
                             packageBiodata.putInt("UMUR",umur_skrg);

                             kirimData = new Intent(BiodataActivity.this,DetailBiodata.class);
                             kirimData.putExtras(packageBiodata);
                             startActivity(kirimData);

                          }
                      })
                      .setNegativeButton("Batalkan ", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {

                          }
                      });
              AlertDialog alertDialog = builderAlert.create();
              alertDialog.show();

            }
        });
        bthapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etnama.setText("");
                etjrsn.setText("");
                etkls.setText("");
                ettanggal.setText("");

            }
        });
    }
}
