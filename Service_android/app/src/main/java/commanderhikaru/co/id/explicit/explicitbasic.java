package commanderhikaru.co.id.explicit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import commanderhikaru.co.id.MainActivity;
import commanderhikaru.co.id.R;

public class explicitbasic extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicitbasic);

        back = (Button)findViewById(R.id.back_to_main);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toactivity_main = new Intent(explicitbasic.this, MainActivity.class);
                startActivity(toactivity_main);
            }
        });
    }
}
