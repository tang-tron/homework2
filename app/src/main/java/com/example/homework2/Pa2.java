package com.example.homework2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pa2);
        Intent i = getIntent();

        Button checkButton = findViewById(R.id.check);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number = findViewById(R.id.IdNumber);
                String numtext = number.getText().toString();
                String n1 = "1111111111111";
                String n2 = "2222222222222";
                if (numtext.length()==13){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Pa2.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK",null);
                    if(numtext.equals(n1)||numtext.equals(n2)){
                        dialog.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง");
                        dialog.show();
                    }
                    else{
                        dialog.setMessage("คุณไม่มีสิทธิ์เลือกตั้ง");
                        dialog.show();
                    }
                }else {
                    Toast t =Toast.makeText(Pa2.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}