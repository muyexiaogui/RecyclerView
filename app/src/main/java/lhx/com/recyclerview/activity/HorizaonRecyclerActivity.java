package lhx.com.recyclerview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import lhx.com.recyclerview.R;
import lhx.com.recyclerview.adapter.HorizonAdapter;
import lhx.com.recyclerview.entry.Fruit;


/**
 *  水平的RecyclerView
 * */
public class HorizaonRecyclerActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();
    private RecyclerView recyclerView;
    private HorizonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizaon_recycler);
        initFruit();
        recyclerView = (RecyclerView) findViewById(R.id.horizon_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(HorizaonRecyclerActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new HorizonAdapter(fruitList,HorizaonRecyclerActivity.this);
        recyclerView.setAdapter(adapter);

    }

    private void initFruit() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("apple",R.mipmap.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("banana",R.mipmap.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("orange",R.mipmap.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("watermelon",R.mipmap.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("pear",R.mipmap.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("grape",R.mipmap.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("pineapple",R.mipmap.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("strawberry",R.mipmap.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cheey = new Fruit("cheey",R.mipmap.cherry_pic);
            fruitList.add(cheey);
            Fruit mango = new Fruit("mango",R.mipmap.mango_pic);
            fruitList.add(mango);

        }
    }
}
