package com.example.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper imagens_carros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int imagens[] = {R.drawable.linea1, R.drawable.linea2, R.drawable.linea3};

        imagens_carros = findViewById(R.id.imagens_carros);

        //loop
        for (int i =  0; i < imagens.length; i++){
            flipperimagens(imagens[i]);

        }


    }
    public void flipperimagens(int image){
        ImageView imageView = new ImageView(this);
         imageView.setBackgroundResource(image);

         imagens_carros.addView(imageView);
         imagens_carros.setFlipInterval(2500);//2,5 segundos
        imagens_carros.setAutoStart(true);


        //Animação
        imagens_carros.setInAnimation(this, android.R.anim.slide_in_left);
        imagens_carros.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
