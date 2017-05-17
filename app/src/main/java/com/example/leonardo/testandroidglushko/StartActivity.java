package com.example.leonardo.testandroidglushko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.leonardo.testandroidglushko.R.id.mail2;

public class StartActivity extends AppCompatActivity {

    Button enter, registration;
    EditText mail, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        enter = (Button) findViewById(R.id.enter);
        registration = (Button) findViewById(R.id.reg1);

        mail = (EditText) findViewById(R.id.mail1);
        pass = (EditText) findViewById(R.id.pass1);


    }

    public void clickEnter(View view) {

        if (mail.length()==0 | pass.length()==0 ){

            Toast toast = Toast.makeText(StartActivity.this, "Введите логин и/или пароль",Toast.LENGTH_LONG);
            toast.show();}

        else {

            Intent intent = new Intent(StartActivity.this, EnterActivity.class);
            intent.putExtra(EnterActivity.MASS, mail.getText().toString());
            startActivity(intent);
        }




        /*if (mail==  )

        {Intent intent = new Intent(this, EnterActivity.class);
            startActivity(intent);}

        else{
            Toast toast = Toast.makeText(this, "Неверный логин и/или пароль",Toast.LENGTH_LONG);
            toast.show();}*/
    }

    public void clickReg(View view) {
        Intent intent2 = new Intent(this, RegistrationActivity.class);
        startActivity(intent2);
    }
}
