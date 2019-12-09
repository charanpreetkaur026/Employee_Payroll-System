package com.example.employeepayrollsystem.ui.employee_details;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.employeepayrollsystem.Interface.DataFromEmployeeCards;
import com.example.employeepayrollsystem.R;
import com.example.employeepayrollsystem.models.Car;
import com.example.employeepayrollsystem.models.CommissionbasedPartTime;
import com.example.employeepayrollsystem.models.Employee;
import com.example.employeepayrollsystem.models.FixedBasedPartTime;
import com.example.employeepayrollsystem.models.FullTime;
import com.example.employeepayrollsystem.models.Intern;
import com.example.employeepayrollsystem.models.PartTime;
import com.example.employeepayrollsystem.models.Vehicle;


public class EmployeeDetailsFragment extends Fragment implements DataFromEmployeeCards {
    Employee employee;
    Vehicle vehicle;
    TextView empId;
    TextView name, age, emptype, txtVehicle;
    TextView internSchool;
    CardView vehicle_card;
    TextView txtModel, txtPlate, txtMake;

    CardView parttime_card;
    CardView fulltime_card;
    CardView intern_card;
    TextView employment_type;
    TextView total_earning;
    Intern intern; FullTime fullTime; CommissionbasedPartTime commissionbasedPartTime; FixedBasedPartTime fixedBasedPartTime;

    private OnFragmentInteractionListener mListener;

    public EmployeeDetailsFragment() {
        // Required empty public constructor
    }

    public static EmployeeDetailsFragment newInstance(String param1, String param2) {
        EmployeeDetailsFragment fragment = new EmployeeDetailsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_employee_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        this.empId = view.findViewById(R.id.text_)
        this.name = view.findViewById(R.id.text_name_value);
        this.age = view.findViewById(R.id.text_age_value);
        this.emptype = view.findViewById(R.id.text_employment_type_value);
        this.txtVehicle = view.findViewById(R.id.text_vehicle_value);
        this.parttime_card = view.findViewById(R.id.parttime_card);
        this.fulltime_card = view.findViewById(R.id.fulltime_card);
        this.intern_card = view.findViewById(R.id.intern_card);
        this.employment_type = view.findViewById(R.id.text_emptype_value);
        this.total_earning = view.findViewById(R.id.text_total_earning_val);
        this.txtMake = view.findViewById(R.id.text_make_value);
        this.txtModel = view.findViewById(R.id.text_model_value);
        this.txtPlate = view.findViewById(R.id.text_plate_value);

        this.name.setText(employee.getName().toUpperCase());
        this.age.setText(employee.getAge()+"");

        this.txtVehicle.setText(employee.getVehicle() == null ? "null" : employee.getVehicle() instanceof Car ? "CAR" : "MOTER CYCLE");

            this.txtMake.setText(employee.getVehicle().getMake());
            this.txtPlate.setText(employee.getVehicle().getPlate());
            this.txtModel.setText(employee.getVehicle().getModel());

        if(employee instanceof PartTime)
        {

            fulltime_card.setVisibility(View.GONE);
            intern_card.setVisibility(View.GONE);
            TextView rate = view.findViewById(R.id.text_rate_value);
            TextView hour = view.findViewById(R.id.text_hours_value);
            TextView commission_fixedamount_value = view.findViewById(R.id.text_commission_fixedamount_value);
            TextView commission_fixedamount_label = view.findViewById(R.id.text_commission_fixedamount_label);

            rate.setText("$ "+((PartTime) employee).getRate());
            hour.setText(((PartTime) employee).getHours()+"");

            if(employee instanceof CommissionbasedPartTime)
            {
                this.employment_type.setText("COMMISSION BASED");//for header label
                this.emptype.setText("Commission Based Part Time");// for text view below age
                commission_fixedamount_label.setText("COMMISSION");
                commission_fixedamount_value.setText(((CommissionbasedPartTime) employee).getCommission()+"%");
                this.total_earning.setText("$ "+((CommissionbasedPartTime)employee).calcCommissionEarnings());

            }
            else
            {
                this.employment_type.setText("Fixed BASED");
                this.emptype.setText("Fixed Based Part Time");// for text view below age
                commission_fixedamount_label.setText("FIXED AMOUNT");
                commission_fixedamount_value.setText("$ "+((FixedBasedPartTime) employee).getFixedAmount());
                this.total_earning.setText("$ "+((FixedBasedPartTime)employee).calFixedAmountEarning());
            }

        }else if(employee instanceof FullTime){
            parttime_card.setVisibility(View.GONE);
            intern_card.setVisibility(View.GONE);
            this.employment_type.setText("FULL TIME");
            this.emptype.setText("Full Time");// for text view below age

            TextView salary = view.findViewById(R.id.text_salary_value);
            TextView bonus = view.findViewById(R.id.text_bonus_value);

            salary.setText("$ "+((FullTime) employee).getSalary());
            bonus.setText("$ "+((FullTime) employee).getBonus());
            this.total_earning.setText("$ "+ employee.calcEarning());
        }else{
            parttime_card.setVisibility(View.GONE);
            fulltime_card.setVisibility(View.GONE);
            this.employment_type.setText("INTERN");
            this.emptype.setText("Intern");// for text view below age
            this.internSchool = view.findViewById(R.id.text_school_value);
            internSchool.setText(((Intern)employee).getSchoolname());

            this.total_earning.setText("$ "+ employee.calcEarning());
        }

    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void employeeObj(Employee employee) {
        this.employee = employee;
    }


    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(Uri uri);
    }
}
