package kku.toolmee.bootcbatong.emsvolunteer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class setPassword extends AppCompatActivity {


    private EditText editText_setPassword1,getEditText_setPassword2;
    private Button button_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setpassword);


        //ช้อความบน toolbar

        getSupportActionBar().setTitle("รหัสผ่าน");

        //ผูก
        button_password = (Button)findViewById(R.id.buttonPassword);

        //เปรี่ยนนหน้า
        button_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);

            }
        });


    }

}
