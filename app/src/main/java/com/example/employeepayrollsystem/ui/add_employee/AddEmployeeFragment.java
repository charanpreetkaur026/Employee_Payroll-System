package com.example.employeepayrollsystem.ui.add_employee;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.employeepayrollsystem.DatePickerFragment;
import com.example.employeepayrollsystem.R;
import com.example.employeepayrollsystem.ui.Employees.FullTimeFragment;
import com.example.employeepayrollsystem.ui.Employees.InternFragment;
import com.example.employeepayrollsystem.ui.Employees.PartTimeFragment;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AddEmployeeFragment extends Fragment implements View.OnClickListener{
    final Calendar calendar = Calendar.getInstance();
    DatePickerDialog datePickerDialog;
    TextView text_age;
    TextView text_name;
    TextView text_date_of_birth;
    RadioGroup gender;
    RadioGroup vehicle;
    RadioGroup employementtype;
    PartTimeFragment partTimeFragment;
    FullTimeFragment fullTimeFragment;
    InternFragment internFragment;


    FragmentManager fragmentManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_add_employee, container, false);
        //final TextView textView = root.findViewById(R.id.text_add_employee);
        Log.e("TAG", "AddEmployeeFragment");
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.vehicle = view.findViewById(R.id.radio_group_vehicle);
        this.text_age = view.findViewById(R.id.text_age);
        this.text_name = view.findViewById(R.id.text_name);
        this.text_date_of_birth = view.findViewById(R.id.text_date_of_birth);
        this.employementtype = view.findViewById(R.id.radio_group_employment);
        //date picker
        this.text_date_of_birth.setOnClickListener(this);
        this.employementtype.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                FragmentTransaction fragmentTransaction;

                switch (checkedId)
                {
                    case R.id.radio_parttime :
                        if(AddEmployeeFragment.this.partTimeFragment  == null)
                        { AddEmployeeFragment.this.partTimeFragment = new PartTimeFragment();

                        }
                        fragmentTransaction = AddEmployeeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_employment, AddEmployeeFragment.this.partTimeFragment);
                        fragmentTransaction.commit();
                        Toast.makeText(AddEmployeeFragment.this.getContext(), "parttime" , Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radio_fulltime :
                        if(AddEmployeeFragment.this.fullTimeFragment  == null)
                        {
                            AddEmployeeFragment.this.fullTimeFragment = new FullTimeFragment();
                              }
                        fragmentTransaction = AddEmployeeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_employment, AddEmployeeFragment.this.fullTimeFragment);
                        fragmentTransaction.commit();
                        Toast.makeText(AddEmployeeFragment.this.getContext(), "fulltime" , Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radio_intern :
                        if(AddEmployeeFragment.this.internFragment  == null)
                        {
                            AddEmployeeFragment.this.internFragment = new InternFragment();
                             }
                        fragmentTransaction = AddEmployeeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_employment, AddEmployeeFragment.this.internFragment);
                        fragmentTransaction.commit();
                        Toast.makeText(AddEmployeeFragment.this.getContext(), "intern" , Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

    }

    @Override
    public void onClick(View v) {
        DatePickerFragment dtfragment = new DatePickerFragment();
        dtfragment.show(getActivity().getSupportFragmentManager(), "DatePicker");

    }

}