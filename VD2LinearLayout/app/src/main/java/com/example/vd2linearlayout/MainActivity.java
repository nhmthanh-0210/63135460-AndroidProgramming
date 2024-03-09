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

    }


    //Xử lý cộng
 public    void XuLyCong(View v){
        //code xử lí
        // b1: lấy dữ liệu 2 số
        //b1.1 tìm view 2 edit text




        // b1.2: lấy dữ liệu từ 2 điều khiên
        String str1 =editTextSo1.getText().toString();
        String str2 =editTextSo2.getText().toString();

        //b1.3 chuyen tu chuoi sang so
        float so_1 = Float.parseFloat(str1);
        float so_2 = Float.parseFloat(str2);

        // tính toán

        float Tong = so_1 + so_2;

        // hiện kết quả
        String chuoiKQ = String.valueOf(Tong);
editTextSKetQua.setText(chuoiKQ);
    }

  public   void XuLyTru(View v){
        //code
        //code xử lí
        // b1: lấy dữ liệu 2 số
        //b1.1 tìm view 2 edit text




        // b1.2: lấy dữ liệu từ 2 điều khiên
        String str1 =editTextSo1.getText().toString();
        String str2 =editTextSo2.getText().toString();

        //b1.3 chuyen tu chuoi sang so
        float so_1 = Float.parseFloat(str1);
        float so_2 = Float.parseFloat(str2);

        // tính toán

        float Hieu = so_1 - so_2;

        // hiện kết quả
        String chuoiKQ = String.valueOf(Hieu);
        editTextSKetQua.setText(chuoiKQ);
    }

  public   void XuLyNhan(View v){
        //code
        //code xử lí
        // b1: lấy dữ liệu 2 số
        //b1.1 tìm view 2 edit text




        // b1.2: lấy dữ liệu từ 2 điều khiên
        String str1 =editTextSo1.getText().toString();
        String str2 =editTextSo2.getText().toString();

        //b1.3 chuyen tu chuoi sang so
        float so_1 = Float.parseFloat(str1);
        float so_2 = Float.parseFloat(str2);

        // tính toán

        float Nhan = so_1 * so_2;

        // hiện kết quả
        String chuoiKQ = String.valueOf(Nhan);
        editTextSKetQua.setText(chuoiKQ);
    }

 public    void XuLyChia(View v){
        //code
    }

}