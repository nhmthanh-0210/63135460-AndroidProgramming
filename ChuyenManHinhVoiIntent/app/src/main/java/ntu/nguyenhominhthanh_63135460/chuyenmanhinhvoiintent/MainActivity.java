package ntu.nguyenhominhthanh_63135460.chuyenmanhinhvoiintent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.edtuoiiiii), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void ChuyenSangMH2(View v){
    /// 1. tao doi tuong intent
        Intent thuKichHoatMH2 ;


        //phai co 2 tham so, tham so 2 la man hinh chuyen toi(.class)
        thuKichHoatMH2 = new Intent(MainActivity.this, MainActivity2.class);


        //1+ gói dữ liệu vào

        EditText edtTen = findViewById(R.id.edthovaten);
        EditText edTuoi = findViewById(R.id.edttuoi);

        //1++2lấy dữ liệu từ điều khiển tương ứng
        String strTen = edtTen.getText().toString();
        String strTuoi = edTuoi.getText().toString();
//        int tuoi = Integer.parseInt(strTuoi);

        //1.3 gói vào thư, mỗi dữ liệu ta cho một cái key để bên kia dựa vào đó để bóc ra

        thuKichHoatMH2.putExtra("tete" , strTen);
        thuKichHoatMH2.putExtra("teteso" , strTuoi);


        //gui thu ma khong doi phan hoi
        startActivity(thuKichHoatMH2 );


    }
}