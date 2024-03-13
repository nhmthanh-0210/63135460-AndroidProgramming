package com.example.vd2linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    EditText editTextSo1;
    EditText editTextSo2;

    EditText editTextSKetQua;
    Button nutCong, nutTru, ntuNhan, nutChia;


    void  Timdieukhien() {
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
         editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextSKetQua = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);

        ntuNhan = (Button) findViewById(R.id.btnNhan);

        nutChia = (Button) findViewById(R.id.btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Timdieukhien();
        // gắn bộ lắng nghe sự kiện và code xử lí cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CONG();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        // cách 2 viết inline và ẩn danh
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_TRU();
            }
        });

        ntuNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // xử lí ở đây
                XULY_NHAN();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CHIA();
            }
        });
    }


    void XULY_CONG(){
        // .lấy dữ liệu

        String So_1 =  editTextSo1.getText().toString();
        String So_2 =  editTextSo2.getText().toString();
        float   num_1 = Float.parseFloat(So_1);
        float   num_2 = Float.parseFloat(So_2);
        float tong = num_1+num_2;
        String chuoiKQ= String.valueOf(tong);
        editTextSKetQua.setText(chuoiKQ);

    }

    void XULY_TRU(){
        String So_1 =  editTextSo1.getText().toString();
        String So_2 =  editTextSo2.getText().toString();
        float   num_1 = Float.parseFloat(So_1);
        float   num_2 = Float.parseFloat(So_2);
        float Hieu = num_1-num_2;
        String chuoiKQ= String.valueOf(Hieu);
        editTextSKetQua.setText(chuoiKQ);
    }
    void XULY_NHAN(){
        String So_1 =  editTextSo1.getText().toString();
        String So_2 =  editTextSo2.getText().toString();
        float   num_1 = Float.parseFloat(So_1);
        float   num_2 = Float.parseFloat(So_2);
        float Tich = num_1*num_2;
        String chuoiKQ= String.valueOf(Tich);
        editTextSKetQua.setText(chuoiKQ);
    }

    void XULY_CHIA(){
        String So_1 =  editTextSo1.getText().toString();
        String So_2 =  editTextSo2.getText().toString();
        float   num_1 = Float.parseFloat(So_1);
        float   num_2 = Float.parseFloat(So_2);
        float Thuong = num_1/num_2;
        String chuoiKQ= String.valueOf(Thuong);
        editTextSKetQua.setText(chuoiKQ);
    }



}