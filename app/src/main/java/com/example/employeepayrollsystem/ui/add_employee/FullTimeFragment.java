package com.example.employeepayrollsystem.ui.add_employee;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.employeepayrollsystem.Interface.DataFromAddEmployeeFragment;
import com.example.employeepayrollsystem.R;
import com.example.employeepayrollsystem.models.Car;
import com.example.employeepayrollsystem.models.FullTime;
import com.example.employeepayrollsystem.models.Motorcycle;
import com.example.employeepayrollsystem.models.Singleton;
import com.example.employeepayrollsystem.models.Vehicle;


public class FullTimeFragment extends Fragment implements DataFromAddEmployeeFragment {
    TextView txtId;
    TextView txtName;
    TextView txtAge;
    TextView txtDateOfBirth;
    RadioGroup radioVehicle;
    TextView txtSalary;
    TextView txtBonus;
    Button btnAddFullTime;
    private OnFragmentInteractionListener mListener;

    public FullTimeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_full_time, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.txtSalary = view.findViewById(R.id.text_salary);
        this.txtBonus = view.findViewById(R.id.text_bonus);


        this.btnAddFullTime = view.findViewById(R.id.btn_fulltime_employee);
        this.btnAddFullTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if( !txtBonus.getText().toString().isEmpty()
                        && !txtSalary.getText().toString().isEmpty()
                        && !txtId.getText().toString().isEmpty()
                        && !txtName.getText().toString().isEmpty()
                        &&  !txtAge.getText().toString().isEmpty()) {
                    int id_int = Integer.parseInt(txtId.getText().toString());
                    String name_string = txtName.getText().toString();
                    int age_int = Integer.parseInt(txtAge.getText().toString().substring(6));
                    int salary_int = Integer.parseInt(txtSalary.getText().toString());
                    int bonus_int = Integer.parseInt(txtBonus.getText().toString());

                    Vehicle vehicle_Vehicle = null;
                    switch (radioVehicle.getCheckedRadioButtonId()) {
                        case R.id.radio_car:
                            vehicle_Vehicle = new Car("", "", "");
                            break;
                        case R.id.radio_motorCycle:
                            vehicle_Vehicle = new Motorcycle("", "", "");
                            break;

                    }
                    Singleton.getSingletonObjObj().addtoList(new
                            FullTime(salary_int, bonus_int,id_int,name_string,age_int, vehicle_Vehicle ));
                    Toast.makeText(getActivity(), "Employee Added", Toast.LENGTH_LONG).show();
                    txtSalary.setText(null);
                    txtBonus.setText(null);
                    txtName.setText(null);
                    txtAge.setText(null);
                    txtDateOfBirth.setText("DateOfBirth : YYYY/MM/DD");
                    radioVehicle.clearCheck();
                }
                else
                {
                    Toast.makeText(getActivity(), "No field can be empty and unselected" , Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void getViewsFromAddEmployeeFragment(TextView name, TextView age, TextView date, RadioGroup vehicle) {

    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
