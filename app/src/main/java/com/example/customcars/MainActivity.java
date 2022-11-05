package com.example.customcars;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private ListView listView;
    private String[] cars;
    private int [] carPics = { R.drawable.fordraptor, R.drawable.volksgolf, R.drawable.civic, R.drawable.pacifica,
                            R.drawable.corvette,R.drawable.mercedes,R.drawable.ridgeline,R.drawable.challenger,
                            R.drawable.corolla,R.drawable.miata,R.drawable.mazdacx5,R.drawable.mustang,
                            R.drawable.ferrari,R.drawable.bmw,R.drawable.audi,R.drawable.hyundaiveloster,
                            R.drawable.nissan,R.drawable.ram1500,R.drawable.subaru,R.drawable.porsche,};
    //private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    intent = new Intent(MainActivity.this, display.class);
    listView = findViewById(R.id.listViewID);
    //searchView = findViewById(R.id.searchViewID);
    cars = getResources().getStringArray(R.array.car_list);

        final CustomAdapter customAdapter =
            new CustomAdapter(MainActivity.this, cars, carPics);

        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String value = cars[position];
            Toast.makeText(MainActivity.this, value + " " + position, Toast.LENGTH_SHORT).show();

            if (position == 0) {
                intent.putExtra("name", "Ford Raptor");
            }
            if (position == 1) {
                intent.putExtra("name", "Volkswagon Golf");
            }
            if (position == 2) {
                intent.putExtra("name", "Honda Civic");
            }
            if (position == 3) {
                intent.putExtra("name", "Chrysler Pacifica");
            }
            if (position == 4) {
                intent.putExtra("name", "Chevrolet Corvette");
            }
            if (position == 5) {
                intent.putExtra("name", "Mercedes AMG");
            }
            if (position == 6) {
                intent.putExtra("name", "Honda Ridgeline");
            }
            if (position == 7) {
                intent.putExtra("name", "Dodge Challenger");
            }
            if (position == 8) {
                intent.putExtra("name", "Toyota Corolla");
            }
            if (position == 9) {
                intent.putExtra("name", "Mazda Miata");
            }
            if (position == 10) {
                intent.putExtra("name", "Mazda CX5");
            }
            if (position == 11) {
                intent.putExtra("name", "Ford Mustang");
            }
            if (position == 12) {
                intent.putExtra("name", "Ferrari Tributo");
            }
            if (position == 13) {
                intent.putExtra("name", "BMW M2");
            }
            if (position == 14) {
                intent.putExtra("name", "Audi Q8");
            }
            if (position == 15) {
                intent.putExtra("name", "Hyundai Veloster");
            }
            if (position == 16) {
                intent.putExtra("name", "Nissan GTR");
            }
            if (position == 17) {
                intent.putExtra("name", "Ram 1500");
            }
            if (position == 18) {
                intent.putExtra("name", "Subaru WRX");
            }
            if (position == 19) {
                intent.putExtra("name", "Porsche 911");
            }

            startActivity(intent);
            overridePendingTransition(R.anim.slide_from_left, 0);
        }
    });

       /* searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                customAdapter.getFilter().filter(newText);
                return false;
            }
        });*/
}

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alBuilder;
        alBuilder=new AlertDialog.Builder(MainActivity.this);
        alBuilder.setIcon(R.drawable.question_icon1);
        alBuilder.setTitle("Alert");
        alBuilder.setMessage("Are you sure to you want to exit?");
        alBuilder.setCancelable(false);

        alBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alBuilder.create();
        alertDialog.show();
    }
}