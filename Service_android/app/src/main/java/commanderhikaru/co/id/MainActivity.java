package commanderhikaru.co.id;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import commanderhikaru.co.id.explicit.explicitbasic;

public class MainActivity extends AppCompatActivity {
//TODO : Deklarasikan view terlebih dahulu
    Button btn_explicit;
    Button btn_implicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 2 : Insialisasikan View yang sudah  di deklarasikan
        btn_explicit = (Button)findViewById(R.id.btn_intentexplicit);
        btn_implicit = (Button)findViewById(R.id.btb_intentimplicit);

        //TODO 3 : Implementasikan view yang sudah di insialisasikan
        btn_implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Menambahkan Intent Explicit - Memindahkan dari main activity ke activity yang lain
                Intent toActivity_explicitbasic = new Intent(MainActivity.this, explicitbasic.class);
                startActivity(toActivity_explicitbasic);

            }
        });
    }
}
