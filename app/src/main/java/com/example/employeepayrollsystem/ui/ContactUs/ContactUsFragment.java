package com.example.employeepayrollsystem.ui.ContactUs;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.employeepayrollsystem.R;

public class ContactUsFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_contactus, container, false);
        final TextView textView = root.findViewById(R.id.text_send);
        Log.e("TAG", "ContactUsFragment");
        return root;
    }
}