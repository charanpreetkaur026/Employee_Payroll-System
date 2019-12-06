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
        this.employementtype.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                FragmentTransaction fragmentTransaction;

                switch (checkedId)
                {
                    case R.id.radio_parttime :
                        if(AddEmployeeFragment.this.partTimeFragment  == null)
                        {
                            AddEmployeeFragment.this.partTimeFragment = new PartTimeFragment();

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
//        DatePickerBox();

    }
//    public void DatePickerBox(){
//        //https://github.com/charanpreetkaur026/C0766112_F2019_MAD3125_MidTerm/blob/master/app/src/main/java/com/example/c0766112_f2019_mad3125_midterm/MainActivity.java
//        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int monthOfYear,
//                                  int dayOfMonth) {
//                calendar.set(Calendar.YEAR, year);
//                calendar.set(Calendar.MONTH, monthOfYear);
//                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
//                dateFormat();
//            }
//        };
//        text_date_of_birth.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new DatePickerDialog(AddEmployeeFragment.this, date, calendar.get(Calendar.YEAR),
//                        calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
//            }
//        });
//        text_date_of_birth.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new DatePickerDialog(AddEmployeeFragment.this, date, calendar
//                        .get(Calendar.YEAR), calendar.get(Calendar.MONTH),
//                        calendar.get(Calendar.DAY_OF_MONTH)).show();
//            }
//        });

    //}
    private String dateFormat() {
        //https://stackoverflow.com/questions/14933330/datepicker-how-to-popup-datepicker-when-click-on-edittext
        String myFormat = "dd-MMM-yyyy"; //In which you need put here
        java.text.SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        text_date_of_birth.setText(sdf.format(calendar.getTime()));


        LocalDate l = LocalDate.of(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated


        String n1=String.valueOf(diff.getYears());
        String n2=String.valueOf(diff.getMonths());
        String n3=String.valueOf(diff.getDays());
        String age="Age: \t"+ n1 +" Years "+ n2 +" Months "+ n3 +" Days ";
        text_age.setText(age);
        return  n1;

    }
}