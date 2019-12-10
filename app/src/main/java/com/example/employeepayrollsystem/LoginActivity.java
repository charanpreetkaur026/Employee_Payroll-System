package com.example.employeepayrollsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail =findViewById(R.id.edtEmail);
        edtPassword =findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        edtEmail.setText("user@employee.com");
        edtPassword.setText("s3cr3t");
        buttonClick();
    }
    public void buttonClick(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(mIntent);
//                if(edtEmail.getText().toString().trim().equals(R.string.login_email)
//                        && (edtPassword.getText().toString().trim().equals(R.string.login_password))){
//                    Intent mIntent = new Intent(LoginActivity.this, HomeActivity.class);
//                    startActivity(mIntent);
//                }else {
//                    btnLogin.setAlpha(.5f);
//                    edtEmail.setError("Please enter valid email or password");
//                    showAlert();
//                }
            }
        });
    }
    public void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        //alertDialogBuilder.setIcon(R.drawable.bb8);
        alertDialogBuilder.setTitle("Login error");


        //alertDialogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.bb8));
        AlertDialog mAlertDialog=alertDialogBuilder.create();
        mAlertDialog.show();
    }
}
