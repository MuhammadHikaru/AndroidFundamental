package commanderhikaru.co.id.herohelper;

import android.app.Activity;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class HeroHelper extends AppCompatActivity {
    public void intentpindah(Activity activity_awal, Class activity_tujuan){
        Intent pindah = new Intent(activity_awal, activity_tujuan);
        activity_awal.startActivity(pindah);
    }
}
