package com.example.reserve;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StatisticListAdapter extends BaseAdapter {

    private Context context;
    private List<Statistic> statisticList;

    public StatisticListAdapter(Context context, List<Statistic> statisticList) {
        this.context = context;
        this.statisticList=statisticList;

    }
    @Override
    public int getCount() {
        return statisticList.size();
    }


    @Override
    public Object getItem(int i) {
        return statisticList.get(i);
    }


    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v =View.inflate(context, R.layout.user,null);

        TextView orderText=(TextView)v.findViewById(R.id.orderText);
        TextView idText=(TextView)v.findViewById(R.id.idText);
        TextView menuText=(TextView)v.findViewById(R.id.menuText);
        TextView amountText=(TextView)v.findViewById(R.id.amountText);

        orderText.setText(statisticList.get(i).getMenuID());
        idText.setText(statisticList.get(i).getUserID());
        menuText.setText(statisticList.get(i).getMenuName());
        amountText.setText(statisticList.get(i).getMenuAmount()+"개");



        v.setTag(statisticList.get(i).getUserID());

        return v;
    }


}