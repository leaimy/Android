package com.example.lab01_cau01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOK; // Nút bấm
    EditText txtInput; // Nhập liệu
    TextView txtOutput; // Xuất dữ liệu
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
    }

    private void initControl(){
        txtInput = findViewById(R.id.txtInput);
        txtOutput = findViewById(R.id.txtOutput);
        btnOK=findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = txtInput.getText().toString();
                txtOutput.setText(str);
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });


    }
}