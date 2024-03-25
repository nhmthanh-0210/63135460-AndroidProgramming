package ntu.nguyenhominhthanh_63135460.cau2_appsanpham;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

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

        ListView lvDSSanPham = (ListView) findViewById(R.id.LVDSSP);
        // chuẩn bị dữ liệu
        ArrayList<SanPham> dsSanPhamm = new ArrayList<SanPham>();
        dsSanPhamm.add(new SanPham("Iphone 14", 25000000, "Apple cam kết hàng chính hãng", R.drawable.iphone));
        dsSanPhamm.add(new SanPham("Laptop Gamming", 5000000, "Laptop cấu hình cao đa tác vụ", R.drawable.laptop));
        dsSanPhamm.add(new SanPham("PC gamming", 25000, "PC với đồ họa đỉnh cao", R.drawable.maytinh1));


        SanPhamAdapter adapter =  new SanPhamAdapter(this, dsSanPhamm);
        lvDSSanPham.setAdapter(adapter);


        // bắt xử lí sự kiện

        lvDSSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // lấy phần tử được chạm

                SanPham monAnchon = dsSanPhamm.get(position);

                Toast.makeText(MainActivity.this, monAnchon.getTenSanPham(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}