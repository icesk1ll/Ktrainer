
package vabramov.k_trainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class vocabulary extends AppCompatActivity implements OnClickListener {
    Button btn_datab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        btn_datab = (Button) findViewById(R.id.btn_datab);
        btn_datab.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_datab:
                Intent intent = new Intent(this, Database.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}