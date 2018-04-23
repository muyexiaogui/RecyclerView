package lhx.com.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import lhx.com.recyclerview.R;
import lhx.com.recyclerview.entry.Fruit;

/**
 * Created by lhx
 * date:on 2018/4/23 0023.
 * TODO : RecyclerView适配器
 *
 * 步骤
 * 1、定义一个内部类ViewHolder 继承RecyclerView.ViewHolder
 * 2、声明复用控件，并findview
 * 3、让主类继承RecyclerView.Adapter并将创建的ViewHolder作为参数，实现三个方法
 * 4、声明数据源，构建构造函数进行传值
 * 5、在onCreateViewHolder中加载单条布局
 * 6、在onBindViewHolder对控件进行赋值
 * 7、在getItemCount中返回数组的大小
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private List<Fruit> mFruitList;
    private Context context;

    public FruitAdapter(Context context,List<Fruit> mFruitList) {
        this.context = context;
        this.mFruitList = mFruitList;
    }

    //加载item的单条布局
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fruit_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        //Recycler的单条点击事件
        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(context,"你点击了"+fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        //recycler的控件点击事件
        holder.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(context,"你点击了"+fruit.getName()+"图片",Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    //item单条绑定数据
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       Fruit fruit = mFruitList.get(position);
       holder.fruitImage.setImageResource(fruit.getImageId());
       holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

    //申明重复使用的控件
    static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView fruitImage;
        TextView fruitName;
        View fruitView;

        public ViewHolder(View itemView) {
            super(itemView);
            fruitView = itemView;
            fruitImage = (ImageView) itemView.findViewById(R.id.fruit_image);
            fruitName = (TextView) itemView.findViewById(R.id.fruit_name);
        }
    }
}
