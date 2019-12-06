package com.example.employeepayrollsystem.ui.Employees;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.employeepayrollsystem.Interface.DataFromAddEmployeeFragment;
import com.example.employeepayrollsystem.R;

public class PartTimeFragment extends Fragment implements DataFromAddEmployeeFragment {
    TextView name;
    TextView age;
    RadioGroup gender;
    TextView dateOfBirth;
    RadioGroup vehicle;
    TextView ratePerHour;
    TextView numberOfHours;
    RadioGroup parttimeType;
    FragmentManager fragmentManager;



    private OnFragmentInteractionListener mListener;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.ratePerHour = view.findViewById(R.id.text_rateper_hour);
        this.numberOfHours = view.findViewById(R.id.text_number_of_hours);
        this.fragmentManager = getActivity().getSupportFragmentManager();
        this.parttimeType = getActivity().findViewById(R.id.radio_group_parttime_type);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_part_time, container, false);
    }

    @Override
    public void getViewsFromAddEmployeeFragment(TextView name, TextView age,
                                                RadioGroup gender, TextView date, RadioGroup vehicle) {
        this.name =name;
        this.age=age;
        this.dateOfBirth=date;
        this.vehicle = vehicle;

    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
