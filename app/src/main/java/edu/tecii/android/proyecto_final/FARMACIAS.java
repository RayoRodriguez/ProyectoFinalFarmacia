package edu.tecii.android.proyecto_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FARMACIAS extends AppCompatActivity {

    private ListView lista;

    private static final int FARMACIA_GUADALAJARA = 0;
    private static final int FARMACIA_DEL_AHORRO = 1;
    private static final int FARMACIA_BENAVIDES = 2;
    private static final int FARMACIA_ECONOMIK = 3;

    private static final String[] FARMACIAS = {"FARMACIA GUADALAJARA", "FARMACIA DEL AHORRO", "FARMACIA BENAVIDES", "FARMACIA ECONOMIK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmacias);

        lista = (ListView)findViewById(R.id.listFarmacias);
        final ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,FARMACIAS);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id){
                switch (position){
                    case FARMACIA_BENAVIDES:
                        Intent b = new Intent(getApplicationContext(),FARMACIA_BENAVIDES.class);
                        startActivity(b);
                        break;
                    case FARMACIA_DEL_AHORRO:
                        Intent a = new Intent(getApplicationContext(),FARMACIA_DEL_AHORRO.class);
                        startActivity(a);
                        break;
                    case FARMACIA_ECONOMIK:
                        Intent e = new Intent(getApplicationContext(),FARMACIA_ECONOMIK.class);
                        startActivity(e);
                        break;
                    case FARMACIA_GUADALAJARA:
                        Intent g = new Intent(getApplicationContext(),FARMACIA_GUADALAJARA.class);
                        startActivity(g);
                        break;
                }
            }
        });
    }
}
