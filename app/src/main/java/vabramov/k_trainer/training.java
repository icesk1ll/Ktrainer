package vabramov.k_trainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class training extends AppCompatActivity implements OnClickListener {

    Button btn_trn_1;
    Button btn_trn_2;
    Button btn_trn_3;
    Button btn_trn_4;
    Button btn_trn_5;
    Button btn_trn_6;
    Button btn_trn_7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        btn_trn_1 = (Button) findViewById(R.id.btn_trn_1);
        btn_trn_1.setOnClickListener(this);
        btn_trn_2 = (Button) findViewById(R.id.btn_trn_2);
        btn_trn_2.setOnClickListener(this);
        btn_trn_3 = (Button) findViewById(R.id.btn_trn_3);
        btn_trn_3.setOnClickListener(this);
        btn_trn_4 = (Button) findViewById(R.id.btn_trn_4);
        btn_trn_4.setOnClickListener(this);
        btn_trn_5 = (Button) findViewById(R.id.btn_trn_5);
        btn_trn_5.setOnClickListener(this);
        btn_trn_6 = (Button) findViewById(R.id.btn_trn_6);
        btn_trn_6.setOnClickListener(this);
        btn_trn_7 = (Button) findViewById(R.id.btn_trn_7);
        btn_trn_7.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_trn_1:
                Intent intent = new Intent(this, Train1.class);
                startActivity(intent);
                break;
            case R.id.btn_trn_2:
                Intent intent1 = new Intent(this, Train1.class);
                startActivity(intent1);
                break;
            case R.id.btn_trn_3:
                Intent intent2 = new Intent(this, Train1.class);
                startActivity(intent2);
                break;
            case R.id.btn_trn_4:
                Intent intent3 = new Intent(this, Train1.class);
                startActivity(intent3);
                break;
            case R.id.btn_trn_5:
                Intent intent4 = new Intent(this, Train1.class);
                startActivity(intent4);
                break;
            case R.id.btn_trn_6:
                Intent intent5 = new Intent(this, Train1.class);
                startActivity(intent5);
                break;
            case R.id.btn_trn_7:
                Intent intent6 = new Intent(this, Train1.class);
                startActivity(intent6);
                break;

            default:
                break;
        }
    }

}
