package vabramov.k_trainer;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Startpage extends AppCompatActivity implements OnClickListener {

    public static K_database myAppDatabase;
    Button btn_acc;
    Button btn_trn;
    Button btn_voc;
    Button btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        myAppDatabase = Room.databaseBuilder(getApplicationContext(),K_database.class,"worddb").allowMainThreadQueries().build();
        btn_acc = (Button) findViewById(R.id.btn_acc);
        btn_acc.setOnClickListener(this);
        btn_trn = (Button) findViewById(R.id.btn_trn);
        btn_trn.setOnClickListener(this);
        btn_voc = (Button) findViewById(R.id.btn_voc);
        btn_voc.setOnClickListener(this);
        btn_exit = (Button) findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_acc:
                Intent intent = new Intent(this, account.class);
                startActivity(intent);
                break;
            case R.id.btn_trn:
                Intent intent1 = new Intent(this, training.class);
                startActivity(intent1);
                break;
            case R.id.btn_voc:
                Intent intent2 = new Intent(this, vocabulary.class);
                startActivity(intent2);
                break;
            case R.id.btn_exit:
                finish();              //потом переделать
                System.exit(0); //потом переделать
                break;
            default:
                break;
        }
    }


}
