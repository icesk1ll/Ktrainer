package vabramov.k_trainer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllTrain extends Fragment implements View.OnClickListener{
    private Button btn_trn_1, btn_trn_2, btn_trn_3, btn_trn_4, btn_trn_5, btn_trn_6, btn_trn_7;


    public AllTrain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_train, container, false);
        btn_trn_1 = view.findViewById(R.id.btn_trn_1);
        btn_trn_1.setOnClickListener(this);
        btn_trn_2 = view.findViewById(R.id.btn_trn_2);
        btn_trn_2.setOnClickListener(this);
        btn_trn_3 = view.findViewById(R.id.btn_trn_3);
        btn_trn_3.setOnClickListener(this);
        btn_trn_4 = view.findViewById(R.id.btn_trn_4);
        btn_trn_4.setOnClickListener(this);
        btn_trn_5 = view.findViewById(R.id.btn_trn_5);
        btn_trn_5.setOnClickListener(this);
        btn_trn_6 = view.findViewById(R.id.btn_trn_6);
        btn_trn_6.setOnClickListener(this);
        btn_trn_7 = view.findViewById(R.id.btn_trn_7);
        btn_trn_7.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view){
            switch (view.getId())
            {
                case R.id.btn_trn_1:
                    training.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Train_1()).addToBackStack(null).commit();
                    break;
                case R.id.btn_trn_2:
                    training.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Train_2()).addToBackStack(null).commit();
                    break;
                case R.id.btn_trn_3:
                    training.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Train_3()).addToBackStack(null).commit();
                    break;
                case R.id.btn_trn_4:
                    training.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Train_4()).addToBackStack(null).commit();
                    break;
                case R.id.btn_trn_5:
                    training.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Train_5()).addToBackStack(null).commit();
                    break;
                case R.id.btn_trn_6:
                    training.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Train_6()).addToBackStack(null).commit();
                    break;
                case R.id.btn_trn_7:
                    training.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Train_7()).addToBackStack(null).commit();
                    break;
            }
    }
}
