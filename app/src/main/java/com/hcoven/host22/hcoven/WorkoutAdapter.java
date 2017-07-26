package com.hcoven.host22.hcoven;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Adini on 6/29/2017.
 */

@SuppressWarnings("ALL")
public class WorkoutAdapter extends ArrayAdapter {
    private List<VideoModel> videoModels;
    private int resource;
    private LayoutInflater inflater;
    Context c;

    public WorkoutAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<VideoModel> objects) {
        super(context, resource, objects);
        videoModels = objects;
        this.resource = resource;
    }



    public WorkoutAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }
    @Override
    public int getCount() {
        return videoModels.size();
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (inflater == null){
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null){
            convertView = inflater.inflate(R.layout.workout_listview_items, null);
        }
        ImageView Image;
        TextView Title;
        TextView Level;
        TextView Duration;
        TextView Description;
        Image = (ImageView) convertView.findViewById(R.id.image);
        Title = (TextView) convertView.findViewById(R.id.title);
        Level = (TextView) convertView.findViewById(R.id.level);
        Duration = (TextView) convertView.findViewById(R.id.duration);
        Description = (TextView) convertView.findViewById(R.id.description);

        Title.setText(videoModels.get(position).getTitle());
        Level.setText("Level:" + videoModels.get(position).getLevel());
        Duration.setText("Duration:" + videoModels.get(position).getDuration());
        Description.setText(videoModels.get(position).getDescription());

        return convertView;
    }



}
