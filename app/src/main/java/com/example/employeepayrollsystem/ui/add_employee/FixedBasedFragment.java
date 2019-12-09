package com.example.employeepayrollsystem.ui.add_employee;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.employeepayrollsystem.Interface.DataFromPartTimeFragment;
import com.example.employeepayrollsystem.R;

import org.w3c.dom.Text;

public class FixedBasedFragment extends Fragment implements DataFromPartTimeFragment {

    TextView name;
    TextView age;
    RadioGroup gender;
    TextView ratePerHour;
    TextView numberOfHours;
    TextView dateOfBirth;
    RadioGroup vehicle;

    TextView fixedamount;
    Button addFixedBasedEmployee;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fixed_based, container, false);
    }
    

    @Override
    public void getViewsFromPartTimeFragment(TextView id, TextView name, TextView age, TextView ratePerHour, TextView numberOfHours, TextView dateOfBirth, RadioGroup vehicle) {

    }
}