package cl.carlos.breakfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mapa extends AppCompatActivity {
Button mpo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        
        mpo = (Button) findViewById(R.id.buttongoogle);

        mpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent opc = new Intent(Mapa.this, Mapagoo.class);
                startActivity(opc);
            }
        });
    }
}


