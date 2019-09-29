package com.example.taskinlastssession;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button login;
TextView mail;
TextView password;
EditText setMail;
EditText setPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login =findViewById(R.id.login);
        mail=findViewById(R.id.mail);
        password=findViewById(R.id.password);
        setMail=findViewById(R.id.setMail);
        setPass=findViewById(R.id.setPass);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(setMail.getText()==null||setPass.getText()==null){
                if(setPass.getText().length()==0||setMail.getText().length()==0){
                    Toast.makeText(MainActivity.this,"enter name and pass",Toast.LENGTH_SHORT).show();
                }
                else {
                    setMail.setText("");
                    setPass.setText("");
                }
            }
        });
    }
}
