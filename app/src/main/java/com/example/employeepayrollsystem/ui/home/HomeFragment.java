package com.example.employeepayrollsystem.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.employeepayrollsystem.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HomeFragment extends Fragment {


private  TextView txtDate;
private  TextView txtTime;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //https://stackoverflow.com/questions/5369682/how-to-get-current-time-and-date-in-android
       txtDate = root.findViewById(R.id.text_date);
       Date currentDate = new Date();
        DateFormat formatter = DateFormat.getDateInstance();
        String date = formatter.format(currentDate);
        txtDate.setText(date);

        txtTime = root.findViewById(R.id.txt_Time);
        Date currentTime = Calendar.getInstance().getTime();
        String time = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        txtTime.setText(time);

        Log.e("TAG", "HomeFragment");
        return root;
    }
}