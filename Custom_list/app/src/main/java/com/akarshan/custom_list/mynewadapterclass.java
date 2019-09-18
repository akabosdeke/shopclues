package com.akarshan.custom_list;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by akarshan on 19-08-2019.
 */
//to custmize the arry or multiple array.we are doing customize the array because we cannot set array in arrayadapter

public class mynewadapterclass extends ArrayAdapter<String>
{
    Activity activity;
    String text[];
    Integer image[];
    public mynewadapterclass(Activity activity,String text[],Integer image[])
    {
        super(activity, R.layout.custom_layout);
        this.activity=activity;
        this.image=image;
        this.text=text;

    }


    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {
        View apna_layout=activity.getLayoutInflater().inflate(R.layout.custom_layout,null);
        ImageView imageView= (ImageView) apna_layout.findViewById(R.id.imageview);
        TextView textView= (TextView) apna_layout.findViewById(R.id.t);
        imageView.setImageResource(image[position]);
        textView.setText(text[position]);

        return apna_layout;
    }
}

