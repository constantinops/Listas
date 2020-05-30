package constaps.com.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import constaps.com.listas.utilidades.Utilidades;

public class MainActivity extends AppCompatActivity {
   private ListView listView;
   private  List<String> nombres;
   private Button listaSimple, listaPerson;

   private String num = "1";
   private  String nombre = "2";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);



     listaSimple = findViewById(R.id.buttonListaSimple);
     listaPerson = findViewById(R.id.buttonListaPerso);


    listaSimple.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =  new Intent(MainActivity.this,LetrasActivity.class);
            startActivity(intent);
        }
    });

    listaPerson.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,ListaPersActivity.class);
            startActivity(intent);
        }
    });



     /*
     listView = findViewById(R.id.listView);

      nombres = new ArrayList<String>(){{
      add("tinu");
      add("omar");
      add("iasss");
      add("abi mi amor");
      add("te amo ");
      add("te amo ");
     }};

 int [] imgView = {
          R.drawable.ic_launcher_foreground,
          R.drawable.ic_archive_black_24dp,
          R.drawable.ic_launcher_foreground,
          R.drawable.ic_insert_emoticon_black_24dp,
          R.drawable.ic_question_answer_black_24dp,
          R.drawable.ic_pie_chart_black_24dp
     };

     ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombres);
     listView.setAdapter(adapter);

     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       Toast.makeText(MainActivity.this,"Click"+nombres.get(position),Toast.LENGTH_SHORT).show();
/*
       Intent intent = new Intent(MainActivity.this,LetrasActivity.class);
        intent.putExtra("nombre",position);
       startActivity(intent);
*//*
      }
     });

/*
     MyAdacter myAdacter = new MyAdacter(this,R.layout.lista_layout,nombres,imgView);
     listView.setAdapter(myAdacter);

*/



    }

public void onClick(View view){

        Intent intent = null;

        switch (view.getId()){
        case R.id.buttonsql:
            RegistraUsuario();
            break;

    }

    if(intent != null ){
        startActivity(intent);
    }

}

    private void RegistraUsuario() {
        ConexionSQLiteHelper bdUsuario =  new ConexionSQLiteHelper(this,"bd_usuario",null,1);
        SQLiteDatabase db = bdUsuario.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_NOMBRE,"constantino");
        values.put(Utilidades.CAMPO_TELEFONO,"953456877");

        Long idResultante = db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_ID,values);
        Toast.makeText(getApplicationContext(),"id registro"+idResultante,Toast.LENGTH_LONG).show();
        db.close();

    }


}
