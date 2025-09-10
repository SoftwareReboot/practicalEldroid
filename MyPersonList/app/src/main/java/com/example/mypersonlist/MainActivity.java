package com.example.mypersonlist;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    ArrayList<Person> list = new ArrayList<com.example.mypersonlist.Person>();
    ItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //
        lv = findViewById(R.id.ListView1);

        list.add(new com.example.mypersonlist.Person(R.drawable.andrea, "andrea"));
        list.add(new com.example.mypersonlist.Person(R.drawable.anne, "ann"));
        list.add(new com.example.mypersonlist.Person(R.drawable.barbie, "barbie"));
        list.add(new com.example.mypersonlist.Person(R.drawable.ella, "ella"));
        list.add(new com.example.mypersonlist.Person(R.drawable.janella, "janella"));
        list.add(new com.example.mypersonlist.Person(R.drawable.loisa, "loisa"));
        list.add(new com.example.mypersonlist.Person(R.drawable.maris, "maris"));
        adapter = new ItemAdapter(this, list);
        lv.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}