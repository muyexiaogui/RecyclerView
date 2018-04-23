package lhx.com.recyclerview.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import lhx.com.recyclerview.R;
import lhx.com.recyclerview.adapter.FruitAdapter;
import lhx.com.recyclerview.entry.Fruit;

/**
 *  普通的RecyclerView
* */
public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,fruitList);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.horizon_recycler:
                startActivity(new Intent(MainActivity.this,HorizaonRecyclerActivity.class));
                break;
            case R.id.fluent_recycler:
                startActivity(new Intent(MainActivity.this,StaggerGridActivity.class));
                break;
        }
        return true;
    }
}
