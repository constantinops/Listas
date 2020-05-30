package constaps.com.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LetrasActivity extends AppCompatActivity {;

    private TextView nomPersona;
    private Bundle nom, nombre;
    private  ListView listaAlumon;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letras);
        nom = getIntent().getExtras();
        nombre = getIntent().getExtras();
        listaAlumon = findViewById(R.id.lista_Alumno);

        listaAlumnoAc();



/*
        Toast.makeText(this,"hola mundo",Toast.LENGTH_LONG).show();
        nomPersona = findViewById(R.id.textNombre);
        nom = getIntent().getExtras();

       // nomPersona.setText(nom.);

 */

    }

    public void listaAlumnoAc(){

        final List<String> list = new ArrayList<String>(){{
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
            add("juan");
            add("luna");
            add("azul");
            add("aby");
            add("chay");
        }};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        listaAlumon.setAdapter(adapter);

        listaAlumon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LetrasActivity.this,"clik"+list.get(position),Toast.LENGTH_SHORT).show();

            }
        });

    }


}
