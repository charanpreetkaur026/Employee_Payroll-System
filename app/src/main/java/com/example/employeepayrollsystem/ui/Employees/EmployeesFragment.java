package com.example.employeepayrollsystem.ui.Employees;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeepayrollsystem.R;
import com.example.employeepayrollsystem.ui.ContactUs.SendViewModel;

import java.util.ArrayList;

public class EmployeesFragment extends Fragment {

    Context con;
    RecyclerView recyclerView;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_employees, container, false);
        final TextView textView = root.findViewById(R.id.text_employees);

        return root;
    }
}