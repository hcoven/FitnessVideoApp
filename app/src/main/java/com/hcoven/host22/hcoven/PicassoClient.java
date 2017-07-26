package com.hcoven.host22.hcoven;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


class PicassoClient {
    static void downloadImage(Context c, String url, ImageView image) {
        if(url==null ){
            Picasso.with(c).load((String) null).resize(50, 50).centerCrop().placeholder(R.drawable.mine).into(image);
        }else {
            Picasso.with(c).load(R.drawable.mine).into(image);
        }
    }
}