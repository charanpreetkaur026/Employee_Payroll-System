package com.example.employeepayrollsystem.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeepayrollsystem.R;
import com.example.employeepayrollsystem.models.Employee;

import java.util.ArrayList;

public class AdapterforRecyclerView extends RecyclerView.Adapter<AdapterforRecyclerView.ViewHolder> {
    public interface SetCustomClickListener{
        void customOnClick(Employee e);
    }
    ArrayList<Employee> arrayList;
    Context context;
    SetCustomClickListener listener;


    public AdapterforRecyclerView(ArrayList<Employee> arrayList, Context context, SetCustomClickListener listener) {
        this.arrayList = arrayList;
        this.context = context;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(R.layout.layout_employee_cell, viewGroup , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bind(this.arrayList.get(i), this.listener);
    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }

    class ViewHolder extends  RecyclerView.ViewHolder{

        TextView name;
        TextView age;
        TextView id;
        public ViewHolder(@NonNull View View) {
            super(View);
            id = itemView.findViewById(R.id.emp_Id);
            name = itemView.findViewById(R.id.emp_name);
            age = itemView.findViewById(R.id.emp_age);

        }

        public  void bind(final Employee e , final SetCustomClickListener listener)
        {
            Log.e("TAG", "adapter showing name");
            id.setText("Employee ID: " + e.getId());
            name.setText("Name : "+e.getName());
            age.setText("Age : "+e.getAge());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.customOnClick(e);
                }
            });
        }
    }
}
