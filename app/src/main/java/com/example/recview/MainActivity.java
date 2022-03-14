package com.example.recview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private String[] leaderNames;
    private int[] imgs={R.drawable.aaaa,R.drawable.bbb,R.drawable.ccc,R.drawable.ddd,R.drawable.eee,R.drawable.fff,R.drawable.ggg,
            R.drawable.hhh,R.drawable.iii,R.drawable.jjj,R.drawable.kkk,R.drawable.lll,R.drawable.mmm,R.drawable.nnn,R.drawable.ooo,
            R.drawable.ppp,R.drawable.qqq,R.drawable.rrr,R.drawable.sss,R.drawable.ttt,R.drawable.uuu};

    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recyclerView);
        leaderNames= getResources().getStringArray(R.array.Leader_name);
        myAdapter= new MyAdapter(imgs,leaderNames,this);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                String values=leaderNames[position];
                Toast.makeText(MainActivity.this,values,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,infoshow.class);
                if(values.equals("Mohandas Gandhi"))
                {
                    intent.putExtra("webl","https://en.wikipedia.org/wiki/Mahatma_Gandhi");
                }
                else  if(values.equals("Alexander the Great")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Alexander_the_Great");
                }
                else  if(values.equals("Mao Zedong")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Mao_Zedong");
                }
                else  if(values.equals("Winston Churchill")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Winston_Churchill");
                }
                else  if(values.equals("Genghis Khan")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Genghis_Khan");
                }
                else  if(values.equals("Nelson Mandela")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Nelson_Mandela");
                }
                else  if(values.equals("Abraham Lincoln")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Abraham_Lincoln");
                }
                else  if(values.equals("Adolf Hitler")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Adolf_Hitler");
                }
                else  if(values.equals("Che Guevara")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Che_Guevara");
                }
                else  if(values.equals("Ronald Reagan")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Ronald_Reagan");
                }
                else  if(values.equals("Cleopatra")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Cleopatra");
                }
                else  if(values.equals("Franklin Roosevelt")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Franklin_D._Roosevelt");
                }
                else  if(values.equals("Dalai Lama")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Dalai_Lama");
                }
                else  if(values.equals("Queen Victoria")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Queen_Victoria");
                }
                else  if(values.equals("Benito Mussolini")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Benito_Mussolini");
                }
                else  if(values.equals("Akbar the Great")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Akbar");
                }
                else  if(values.equals("Lenin")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Vladimir_Lenin");
                }
                else  if(values.equals("Margaret Thatcher")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Margaret_Thatcher");
                }
                else  if(values.equals("Simón Bolívar")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Sim%C3%B3n_Bol%C3%ADvar");
                }
                else  if(values.equals("Qin Shi Huang")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Qin_Shi_Huang");
                }
                else  if(values.equals("Kim II-Sung")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Kim_Il-sung");
                }
                startActivity(intent);

            }

            @Override
            public void onItemLongClick(int position, View v) {
                String values=leaderNames[position];
                Toast.makeText(MainActivity.this,values,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,infoshow.class);
                if(values.equals("Mohandas Gandhi"))
                {
                    intent.putExtra("webl","https://en.wikipedia.org/wiki/Mahatma_Gandhi");
                }
                else  if(values.equals("Alexander the Great")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Alexander_the_Great");
                }
                else  if(values.equals("Mao Zedong")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Mao_Zedong");
                }
                else  if(values.equals("Winston Churchill")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Winston_Churchill");
                }
                else  if(values.equals("Genghis Khan")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Genghis_Khan");
                }
                else  if(values.equals("Nelson Mandela")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Nelson_Mandela");
                }
                else  if(values.equals("Abraham Lincoln")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Abraham_Lincoln");
                }
                else  if(values.equals("Adolf Hitler")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Adolf_Hitler");
                }
                else  if(values.equals("Che Guevara")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Che_Guevara");
                }
                else  if(values.equals("Ronald Reagan")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Ronald_Reagan");
                }
                else  if(values.equals("Cleopatra")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Cleopatra");
                }
                else  if(values.equals("Franklin Roosevelt")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Franklin_D._Roosevelt");
                }
                else  if(values.equals("Dalai Lama")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Dalai_Lama");
                }
                else  if(values.equals("Queen Victoria")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Queen_Victoria");
                }
                else  if(values.equals("Benito Mussolini")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Benito_Mussolini");
                }
                else  if(values.equals("Akbar the Great")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Akbar");
                }
                else  if(values.equals("Lenin")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Vladimir_Lenin");
                }
                else  if(values.equals("Margaret Thatcher")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Margaret_Thatcher");
                }
                else  if(values.equals("Simón Bolívar")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Sim%C3%B3n_Bol%C3%ADvar");
                }
                else  if(values.equals("Qin Shi Huang")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Qin_Shi_Huang");
                }
                else  if(values.equals("Kim II-Sung")) {

                    intent.putExtra("webl", "https://en.wikipedia.org/wiki/Kim_Il-sung");
                }
                startActivity(intent);


            }
        });

    }
}