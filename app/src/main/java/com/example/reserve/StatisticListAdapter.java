package com.example.reserve;

import android.content.Context;
import android.view.Menu;

import androidx.fragment.app.Fragment;

import java.util.List;

public class StatisticListAdapter {

    private Context context;
    private List<Menu> menuList;
    private Fragment parent;

    public StatisticListAdapter(Context context, List<Menu> menuList, Fragment parent) {
        this.context = context;
        this.menuList = menuList;
        this.parent = parent;
    }


}