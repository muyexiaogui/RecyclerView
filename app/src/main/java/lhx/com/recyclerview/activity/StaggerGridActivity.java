package lhx.com.recyclerview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lhx.com.recyclerview.R;
import lhx.com.recyclerview.adapter.StaggerGridAdapter;
import lhx.com.recyclerview.entry.Fruit;

/**
 *  RecyclerView实现瀑布流
 * */
public class StaggerGridActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();
    private RecyclerView recyclerView;
    private StaggerGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stagger_grid);
        initFruit();
        recyclerView = (RecyclerView)findViewById(R.id.stagger_recycler_view);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter = new StaggerGridAdapter(fruitList,StaggerGridActivity.this);
        recyclerView.setAdapter(adapter);
    }

    private void initFruit() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(getRandomLengthName("apple"),R.mipmap.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("banana"),R.mipmap.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("orange"),R.mipmap.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("watermelon"),R.mipmap.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(getRandomLengthName("pear"),R.mipmap.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("grape"),R.mipmap.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("pineapple"),R.mipmap.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("strawberry"),R.mipmap.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cheey = new Fruit(getRandomLengthName("cheey"),R.mipmap.cherry_pic);
            fruitList.add(cheey);
            Fruit mango = new Fruit(getRandomLengthName("mango"),R.mipmap.mango_pic);
            fruitList.add(mango);

        }
    }

    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }

}
