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

        View root = inflater.inflate(R.layout.fragment_help, container, false);
        //final TextView textView = root.findViewById(R.id.text_about_us);
        Log.e("TAG", "HelpFragment");
        showAlert();

        return root;
    }
    //com/example/fragmentexample/SecondActivity.java:69
    private void showAlert(){
        androidx.appcompat.app.AlertDialog.Builder alertDailogBuilder = new androidx.appcompat.app.AlertDialog.Builder(getActivity());
        // alertDailogBuilder.setIcon(R.drawable.);
        alertDailogBuilder.setTitle("Back");
        alertDailogBuilder.setMessage("Are you sure to go back?");
        alertDailogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish();
            }
        });
       // alertDailogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground));
        AlertDialog mAlertDialog = alertDailogBuilder.create();
        mAlertDialog.show();
    }
}