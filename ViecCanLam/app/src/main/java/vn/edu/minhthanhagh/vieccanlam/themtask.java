package vn.edu.minhthanhagh.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class themtask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_theme_task);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main4), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lấy  dũ liệu

                EditText editTextname  = findViewById(R.id.editTextTextTenCV);
                EditText editTextmessage  = findViewById(R.id.editTextMessage);
                EditText editTextpiro  = findViewById(R.id.editTextPrio);
                EditText editTextdate  = findViewById(R.id.editTextDate);

                String tenCV = editTextname.getText().toString();
                String messCV = editTextmessage.getText().toString();
                String pri = editTextpiro.getText().toString();
                String date = editTextdate.getText().toString();


                //gói vào đối tượng task

                TASKS tasks =  new TASKS(tenCV,messCV,date,pri);
                //ket noi db va them


                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = database.getReference("TASKS");

                //để thêm dữ liệu lên FB  phải có phương thức của FireBase

                String key = databaseReference.push().getKey();

                HashMap<String, Object> item = new HashMap<String, Object>();

                item.put(key, tasks.toFireBaseObject());

                //thêm vào

                databaseReference.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
//                        finish();

                        if(error  == null){
                            finish();
                        }
                    }
                });



            }
        });
    }
}