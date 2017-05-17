package com.example.leonardo.testandroidglushko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {
    Button  registration2;
    EditText mail2, pass2, pass3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        registration2 = (Button) findViewById(R.id.reg2);

        mail2 = (EditText) findViewById(R.id.mail2);
        pass2 = (EditText) findViewById(R.id.pass2);
        pass3 = (EditText) findViewById(R.id.pass3);

    }


    public void clickRegistration(View view) {
        if (mail2.length()>=6 & pass2.length()>=4 & pass3.length()>=4 & pass2.getText().toString().equals(pass3.getText().toString()))

        {Intent intent = new Intent(this, StartActivity.class);
            startActivity(intent);}

        else{
            Toast toast = Toast.makeText(this, "Аккаунт уже существует или неверно ввведены логин и пароль",Toast.LENGTH_LONG);
            toast.show();}
    }
}
