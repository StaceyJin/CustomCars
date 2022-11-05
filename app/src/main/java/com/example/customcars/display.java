package com.example.customcars;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class display extends AppCompatActivity {

    public ImageView imageView;
    public TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        imageView = findViewById(R.id.imageViewId);
        txtView = findViewById((R.id.txtViewId));

        Bundle bundle;
        bundle = getIntent().getExtras();
        if (bundle != null){
            String carName = bundle.getString("name");
            showDetails(carName);
        }
    }

    void showDetails(String cName) {
        if (cName.equals("Ford Raptor")) {
            imageView.setImageResource(R.drawable.fordraptor);
            txtView.setText(R.string.fordRaptor_disp);
        }
        if (cName.equals("Volkswagon Golf")) {
            imageView.setImageResource(R.drawable.volksgolf);
            txtView.setText(R.string.volkswagonGolf_disp);
        }
        if (cName.equals("Honda Civic")) {
            imageView.setImageResource(R.drawable.civic);
            txtView.setText(R.string.hondaCivic_disp);
        }
        if (cName.equals("Chrysler Pacifica")) {
            imageView.setImageResource(R.drawable.pacifica);
            txtView.setText(R.string.chryslerPacifica_disp);
        }
        if (cName.equals("Chevrolet Corvette")) {
            imageView.setImageResource(R.drawable.corvette);
            txtView.setText(R.string.chevroletCorvette_disp);
        }
        if (cName.equals("Mercedes AMG")) {
            imageView.setImageResource(R.drawable.mercedes);
            txtView.setText(R.string.mercedes_disp);
        }
        if (cName.equals("Honda Ridgeline")) {
            imageView.setImageResource(R.drawable.ridgeline);
            txtView.setText(R.string.hondaRidgeline_disp);
        }
        if (cName.equals("Dodge Challenger")) {
            imageView.setImageResource(R.drawable.challenger);
            txtView.setText(R.string.dodgeChallenger_disp);
        }
        if (cName.equals("Toyota Corolla")) {
            imageView.setImageResource(R.drawable.corolla);
            txtView.setText(R.string.toyotaCorolla_disp);
        }
        if (cName.equals("Mazda Miata")) {
            imageView.setImageResource(R.drawable.miata);
            txtView.setText(R.string.mazdaMiata_disp);
        }
        if (cName.equals("Mazda CX5")) {
            imageView.setImageResource(R.drawable.mazdacx5);
            txtView.setText(R.string.mazdaMX5_disp);
        }
        if (cName.equals("Ford Mustang")) {
            imageView.setImageResource(R.drawable.mustang);
            txtView.setText(R.string.fordMustang_disp);
        }
        if (cName.equals("Ferrari Tributo")) {
            imageView.setImageResource(R.drawable.ferrari);
            txtView.setText(R.string.ferrariF8_disp);
        }
        if (cName.equals("BMW M2")) {
            imageView.setImageResource(R.drawable.bmw);
            txtView.setText(R.string.bmwM2_disp);
        }
        if (cName.equals("Audi Q8")) {
            imageView.setImageResource(R.drawable.audi);
            txtView.setText(R.string.audiQ8_disp);
        }
        if (cName.equals("Hyundai Veloster")) {
            imageView.setImageResource(R.drawable.hyundaiveloster);
            txtView.setText(R.string.hyundaiVeloster_disp);
        }
        if (cName.equals("Nissan GTR")) {
            imageView.setImageResource(R.drawable.nissan);
            txtView.setText(R.string.nissanGTR_disp);
        }
        if (cName.equals("Ram 1500")) {
            imageView.setImageResource(R.drawable.ram1500);
            txtView.setText(R.string.ram1500_disp);
        }
        if (cName.equals("Subaru WRX")) {
            imageView.setImageResource(R.drawable.subaru);
            txtView.setText(R.string.subaruWRX_disp);
        }
        if (cName.equals("Porsche 911")) {
            imageView.setImageResource(R.drawable.porsche);
            txtView.setText(R.string.porsche911_disp);
        }
    }
}
