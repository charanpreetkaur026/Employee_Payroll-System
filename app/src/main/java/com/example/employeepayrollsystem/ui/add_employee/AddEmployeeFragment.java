package com.example.employeepayrollsystem.ui.add_employee;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.employeepayrollsystem.R;

public class AddEmployeeFragment extends Fragment implements View.OnClickListener{



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_add_employee, container, false);
        final TextView textView = root.findViewById(R.id.text_add_employee);
        Log.e("TAG", "AddEmployeeFragment");
        return root;
    }

    @Override
    public void onClick(View v) {

    }
}