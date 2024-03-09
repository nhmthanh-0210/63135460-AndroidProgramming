package com.example.hellotestvd2tinhtoan;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    public void XuLiCong(View view){
        // tìm, tham chiếu đến các điều khiển trên tập tin xml
         EditText editTextSoA =  findViewById(R.id.edta);
         EditText   editTextSoB = findViewById(R.id.edtb);
         EditText editTextKetQua = findViewById(R.id.editTextText3);

         // lấy dữ liệu về dungf phương thức getText từ số a
         String strA =   editTextSoA.getText().toString();
         //lấy từ số b
        String strB = editTextSoB.getText().toString();

        // chuyển dữ liệu sang dạng số
       int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
    // tính toán theo yêu cầu
        int Tong = so_A+ so_B;
    String strTong = String.valueOf(Tong);// chuyển sang dạng chuỗi
        // hiện ra màn hình
        editTextKetQua.setText(strTong);


    }
}