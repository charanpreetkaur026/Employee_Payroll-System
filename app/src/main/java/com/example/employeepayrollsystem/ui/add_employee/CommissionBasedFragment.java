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

import com.example.employeepayrollsystem.Interface.DataFromPartTimeFragment;
import com.example.employeepayrollsystem.R;
import com.example.employeepayrollsystem.models.Car;
import com.example.employeepayrollsystem.models.CommissionbasedPartTime;
import com.example.employeepayrollsystem.models.Motorcycle;
import com.example.employeepayrollsystem.models.Singleton;
import com.example.employeepayrollsystem.models.Vehicle;

import org.w3c.dom.Text;

public class CommissionBasedFragment extends Fragment implements DataFromPartTimeFragment {

    TextView txtId, txtName;
    TextView txtAge;
    TextView txtRatePerHour;
    TextView txtNumberOfHours;
    TextView txtDateOfBirth;
    RadioGroup rgVehicle;

    TextView txtCommission;
    Button btnAddEmployee;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_commission_based, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.txtCommission = view.findViewById(R.id.text_commissionPerc);
        this.btnAddEmployee = view.findViewById(R.id.btn_add_commission_based);
        btnAddEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !txtCommission.getText().toString().isEmpty()
                        && !txtRatePerHour.getText().toString().isEmpty()
                        && !txtNumberOfHours.getText().toString().isEmpty()
                        && !txtName.getText().toString().isEmpty()
                        &&  !txtAge.getText().toString().isEmpty()) {
                    int commission_int = Integer.parseInt(txtCommission.getText().toString());
                    int rate_int = Integer.parseInt(txtRatePerHour.getText().toString());
                    float hours_float = Float.parseFloat(txtNumberOfHours.getText().toString());
                    String name_string = txtName.getText().toString();
                    int age_int = Integer.parseInt(txtAge.getText().toString());
                    int id_int = Integer.parseInt(txtId.getText().toString());

                    Vehicle vehicle_Vehicle = null;
                    switch (rgVehicle.getCheckedRadioButtonId()) {
                        case R.id.radio_car:
                            vehicle_Vehicle = new Car("", "", "");
                            break;
                        case R.id.radio_motorCycle:
                            vehicle_Vehicle = new Motorcycle("", "", "");
                            break;

                    }

                    Singleton.getSingletonObjObj().addtoList(new CommissionbasedPartTime
                            (id_int, name_string, age_int, commission_int, rate_int, hours_float, vehicle_Vehicle));
                    Toast.makeText(getActivity(), "Employee Added", Toast.LENGTH_LONG).show();
                    commission.setText(null);
                    ratePerHour.setText(null);
                    numberOfHours.setText(null);
                    name.setText(null);
                    age.setText(null);
                    dateOfBirth.setText(SpanningForString.forDate("DateOfBirth : YYYY/MM/DD"));
                    gender.clearCheck();
                    vehicle.clearCheck();

                }
                else
                {
                    Toast.makeText(getActivity(), "No field can be empty and unselected" , Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    @Override
    public void getViewsFromPartTimeFragment(TextView id, TextView name, TextView age, TextView ratePerHour,
                                             TextView numberOfHours, TextView dateOfBirth, RadioGroup vehicle)
    {
        this.txtId = id;
        this.txtName = name;
        this.txtAge = age;
        this.txtRatePerHour = ratePerHour;
        this.txtNumberOfHours = numberOfHours;
        this.txtDateOfBirth = dateOfBirth;
        this.rgVehicle = vehicle;

    }
}