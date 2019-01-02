package vabramov.k_trainer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class crud_database extends Fragment implements View.OnClickListener{
    private Button BnAddWord;

    public crud_database() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_crud_database,container,false);
            BnAddWord = view.findViewById(R.id.btn_add);
            BnAddWord.setOnClickListener(this);
            return view;
    }
    @Override
    public void onClick(View view){
        switch (view.getId())
        {
            case R.id.btn_add:
                Database.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddWordFragment()).addToBackStack(null).commit();
                break;
        }
    }
}