package com.splash.billy.makanan;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Billy on 16/01/2018.
 */

public class FragmentDetail extends Fragment {
    private TextView dtvName, dtvDescription;
    private ImageView imgItem;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_detail,null);

        imgItem = (ImageView) view.findViewById(R.id.img_item);

        dtvDescription = (TextView) view.findViewById(R.id.tvDescription);
        dtvName = (TextView) view.findViewById(R.id.tvName);

        return view;
    }
    public void displayData (Menu menu){

        String imageUrl = "http://560057.youcanlearnit.net/services/images/"+menu.getImage();
        //        Log.d("CHECK IMG Path", imageUrl);

        Glide.with (this).load(imageUrl).into(imgItem);

        dtvName.setText(menu.getItemName());
        dtvDescription.setText(menu.getDescription());
    }
}
