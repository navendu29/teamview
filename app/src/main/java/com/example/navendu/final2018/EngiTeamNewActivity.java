package com.example.navendu.final2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.navendu.final2018.Adapters.EngiTeamAdapter;
import com.example.navendu.final2018.Models.EngiTeamModel;

import java.util.ArrayList;

public class EngiTeamNewActivity extends AppCompatActivity {
public TextView t1;
private ArrayList<EngiTeamModel> listToShowcc= new ArrayList<>();
private ArrayList<EngiTeamModel> listToShowct= new ArrayList<>();
private EngiTeamAdapter mAdapter= new EngiTeamAdapter();
private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engi_team_new);
        t1=(TextView)findViewById(R.id.text);
        t1.setText("cultural council");
        prepareLists();
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mAdapter.setData(listToShowcc,this);
        Log.v("EngiTeamAct",String.valueOf(listToShowcc.get(0).imageName));
        recyclerView = findViewById(R.id.engi_team_recycler_view);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                Log.v("RecycclerView",String.valueOf(newState));
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }
    public void prepareLists()
    {
        EngiTeamModel model = new EngiTeamModel("parteek","FakeName1","FakePosition 1");
        listToShowcc.add(model);


        model=new EngiTeamModel("nikhil","FakeName 2","FakePosition 2");
        listToShowcc.add(model);
        Log.v("EngiTeamAct",String.valueOf(listToShowcc.indexOf(model)));

        model=new EngiTeamModel("shivam","FakeName 3","FakePosition 3");
        listToShowcc.add(model);
        model=new EngiTeamModel("janvi","FakeName 4","FakePosition 4");
        listToShowcc.add(model);
        model=new EngiTeamModel("utkarsh","FakeName 5","FakePosition 5");
        listToShowcc.add(model);



        //Adding Core team to list
        model = new EngiTeamModel("gunik","FakeName1","");
        listToShowct.add(model);
        model = new EngiTeamModel("arpit","FakeName2","");
        listToShowct.add(model);
        model = new EngiTeamModel("dhruv","FakeName3","");
        listToShowct.add(model);
        model = new EngiTeamModel("akriti","FakeName4","");
        listToShowct.add(model);
        model = new EngiTeamModel("shikher","FakeName5","");
        listToShowct.add(model);

    }

    public void cc(View view){
        mAdapter.setData(listToShowcc,this);
//        mAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(null);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter.notifyDataSetChanged();

    }
    public void ct(View view){
        mAdapter.setData(listToShowct,this);
//        mAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(null);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter.notifyDataSetChanged();

    }
}
