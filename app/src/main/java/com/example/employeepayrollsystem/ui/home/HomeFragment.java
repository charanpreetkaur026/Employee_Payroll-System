package com.example.employeepayrollsystem.ui.home;

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

public class HomeFragment extends Fragment {


private  TextView txtHome;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
       txtHome = root.findViewById(R.id.text_home);
        txtHome.setText(R.string.homefragment_message);
        Log.e("TAG", "HomeFragment");
        return root;
    }
}