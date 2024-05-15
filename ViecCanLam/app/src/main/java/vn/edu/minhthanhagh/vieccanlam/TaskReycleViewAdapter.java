package vn.edu.minhthanhagh.vieccanlam;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskReycleViewAdapter extends RecyclerView.Adapter {

    //nguồn dữ liệu
    List<TASKS> dataSource;

    public TaskReycleViewAdapter(List<TASKS> dataSource) {
        this.dataSource = dataSource;
    }

    //
    public class TaskItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvTenVCL;
        TextView tvNgayHetHan;

        //lưu vị trí phần tử
        public int  position;
        public TaskItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
      tvTenVCL = itemView.findViewById(R.id.textViewTenVCL);
       tvNgayHetHan = itemView.findViewById(R.id.textViewThoiGian);


        }

        @Override
        public void onClick(View v) {
        //lấy vị trí
            int vtClicked  = getAdapterPosition();
            //lục nguồn dữ liệu
       TASKS taskClicked = dataSource.get(vtClicked);
       //xử lí gì đó
            Toast.makeText(v.getContext(), "" +  taskClicked.getName(), Toast.LENGTH_SHORT).show();
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //nạp layout
   View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
    TaskItemViewHolder viewHolder = new TaskItemViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        TaskItemViewHolder viewHolder = (TaskItemViewHolder) holder;
        //ép kiểu

        viewHolder.position = position;
        TASKS task = dataSource.get(position);
        ((TaskItemViewHolder)holder).tvTenVCL.setText(task.getMessage());
        ((TaskItemViewHolder)holder).tvNgayHetHan.setText(task.getDate());

    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}
