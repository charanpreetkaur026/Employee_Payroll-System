package com.example.employeepayrollsystem.Interface;

import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public interface DataFromPartTimeFragment {
    void getViewsFromPartTimeFragment(TextView id, TextView name, TextView age, TextView ratePerHour,
                                      TextView numberOfHours, Text dateOfBirth, RadioGroup vehicle);

}
