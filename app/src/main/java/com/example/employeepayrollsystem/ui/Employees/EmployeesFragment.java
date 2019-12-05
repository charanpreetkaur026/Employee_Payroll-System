package com.example.employeepayrollsystem.ui.Employees;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeepayrollsystem.R;
import com.example.employeepayrollsystem.adapters.AdapterforRecyclerView;
import com.example.employeepayrollsystem.models.Employee;
import com.example.employeepayrollsystem.models.Singleton;

import java.util.ArrayList;

public class EmployeesFragment extends Fragment {
    ArrayList<Employee> employees_list;
    Context con;
    RecyclerView recyclerView;
    FragmentTransaction fragmentTransaction;
    AdapterforRecyclerView adapter;





    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_employees, container, false);
        employees_list= Singleton.getSingletonObjObj().getList();
        this.recyclerView = root.findViewById(R.id.recycler_view);
        adapter = new AdapterforRecyclerView(employees_list, this.con, new AdapterforRecyclerView.SetCustomClickListener() {
            @Override
            public void customOnClick(Employee e) {
                Toast.makeText(EmployeesFragment.this.con, e.getName(), Toast.LENGTH_LONG).show();
            }
        });
        final TextView textView = root.findViewById(R.id.text_employees);

        return root;
    }
}