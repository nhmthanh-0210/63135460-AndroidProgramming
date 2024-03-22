package com.example.listviewtinhthanh;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> danhsachTinhthanh;
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

// để lấy được thông tin ra bộ xử lí lắng nghe thì phải chuyển  tạo list ra ngoài hàm oncreate
        // đã chuyển
        danhsachTinhthanh = new ArrayList<String>();
        danhsachTinhthanh.add("Khánh Hòa");
        danhsachTinhthanh.add("Lâm Đồng");
        danhsachTinhthanh.add("Cà Mau");


        ArrayAdapter<String> tinhthanhadapter;
        tinhthanhadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, danhsachTinhthanh);


        ListView lvdanhsachtinh = findViewById(R.id.LVDSCN);

        lvdanhsachtinh.setAdapter(tinhthanhadapter);

        // code lắng nghe và xử lí
        lvdanhsachtinh.setOnItemClickListener(Bolangnghevaxuly);

    }


 AdapterView.OnItemClickListener Bolangnghevaxuly = new AdapterView.OnItemClickListener() {
     @Override
     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // lấy thông tin list sau khi đã chuyển ArrayList Ra ngoài

         // gán thôg thin lấy vào 1 cái biến (String)

         String thanhbinh = danhsachTinhthanh.get(position);
        Toast.makeText(MainActivity.this, thanhbinh, Toast.LENGTH_SHORT).show();



         // hàm lấy vị trí
//         Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
     }
 };



}