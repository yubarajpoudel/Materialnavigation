package com.mantra.manpowernepal.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.mantra.manpowernepal.Classes.MainOption;
import com.mantra.manpowernepal.R;

import java.util.List;

/**
 * Created by yubraj on 6/17/15.
 */
public class NavDrawerAdapter extends RecyclerView.Adapter<NavDrawerAdapter.MyViewHolder> {
    List<MainOption> mainOptionlist;
    Context context;
    public NavDrawerAdapter(Context context){
        this.mainOptionlist = MainOption.getDrawableDataList();
        this.context = context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(context).inflate(R.layout.row_nav_drawer, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainOption mo  = mainOptionlist.get(position);
        holder.tv_text.setText(mo.title);
    }

    @Override
    public int getItemCount() {
        return mainOptionlist.size();
    }


public static class MyViewHolder extends RecyclerView.ViewHolder{
    TextView tv_text;
    public MyViewHolder(View v){
        super(v);
        this.tv_text = (TextView) v.findViewById(R.id.titles);
    }
}
}