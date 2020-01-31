package commanderhikaru.co.id;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RubikActivity extends AppCompatActivity {

    EditText nama;
    EditText kategori;
    EditText stiker;
    EditText ukuran;
    EditText magnet;

    String snama,skategori,sstiker,sukuran,smagnet;

    Intent kirim;
    Bundle data;
    AlertDialog.Builder builderAlert;

    Button btmasuk,bthapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText)findViewById(R.id.nama_rubik);
        kategori = (EditText)findViewById(R.id.kategori_rubik);
        stiker = (EditText)findViewById(R.id.stiker_rubik);
        ukuran = (EditText)findViewById(R.id.ukuran_rubik);
        magnet = (EditText)findViewById(R.id.magnet_rubik);

        btmasuk = (Button)findViewById(R.id.hasil);
        bthapus = (Button)findViewById(R.id.hapus);

        btmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builderAlert = new AlertDialog.Builder(RubikActivity.this);
                snama = nama.getText().toString();
                skategori = kategori.getText().toString();
                sstiker = stiker.getText().toString();
                sukuran = ukuran.getText().toString();
                smagnet = magnet.getText().toString();

                builderAlert
                        .setTitle("informasi")
                        .setMessage("Data rubik yang telah dimasukan bernama "+snama+", masuk dalam ketegori "+skategori+
                                ", memiliki jenis stiker "+sstiker+", memiliki ukuran magnet "+smagnet+", dan memiliki ukuran"+
                                sukuran)
                        .setPositiveButton("kirim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                data = new Bundle();
                                data.putString("NAMA",snama);
                                data.putString("KATEGORI",skategori);
                                data.putString("STIKER", sstiker);
                                data.putString("UKURAN", sukuran);
                                data.putString("MAGNET", smagnet);

                                kirim = new Intent(RubikActivity.this,detaidata.class);
                                kirim.putExtras(data);
                                startActivity(kirim);
                            }
                        })
                        .setNegativeButton("HAPUS", new DialogInterface.OnClickListener() {
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
                nama.setText("");
                kategori.setText("");
                stiker.setText("");
                ukuran.setText("");
                magnet.setText("");
            }
        });


    }
}
