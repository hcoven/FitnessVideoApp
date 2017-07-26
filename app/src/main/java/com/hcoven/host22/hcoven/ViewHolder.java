package com.hcoven.host22.hcoven;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView Title;
        private final TextView Level;
        private final TextView Duration;
        private final TextView Description;
        private final ImageView Image;



    public ViewHolder(View itemView) {
        super(itemView);
        Title = (TextView) itemView.findViewById(R.id.title);
            Level= (TextView) itemView.findViewById(R.id.level);
            Duration = (TextView) itemView.findViewById(R.id.duration);
            Description= (TextView) itemView.findViewById(R.id.description);
            Image= (ImageView) itemView.findViewById(R.id.image);

        }

        public void setTitle(String title) {
            Title.setText(title);
        }

        public void setLevel(String level) {
            Level.setText(level);
        }
        public void setDuration(String duration) {
            Duration.setText(duration);
        }

        public void setDescription(String description) {
            Description.setText(description);
        }



    }