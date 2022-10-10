package com.example.dapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public int[] imageArray={
            R.drawable.dg1,
            R.drawable.dg2,
            R.drawable.dg3,
            R.drawable.dg4,
            R.drawable.dg5,
            R.drawable.dg6,
            R.drawable.dg7,
            R.drawable.dg8,
            R.drawable.dg9,
            R.drawable.dg10,
            R.drawable.dg11,

            R.drawable.dog6,
            R.drawable.dog7,
            R.drawable.dog2,
            R.drawable.sheep,
            R.drawable.dog11,
            R.drawable.dog12,
            R.drawable.dog13,
            R.drawable.d1,
            R.drawable.d2,
            R.drawable.d3,
            R.drawable.d4
    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;

    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));
        return imageView;
    }
}
