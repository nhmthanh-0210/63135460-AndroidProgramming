package ntu.nguyenhominhthanh_63135460.cau2_appsanpham;

import android.os.Bundle;
import android.widget.ListView;

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

        ListView LVdanhsachsanpham= (ListView) findViewById(R.id.LVDSSP);
        ArrayList<SanPham> dsSanPham = new ArrayList<>();
        dsSanPham.add(new SanPham("Iphone 14", 14000000, "Apple tài trợ chương trình này", R.drawable.iphone));
        dsSanPham.add(new SanPham("Laptop khủng", 20000000, "Laptop gaming mạnh mẽ", R.drawable.laptop));
        dsSanPham.add(new SanPham("PC cấu hình cao", 35000000, "Cấu hình 3050 rtx", R.drawable.maytinh1));

    }
}