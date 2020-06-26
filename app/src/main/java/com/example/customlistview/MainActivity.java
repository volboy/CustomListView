package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<State> states=new ArrayList();
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //начальная инициализация списка
        setInitialData();
        //получаем элемент ListView
        countriesList=findViewById(R.id.countriesList);
        //создаем адаптер
        StateAdapter stateAdapter=new StateAdapter(this, R.layout.list_item,states);
        //устанавливаем адаптер
        countriesList.setAdapter(stateAdapter);
        //слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //получаем выбранный пункт
                State selectedState=(State)parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Выбрана страна: " + selectedState.getName(), Toast.LENGTH_SHORT).show();
            }
        };

        countriesList.setOnItemClickListener(itemListener);



    }
    private void setInitialData() {
        states.add(new State("Беларусь", "Минск", R.drawable.belarus));
        states.add(new State("Фоклендские острова", "Фокленд", R.drawable.falklandislands));
        states.add(new State("Фарерские острова", "Фареры", R.drawable.faroeislands));
        states.add(new State("Грузия", "Тбилиси", R.drawable.georgia));
        states.add(new State("Либерия", "Либерти-сити", R.drawable.liberia));
        states.add(new State("Беларусь", "Минск", R.drawable.belarus));
        states.add(new State("Фоклендские острова", "Фокленд", R.drawable.falklandislands));
        states.add(new State("Фарерские острова", "Фареры", R.drawable.faroeislands));
        states.add(new State("Грузия", "Тбилиси", R.drawable.georgia));
        states.add(new State("Либерия", "Либерти-сити", R.drawable.liberia));
        states.add(new State("Беларусь", "Минск", R.drawable.belarus));
        states.add(new State("Фоклендские острова", "Фокленд", R.drawable.falklandislands));
        states.add(new State("Фарерские острова", "Фареры", R.drawable.faroeislands));
        states.add(new State("Грузия", "Тбилиси", R.drawable.georgia));
        states.add(new State("Либерия", "Либерти-сити", R.drawable.liberia));
    }
}
