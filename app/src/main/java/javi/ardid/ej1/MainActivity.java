package javi.ardid.ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editFrase;
    private Button btnResolver;
    private Button btnPalabras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();
        btnResolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void inicializar() {
        editFrase.findViewById(R.id.editFrase);
        btnPalabras.findViewById(R.id.btnPalabras);
        btnResolver.findViewById(R.id.btnResolver);
    }
}