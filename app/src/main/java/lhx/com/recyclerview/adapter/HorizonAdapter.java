package lhx.com.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import lhx.com.recyclerview.R;
import lhx.com.recyclerview.entry.Fruit;

/**
 * Created by lhx
 * date:on 2018/4/23 0023.
 * TODO :
 */

public class HorizonAdapter extends RecyclerView.Adapter<HorizonAdapter.ViewHolder> {

    private List<Fruit> fruitList;
    private Context context;

    public HorizonAdapter(List<Fruit> fruitList, Context context) {
        this.fruitList = fruitList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fruit_item_horizon,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView fruitImage;
        private TextView fruitName;
        public ViewHolder(View itemView) {
            super(itemView);
            fruitImage = (ImageView)itemView.findViewById(R.id.item_fruit_image);
            fruitName = (TextView)itemView.findViewById(R.id.item_fruit_name);
        }
    }
}
