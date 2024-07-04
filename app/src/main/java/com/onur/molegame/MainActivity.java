package com.onur.molegame;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView mole;
    TextView skor,bilgi;
    ImageView hammer;
    int counter = 0;
    double gen,yuk;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mole = findViewById(R.id.mole);
        hammer = findViewById(R.id.hammer);
        skor= findViewById(R.id.skor);
        bilgi = findViewById(R.id.bilgi);



        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        gen= displayMetrics.widthPixels*0.2;
        yuk = displayMetrics.heightPixels*0.2;
        int genn = (int) (displayMetrics.widthPixels-gen);
        int yukk = (int) (displayMetrics.heightPixels-yuk);
//        System.out.println("veri: "+genn+"----"+yukk);
        Random rastg=new Random();
        Random rasty=new Random();
        int rastgen = rastg.nextInt(genn);
        int rastyuk = rasty.nextInt(yukk);
//        System.out.println("deger: "+rastgen+"----"+rastyuk);
        mole.setX(rastgen);
        mole.setY(rastyuk);



        LinearLayout.LayoutParams molesize = new LinearLayout.LayoutParams((int) gen, (int) yuk);
        mole.setLayoutParams(molesize);
        hammer.setLayoutParams(molesize);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void kontrol (View view){
        bilgi.setText("");
        counter++;
        skor.setText("Skor: "+String.valueOf(counter));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        gen= displayMetrics.widthPixels*0.2;
        yuk = displayMetrics.heightPixels*0.2;
        int genn = (int) (displayMetrics.widthPixels-gen);
        int yukk = (int) (displayMetrics.heightPixels-yuk);
        Random rastg=new Random();
        Random rasty=new Random();
        int rastgen = rastg.nextInt(genn);
        int rastyuk = rasty.nextInt(yukk);
        mole.setX(rastgen);
        mole.setY(rastyuk);

    }
    public void kontrol2 (View view){
        bilgi.setText("Kaçırdın");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        gen= displayMetrics.widthPixels*0.2;
        yuk = displayMetrics.heightPixels*0.2;
        int genn = (int) (displayMetrics.widthPixels-gen);
        int yukk = (int) (displayMetrics.heightPixels-yuk);
        Random rastg=new Random();
        Random rasty=new Random();
        int rastgen = rastg.nextInt(genn);
        int rastyuk = rasty.nextInt(yukk);
        mole.setX(rastgen);
        mole.setY(rastyuk);

    }

}