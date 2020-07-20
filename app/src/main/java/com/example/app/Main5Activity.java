package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import androidx.appcompat.app.AppCompatActivity;

public class Main5Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    SimpleAdapter sa;
    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        HashMap<String,String> item;
        for(int i=0;i<Songs.length;i++){
            item = new HashMap<String,String>();
            item.put( "line1", Songs[i][0]);
            item.put( "line2", Songs[i][1]);
            list.add( item );
        }
        sa = new SimpleAdapter(this, list,
                R.layout.layout,
                new String[] { "line1","line2" },
                new int[] {R.id.line_a, R.id.line_b});

        l = (ListView)findViewById(R.id.l1);
        l.setAdapter(sa);
        l.setOnItemClickListener(this);

        //((ListView)findViewById(R.id.l)).setAdapter(sa);
        //((ListView)findViewById(R.id.l)).setOnItemClickListener(this);
    }

    String[][] Songs =
            {{"Mast Magan","Arjit Singh"},
                    {"Pinga","Shreya Ghoshal"},
                    {"Gilehriyaan","Jonita Gandhi"},
                    {"Challa(Main Lad Jana)","Romy"},
                    {"Makhna","Yasser Desai"},
                    {"Tere Yaar Hoon Mai","Arjith Singh"},
                    {"Raabta","Nikitha Gandhi"},
                    {"Baarish","Ash King"},
                    {"Jab Tak","Armaan Malik"},
                    {"Nazm Nazm","Arko Pravo"},
                    {"Dil Diya Gallan","Atif Aslam"},
                    {"Soch Na Sake","Arjith Singh"},
                    {"Ghoomar","Shreya Ghoshal"},
                    {"Tareefan","Baadshah"},
                    {"Hawayein","Arjith Singh"},
                    {"O Saathi","Atif Aslam"},
                    {"Jogi","Aakanksha Sharma"},
                    {"Tu Meri","Vishal Dadlani"},
                    {"Manva Laage","Arjith Singh"},
                    {"Titli","Chinmayi Sripaada"},
                    {"Tu Chahiye","Atif Aslam"},
                    {"Balam Pichkari","Vishal Dadalani"},
                    {"Kabira","Tochi Raina"},
                    {"Dekho Na","Sonu Nigam"}};


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        // String s=(String)sa.getItem(i);
        Intent in=new Intent(this,Main4Activity.class);
        in.putExtra("key",i);
        startActivity(in);
    }
}