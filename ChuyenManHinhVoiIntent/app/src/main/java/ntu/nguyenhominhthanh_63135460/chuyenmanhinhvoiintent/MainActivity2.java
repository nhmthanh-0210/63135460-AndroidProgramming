package ntu.nguyenhominhthanh_63135460.chuyenmanhinhvoiintent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.edtuoiiiii), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //cach 2

        //xay dung bo lang nghe va xu li
        //ta co the lam theo cach giong mainActivity


        // cach khac
        //tim doi tuong can gan bo lang nghe

        Button btnManHinh2 = findViewById(R.id.btnMH2);
        //gan bo lang nghe
        btnManHinh2.setOnClickListener(BoLangNgheChuyenMH);
        //code ngay duoi



        //khi màn hình được mở ra ta lấy về intent đã kích hoạt
        //bóc dữ liệu ra xem
        Intent thunhanduc = getIntent();
        String ten = thunhanduc.getStringExtra("tete");
        String tuoi = thunhanduc.getStringExtra("teteso");

//đưa lên điêuf khiển
        TextView tvTen = findViewById(R.id.tvHoTen);
        TextView tvTuoi = findViewById(R.id.tvTuoi);

        tvTen.setText("Họ và tên:" + ten);
        tvTuoi.setText("Tuổi:" + tuoi);
    }

    //code o day

    View.OnClickListener BoLangNgheChuyenMH = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        //xu li cu the o day
            //1 tao thu
            Intent thuKichHoatMH1 = new Intent(MainActivity2.this, MainActivity.class);
            //khong doi phan hoi
            startActivity(thuKichHoatMH1);
        }
    };

}