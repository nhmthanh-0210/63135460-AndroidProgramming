package vn.edu.minhthanhagh.vieccanlam;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // mỗi phần tử sẽ là 1 task
    List<TASKS> lstVCL;


    TaskReycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //tạo kết nối CSDL
        lstVCL = new ArrayList<TASKS>();
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("TASKS");
              //lắng nghe và xử lí


        databaseReference.addValueEventListener(ngheFB);

        //tìm điều khiển

        RecyclerView recyclerView  = findViewById(R.id.rcvVCL);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addItemDecoration( new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));



        adapter  = new TaskReycleViewAdapter(lstVCL);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }

    ValueEventListener ngheFB=    new ValueEventListener() {
        //dữ liệu được gói trong đối tươngj snapshot

        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot) {
            lstVCL.clear();
            //lấy dữ liệu từ biến snapshot, đưa vào một biến ds để xử lí
            for(DataSnapshot obj: snapshot.getChildren()){
                //mỗi snap shot sẽ lấy value của nó
                TASKS tasks =  obj.getValue(TASKS.class);
                lstVCL.add(tasks);
                //đã thực hiện xong lấy danh sách


                //quan sát
//                Log.w("VCL app", "Tên việc cần làm: " + tasks.getName());
            }
            adapter.notifyDataSetChanged();

        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {

        }
    };
}