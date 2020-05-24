package com.ilerna.videotutoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //El onCreate se crea automaticamente
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast para crear textos, se mete el contexto, funcion en este caso al crearse el activity y la duración del mensaje
        Toast.makeText(this,getText(R.string.onCreate),Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart(){

        Toast.makeText(this,R.string.onStart, Toast.LENGTH_SHORT).show();
        super.onStart();

    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,R.string.onResume, Toast.LENGTH_SHORT).show();
    }
}
