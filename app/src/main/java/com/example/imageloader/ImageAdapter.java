package com.example.imageloader;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    LayoutInflater inflater;
    private ImageP[] mImage;
    private Context mContext;

    public ImageAdapter(Context context, ImageP[] images) {
        mContext = context;
        mImage = images;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            ImageP image = mImage[position];
            ImageView imageView = holder.imageView;
            Glide.with(mContext)
                    .load(image.getmUrl())
                    .placeholder(R.color.white)
                    .into(imageView);
    }

    @Override
    public int getItemCount() {
        return mImage.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_photo);
        }

    }

}
