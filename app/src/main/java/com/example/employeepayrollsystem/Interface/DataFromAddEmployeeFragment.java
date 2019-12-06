package com.example.employeepayrollsystem.Interface;

import android.widget.RadioGroup;
import android.widget.TextView;

public interface DataFromAddEmployeeFragment {
    void getViewsFromAddEmployeeFragment(TextView name, TextView age,
                                         RadioGroup gender, TextView date, RadioGroup vehicle);
}
