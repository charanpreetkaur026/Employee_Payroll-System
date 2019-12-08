package com.example.employeepayrollsystem.ui.help;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.employeepayrollsystem.R;

public class HelpFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

       // View root = inflater.inflate(R.layout.fragment_help, container, false);
        //View root = inflater.inflate(showAlert(), container,false);
        //final TextView textView = root.findViewById(R.id.text_about_us);
        Log.e("TAG", "HelpFragment");
        showAlert();

        return null;
    }
    //com/example/fragmentexample/SecondActivity.java:69
    public void showAlert(){
        androidx.appcompat.app.AlertDialog.Builder alertDailogBuilder = new androidx.appcompat.app.AlertDialog.Builder(getActivity());
        // alertDailogBuilder.setIcon(R.drawable.);
        alertDailogBuilder.setTitle("Contact Us ");
        alertDailogBuilder.setMessage("Drop an Email at: admin@payroll.com");
        alertDailogBuilder.setMessage("Drop an Email at: admin@payroll.com\n" +
                "Comapny Direct: (+1)234-567-89999");
        alertDailogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish();
            }
        });
        alertDailogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog mAlertDialog = alertDailogBuilder.create();
        mAlertDialog.show();
    }
}