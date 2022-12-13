package com.example.kappehub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cafe_RecyclerViewAdapter extends RecyclerView.Adapter<Cafe_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<CafeModel> cafeModels;
    private final RecyclerViewInterface recyclerViewInterface;

    public Cafe_RecyclerViewAdapter(Context context, ArrayList<CafeModel> cafeModels, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.cafeModels = cafeModels;
        this.recyclerViewInterface = recyclerViewInterface;
    }


    @NonNull
    @Override
    public Cafe_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new Cafe_RecyclerViewAdapter.MyViewHolder(view,  recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull Cafe_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.cafeName.setText(cafeModels.get(position).getCafeName());
        holder.time.setText(cafeModels.get(position).getTiming());
        holder.rate.setText(cafeModels.get(position).getRating());
        holder.imageView.setImageResource(cafeModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return cafeModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView cafeName, time, rate;

        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            cafeName = itemView.findViewById(R.id.cafeNameView);
            time = itemView.findViewById(R.id.timeTextView);
            rate = itemView.findViewById(R.id.ratingTextView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recyclerViewInterface != null){
                        int pos = getAdapterPosition();
                        if(pos !=RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
