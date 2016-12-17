package edu.tecii.android.proyecto_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {

    private ListView lista;

    private static final int FARMACIAS=0;
    private static final int MAPA=1;
    private static final int ACERCA_DE=2;
    private static final String[] TEMAS= {"FARMACIAS", "MAPAS", "ACERCA DE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lista = (ListView)findViewById(R.id.listView);
        final ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,TEMAS);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id){
                switch (position){
                    case FARMACIAS:
                        Intent f = new Intent(getApplicationContext(),FARMACIAS.class);
                        startActivity(f);
                        break;
                    case MAPA:
                        Intent m = new Intent(getApplicationContext(),MAPA.class);
                        startActivity(m);
                        break;
                    case ACERCA_DE:
                        Intent a = new Intent(getApplicationContext(),ACERCA_DE.class);
                        startActivity(a);
                        break;
                }
            }
        });
    }
}
