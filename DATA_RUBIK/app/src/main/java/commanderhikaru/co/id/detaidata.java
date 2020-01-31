package commanderhikaru.co.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detaidata extends AppCompatActivity {

    TextView nama,kategori,stiker,magnet,ukuran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaidata);

        nama = (TextView)findViewById(R.id.ednama);
        kategori = (TextView)findViewById(R.id.edkategori);
        stiker = (TextView)findViewById(R.id.edstkr);
        magnet = (TextView)findViewById(R.id.edmgnt);
        ukuran = (TextView)findViewById(R.id.edukuran);

        Bundle data = getIntent().getExtras();
        nama.setText(data.getString("NAMA"));
        kategori.setText(data.getString("KATEGORI"));
        stiker.setText(data.getString("STIKER"));
        magnet.setText(data.getString("MAGNET"));
        ukuran.setText(data.getString("UKURAN"));
    }
}
