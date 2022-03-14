package com.example.recview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int[] imgs;
    String[] leaderNames;
    Context context;
    private static ClickListener clickListener;

    public MyAdapter(int[] imgs, String[] leaderNames, Context context) {
        this.imgs = imgs;
        this.leaderNames = leaderNames;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.sample_layout,viewGroup,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.leadernames.setText(leaderNames[i]);
        myViewHolder.imgs.setImageResource(imgs[i]);

    }

    @Override
    public int getItemCount() {

        return leaderNames.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener, View.OnLongClickListener {
        TextView leadernames;
        ImageView imgs;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            leadernames=itemView.findViewById(R.id.leaderName);
            imgs= itemView.findViewById(R.id.imageViewId);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(),v);

        }

        @Override
        public boolean onLongClick(View v) {
            clickListener.onItemLongClick(getAdapterPosition(),v);
            return false;
        }
    }


     public interface  ClickListener{
        void onItemClick(int position ,View v);
        void onItemLongClick(int position, View v);
   }
   public void setOnItemClickListener(ClickListener clickListener)
   {
       MyAdapter.clickListener = clickListener;
   }
}
