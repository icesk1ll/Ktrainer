package vabramov.k_trainer;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class training extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static K_database myAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        fragmentManager = getSupportFragmentManager();
        myAppDatabase = Room.databaseBuilder(getApplicationContext(),K_database.class,"worddb").allowMainThreadQueries().build();
        if(findViewById(R.id.fragment_container)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container,new AllTrain()).commit();
        }
    }
}

