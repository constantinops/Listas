package constaps.com.listas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListaPersActivity extends AppCompatActivity   {

    private List<String> alumno, profe;
    private ListView lista;
    private MediaPlayer pley;
    MyAdacter myAdacter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pers);

        lista = findViewById(R.id.lista_Perso_Lisa);
        listaPersonaLizada();



    }



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_buscar,menu);
        MenuItem item = menu.findItem(R.id.buscardor);
        SearchView  searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {


                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


    public  void listaPersonaLizada(){

        alumno = new  ArrayList<String>(){{
            add("Aby");
            add("Anita");
            add("consta");
            add("celina");
            add("Aby");
            add("Anita");
            add("consta");
            add("celina");
            add("Aby");
            add("Anita");
            add("consta");
            add("celina");
            add("Aby");
            add("Anita");
            add("consta");
            add("celina");
            add("Aby");
            add("Anita");
            add("consta");
            add("celina");
            add("Aby");
            add("Anita");
            add("consta");
            add("celina");
        }
        };

        profe = new ArrayList<>();
        profe.add("omar");
        profe.add("tinu");
        profe.add("Abigail");
        profe.add("lili");
        profe.add("omar");
        profe.add("tinu");
        profe.add("Abigail");
        profe.add("lili");
        profe.add("omar");
        profe.add("tinu");
        profe.add("Abigail");
        profe.add("lili");
        profe.add("omar");
        profe.add("tinu");
        profe.add("Abigail");
        profe.add("lili");
        profe.add("omar");
        profe.add("tinu");
        profe.add("Abigail");
        profe.add("lili");
        profe.add("omar");
        profe.add("tinu");
        profe.add("Abigail");
        profe.add("lili");

        int img [] = {
                R.drawable.ic_pie_chart_black_24dp,
                R.drawable.ic_question_answer_black_24dp,
                R.drawable.ic_insert_emoticon_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_pie_chart_black_24dp,
                R.drawable.ic_question_answer_black_24dp,
                R.drawable.ic_insert_emoticon_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_pie_chart_black_24dp,
                R.drawable.ic_question_answer_black_24dp,
                R.drawable.ic_insert_emoticon_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_pie_chart_black_24dp,
                R.drawable.ic_question_answer_black_24dp,
                R.drawable.ic_insert_emoticon_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_pie_chart_black_24dp,
                R.drawable.ic_question_answer_black_24dp,
                R.drawable.ic_insert_emoticon_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_archive_black_24dp,
                R.drawable.ic_pie_chart_black_24dp,
                R.drawable.ic_question_answer_black_24dp,
                R.drawable.ic_insert_emoticon_black_24dp,
                R.drawable.ic_archive_black_24dp
        };

        final int audio [] = {
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,
                R.raw.uno,

        };





        myAdacter = new MyAdacter(this,R.layout.lista_personalizada,img,alumno,profe);
        lista.setAdapter(myAdacter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(ListaPersActivity.this,"CLIK "+ alumno.get(position),Toast.LENGTH_SHORT).show();


                if (pley != null && pley.isPlaying()) {
                    pley.stop();
                    pley.reset();
                    pley.release();
                    pley = null;
                }

                pley = MediaPlayer.create(ListaPersActivity.this,audio[position]);
                pley.start();


            }
        });


    }
}
