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
import com.example.employeepayrollsystem.models.FixedBasedPartTime;
import com.example.employeepayrollsystem.models.Motorcycle;
import com.example.employeepayrollsystem.models.Singleton;
import com.example.employeepayrollsystem.models.Vehicle;

import org.w3c.dom.Text;

public class FixedBasedFragment extends Fragment implements DataFromPartTimeFragment {

    TextView name, txtId;
    TextView age, txtDateOfBirth;
    RadioGroup gender;
    TextView ratePerHour;
    TextView numberOfHours;
    TextView dateOfBirth;
    RadioGroup vehicle;

    TextView fixedamount;
    Button btnAddEmployee;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fixed_based, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.fixedamount = view.findViewById(R.id.text_fixamount);


        this.btnAddEmployee = view.findViewById(R.id.btn_add_fixed_based);
        this.btnAddEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( !fixedamount.getText().toString().isEmpty() && !ratePerHour.getText().toString().isEmpty() && !numberOfHours.getText().toString().isEmpty() && !name.getText().toString().isEmpty() &&  !age.getText().toString().isEmpty() && !(gender.getCheckedRadioButtonId() == -1)) {
                    double fixedamount_double = Double.parseDouble(fixedamount.getText().toString());
                    float rate_float = Float.parseFloat(ratePerHour.getText().toString());
                    float hours_float = Float.parseFloat(numberOfHours.getText().toString());
                    String birthyear_int = txtDateOfBirth.getText().toString();
                    int id_int = Integer.parseInt(txtId.getText().toString());
                    String name_string = name.getText().toString();
                    int age_int = Integer.parseInt(age.getText().toString().substring(6));
                    Vehicle vehicle_Vehicle = null;
                    switch (vehicle.getCheckedRadioButtonId()) {
                        case R.id.radio_car:
                            vehicle_Vehicle = new Car("", "", "");
                            break;
                        case R.id.radio_motorCycle:
                            vehicle_Vehicle = new Motorcycle("", "", "");
                            break;

                    }

                    Singleton.getSingletonObjObj().addtoList(new FixedBasedPartTime(id_int, name_string,birthyear_int, rate_float,hours_float,fixedamount_double,vehicle_Vehicle));
                    Toast.makeText(getActivity(), "Employee Added", Toast.LENGTH_LONG).show();
                    fixedamount.setText(null);
                    ratePerHour.setText(null);
                    numberOfHours.setText(null);
                    name.setText(null);
                    age.setText(null);
                    dateOfBirth.setText("DateOfBirth : YYYY/MM/DD");
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
        this.name= name;
        this.age = age;
        this.ratePerHour = ratePerHour;
        this.numberOfHours = numberOfHours;
        this.dateOfBirth = dateOfBirth;
        this.vehicle = vehicle;

    }
}
