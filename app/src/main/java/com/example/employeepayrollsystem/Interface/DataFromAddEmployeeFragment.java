package com.example.employeepayrollsystem.Interface;

import android.widget.RadioGroup;
import android.widget.TextView;

public interface DataFromAddEmployeeFragment {
    void getViewsFromAddEmployeeFragment(TextView id, TextView name, TextView age,
                                          TextView date, RadioGroup vehicle);
}
