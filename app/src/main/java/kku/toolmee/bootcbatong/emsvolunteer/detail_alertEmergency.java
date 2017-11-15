package kku.toolmee.bootcbatong.emsvolunteer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detail_alertEmergency extends AppCompatActivity {

    private Button btnCommit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_alert_emergency);

        //ช้อความบน toolbar
        getSupportActionBar().setTitle("รายละเอียดจุดเกิดเหตุ");

        btnCommit = (Button)findViewById(R.id.btnCommit);
        btnCommit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),alertEmergency.class);
                startActivity(intent);

            }
        });






    }
}
