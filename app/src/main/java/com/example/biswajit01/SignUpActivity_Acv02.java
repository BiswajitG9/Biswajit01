package com.example.biswajit01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity_Acv02 extends AppCompatActivity {

    String nameVal, mobileVal, emailVal, passwordVal, confpasswordVal;
    EditText name, mobile, email, password, confpassword;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__acv02);

        name = (EditText)findViewById(R.id.Name);
        mobile = (EditText)findViewById(R.id.Mobile);
        email = (EditText)findViewById(R.id.Email);
        password = (EditText)findViewById(R.id.Password);
        confpassword = (EditText)findViewById(R.id.ConfPassword);

        submit = (Button)findViewById(R.id.Submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameVal = name.getText().toString();
                mobileVal = mobile.getText().toString();
                emailVal = email.getText().toString();
                passwordVal = password.getText().toString();
                confpasswordVal= confpassword.getText().toString();
                Log.d("DispVal", nameVal);
                Log.d("DispVal", mobileVal);
                Log.d("DispVal", emailVal);
                Log.d("DispVal", passwordVal);
            }
        });
    }


    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onPause() {

        super.onPause();
    }


    @Override
    protected void onResume() {

        super.onResume();
    }
}