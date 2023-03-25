package com.ziad.testingvolley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private Context context;
    private List<MovieModel> list;

    public MovieAdapter(Context context, List<MovieModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MyViewHolder holder, int position) {
        MovieModel model = list.get(position);

        holder.title.setText(model.getTitle());
        holder.rating.setText(model.getRating());
        holder.year.setText(String.valueOf(model.getYear()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, rating, year;
        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.main_title);
            rating = itemView.findViewById(R.id.main_rating);
            year = itemView.findViewById(R.id.main_year);
        }
    }
}
