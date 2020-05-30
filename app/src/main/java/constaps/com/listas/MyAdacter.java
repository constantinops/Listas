package constaps.com.listas;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.text.Layout;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MyAdacter extends  BaseAdapter{

    private Context context;
    private int layaut;
    private int imagen [];
    private List<String> alumno;
    private List<String> profe;
    private int lastPosition = -1;

    private TextView textAlumnos,textProfes;
    private ImageView imgImagenes;


    public MyAdacter(Context context,int layaut,int [] imagen,List<String> alumno,List<String> profe){
        this.context = context;
        this.layaut = layaut;
        this.imagen = imagen;
        this.alumno = alumno;
        this.profe = profe;


    }


    @Override
    public int getCount() {
        return this.alumno.size();
    }

    @Override
    public Object getItem(int position) {
        return this.alumno.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.lista_personalizada,null);

        String alumnos = alumno.get(position);
        String profes = profe.get(position);
        int imagenes = imagen[position];
        textAlumnos = v.findViewById(R.id.textview_mixteco);
        textProfes = v.findViewById(R.id.textview_espanol);
        imgImagenes = v.findViewById(R.id.imageView_lista);

        textAlumnos.setText(alumnos);
        textProfes.setText(profes);
        imgImagenes.setImageResource(imagenes);


        Animation animation = AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left);
        v.setAnimation(animation);


/*
        Animation animation = AnimationUtils.loadAnimation(context,
                (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        v.startAnimation(animation);
        lastPosition = position;
*/
 /*

        Animation animation = AnimationUtils.loadAnimation(context,
                (position > lastPosition) ? R.anim.up_from_bottom : android.R.anim.slide_in_left);
        v.startAnimation(animation);
        lastPosition = position;


/*

        Animation animation = AnimationUtils.loadAnimation(context, R.anim.top_down);
        v.startAnimation(animation);

 */

        return v;
    }


}